package org.example.client;

import org.example.interfaсes.connection;

import javax.swing.*;
import java.util.HashMap;

public class CbackEnd implements connection {

    private final Boolean serverStatus;

    connection serverBackend;

    CbackEnd(connection serverBackend){
        this.serverBackend = serverBackend;
        this.serverStatus = getStatus("server");
    }
    @Override
    public boolean getStatus(String user) {
        return this.serverBackend.getStatus(user);
    }

    @Override
    public void setStatus(String user, boolean status) {

    }

    @Override
    public void getLogMessage(JTextArea logMessage) {
        serverBackend.getLogMessage(logMessage);
    }

    @Override
    public void setLogMessage(String message) {
        serverBackend.setLogMessage(message);
    }
    public void getSrvStatus(){
        System.out.println(serverStatus);
        System.out.println(this.getStatus("server"));
    }
}
