package org.example.server;

import org.example.interfaсes.connection;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class SbackEnd implements connection {

    private HashMap<String, Boolean> onlineStatus = new HashMap<>();
    private HashMap<Integer, String> logMessage = new HashMap<>();

    SbackEnd(){
        this.setStatus("server", false);

    }

//    private void addStatus(String user, boolean status){
//        this.onlineStatus.put(user, status);
//    }

//    private void addMessage(String user, String message){
//        this.logMessage.put(user, message);
//    }

    @Override
    public boolean getStatus(String user) {
        return onlineStatus.get(user);
    }

    @Override
    public void setStatus(String user, boolean status) {
        this.onlineStatus.put(user, status);
    }

    @Override
    public void getLogMessage(JTextArea logMessage) {
        String entr = "";
        for(Map.Entry<Integer, String> entry : this.logMessage.entrySet()){
            entr += entry.getValue() + "\n";
        }
        logMessage.setText(entr);

    }

    @Override
    public void setLogMessage(String message) {
        this.logMessage.put(this.logMessage.size() + 1, message);
    }

    public void srvStartStop(boolean status){
        setStatus("server", status);
    }
}
