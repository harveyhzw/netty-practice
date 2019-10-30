package com.harvey.echoserver;

public class AppServer {
    public static void main(String[] args) throws Exception{
        new EchoServer(8990).start();
    }
}
