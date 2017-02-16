package com.netwebx.hackerrank.regex;

/**
 * Created by Jason on 2/10/17.
 */
public class MyRegex {
    public String pattern;
    public MyRegex() {
        String p1 = "([0]{0,3}|[1-9]|[0]?[1-9][0-9]|1\\d\\d|2[0-4][0-9]|25[0-5])";
        String p2 = "(\\d|[0]?[1-9][0-9]|1\\d\\d|2[0-4][0-9]|25[0-5])";
        pattern = p1 + p2 + p2 + p2;
    }
}
