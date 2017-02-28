package com.netwebx.hackerrank.rpc.server;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by apple on 2017/2/26.
 */
public class RpcExporter {
    private static Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public static void exporter(String hostname, int port) throws Exception
    {
        ServerSocket server = new ServerSocket();
        server.bind(new InetSocketAddress(hostname, port));

        try {
            while (true) {
                executor.execute(new ExporterTask(server.accept()));
            }
        } finally {
            server.close();
        }
    }
}
