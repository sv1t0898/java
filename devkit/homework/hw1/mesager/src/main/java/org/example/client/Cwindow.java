package org.example.client;

import org.example.server.Swindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cwindow extends JFrame {

    JPanel panLogin, panMessage;
    JButton btnLogin, btnLogout, btnSend;
    JTextField fieldIp, fieldPort, fieldUser, fieldMessage;
    JPasswordField fieldPassword;
    Swindow server;
    CbackEnd clientBackend;
    JScrollPane scrollMessage;
    JTextArea logMessage;

    public Cwindow(Swindow server){

        this.server = server;
        this.clientBackend = new CbackEnd(server.backEnd);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logMessage = new JTextArea(5,5);
        scrollMessage = new JScrollPane(logMessage);

        panLogin = new JPanel(new GridLayout(2,3));
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Cwindow.this, fieldUser.getText());
            }
        });
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientBackend.getSrvStatus();
            }
        });
        fieldIp = new JTextField("127.0.0.0");
        fieldPort = new JTextField("8080");
        fieldUser = new JTextField("user name");
        fieldUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(Cwindow.this, fieldUser.getText());
                System.out.println("qeqwewqe");

            }
        });

        panMessage = new JPanel(new GridLayout(1, 2));
        btnSend = new JButton("send");
        fieldMessage = new JTextField();

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientBackend.setLogMessage("[" + fieldUser.getText() + "]: " + fieldMessage.getText());
                fieldMessage.setText("");
                clientBackend.getLogMessage(logMessage);
            }
        });

        fieldPassword = new JPasswordField();
        panLogin.add(fieldIp);
        panLogin.add(fieldPort);
        panLogin.add(btnLogout);
        panLogin.add(fieldUser);
        panLogin.add(fieldPassword);
        panLogin.add(btnLogin);



        panMessage.add(fieldMessage);
        panMessage.add(btnSend);

        add(panLogin, BorderLayout.NORTH);
        add(panMessage, BorderLayout.SOUTH);
        add(scrollMessage);

        setVisible(true);
    }
}
