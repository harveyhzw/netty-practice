package com.harvey.echoclient;

public class AppClient {
    public static void main(String[] args) throws Exception {
        new EchoClient("127.0.0.1", 8990).start();
    }
}
