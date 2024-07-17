package org.example.app;

import org.example.app.Message;

public class App {
    public static void main(String[] args) {
        Message message = new Message();
        String hello = message.getMessage();
        System.out.println(hello);
    }
}
