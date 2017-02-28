package com.netwebx.hackerrank.rpc;

import com.netwebx.hackerrank.rpc.client.RpcImporter;
import com.netwebx.hackerrank.rpc.server.EchoService;
import com.netwebx.hackerrank.rpc.server.EchoServiceImpl;
import com.netwebx.hackerrank.rpc.server.RpcExporter;

import java.net.InetSocketAddress;

/**
 * Created by apple on 2017/2/28.
 */
public class RpcTest {
    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    RpcExporter.exporter("localhost", 8088);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("localhost", 8088));
        System.out.println(echo.echo("Are you ok?"));
    }
}
