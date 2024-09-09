package org.example.interfaсes;

import javax.swing.*;
import java.util.HashMap;

public interface connection {
    boolean getStatus(String user);
    void setStatus(String user, boolean status);
    void getLogMessage(JTextArea logMessage);
    void setLogMessage(String message);

}
