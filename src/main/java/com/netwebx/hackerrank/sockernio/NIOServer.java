package com.netwebx.hackerrank.sockernio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by Jason on 2/2/17.
 */
public class NIOServer
{
    private static final int BUF_SIZE = 1024;
    private static final int PORT = 8817;
    private static final int TIMEOUT = 3000;

    /**
     * Constructor of NIOServer
     */
    public NIOServer() {
    }

    public static void main (String[] args) {
        selector();
    }

    private static void selector() {
        Selector selector = null;
        ServerSocketChannel ssc = null;

        try {
            selector = Selector.open();
            ssc = ServerSocketChannel.open();
            ssc.socket().bind(new InetSocketAddress(PORT));
            ssc.configureBlocking(false);
            ssc.register(selector, SelectionKey.OP_ACCEPT);

            while(true) {
                if (selector.select(TIMEOUT) == 0) {
                    System.out.println("===");
                    continue;
                }

                Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
                while (iter.hasNext()) {
                    SelectionKey key = iter.next();
                    if (key.isAcceptable()) {
                        renderAcceptEvent(key);
                    }

                    if (key.isReadable()) {
                        renderReadEvent(key);
                    }

                    if (key.isWritable() && key.isValid()) {
                        renderWriteEvent(key);
                    }

                    if (key.isConnectable()) {
                        System.out.println("isConnection = TRUE");
                    }

                    iter.remove();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (selector != null) {
                    selector.close();
                }
                if (ssc != null) {
                    ssc.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void renderWriteEvent(SelectionKey key) throws IOException {
        SocketChannel sc = (SocketChannel) key.channel();
        ByteBuffer buf = (ByteBuffer) key.attachment();
        buf.flip();
        while (buf.hasRemaining()) {
            sc.write(buf);
        }
        buf.compact();
    }

    private static void renderReadEvent(SelectionKey key) throws IOException {
        SocketChannel sc = (SocketChannel) key.channel();
        ByteBuffer buf = (ByteBuffer) key.attachment();
        long bytesRead = sc.read(buf);

        while (bytesRead > 0) {
            buf.flip();
            while (buf.hasRemaining()) {
                System.out.print((char)buf.get());
            }
            System.out.println();
            buf.clear();
            bytesRead = sc.read(buf);
        }

        if (bytesRead <= -1) {
            sc.close();
        }

    }

    private static void renderAcceptEvent(SelectionKey key) throws IOException {
        ServerSocketChannel ssChannel = (ServerSocketChannel) key.channel();
        SocketChannel sc = ssChannel.accept();
        sc.configureBlocking(false);
        sc.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocateDirect(BUF_SIZE));

    }

}
