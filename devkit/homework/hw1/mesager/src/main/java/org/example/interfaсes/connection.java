package org.example.interfaсes;

import java.util.HashMap;

public interface connection {
    boolean getStatus(String user);
    void setStatus(String user, boolean status);
    void getLogMessage(HashMap LogMessage);
    void setLogMessage(HashMap LogMessage);

}
