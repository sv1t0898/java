package org.example;


import org.example.server.Swindow;
import org.example.client.Cwindow;

public class Main {
    public static void main(String[] args) {
        Swindow serverWindow = new Swindow();
        Cwindow client1 = new Cwindow(serverWindow);
        Cwindow client2 = new Cwindow(serverWindow);
    }
}