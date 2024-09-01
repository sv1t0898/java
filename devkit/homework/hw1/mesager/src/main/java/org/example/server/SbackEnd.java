package org.example.server;

import org.example.interfaсes.connection;

import java.util.HashMap;

public class SbackEnd implements connection {

    private HashMap<String, Boolean> onlineStatus = new HashMap<>();
    private HashMap<String, String> logMessage = new HashMap<>();

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
    public void getLogMessage(HashMap LogMessage) {

    }

    @Override
    public void setLogMessage(HashMap LogMessage) {

    }

    public void srvStartStop(boolean status){
        setStatus("server", status);
    }
}
