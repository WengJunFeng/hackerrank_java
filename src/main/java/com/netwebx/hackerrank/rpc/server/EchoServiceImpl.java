package com.netwebx.hackerrank.rpc.server;

/**
 * Created by apple on 2017/2/26.
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo (String ping) {
        return ping != null ? ping + " ---> I am OK." : "I am OK.";
    }
}
