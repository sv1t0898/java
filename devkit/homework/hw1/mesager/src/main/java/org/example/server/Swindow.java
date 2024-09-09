package org.example.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swindow extends JFrame{

    JPanel panBtn;
    JButton btnStart, btnStop;
    public JTextArea logMessage;
    JScrollPane scrollMessage;

    public SbackEnd backEnd;

    public Swindow(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logMessage = new JTextArea(5, 5);
        scrollMessage = new JScrollPane(logMessage);


        //scrollMessage.add(logMessage);

        backEnd = new SbackEnd();

        btnStart = new JButton("Запуск сервера.");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backEnd.srvStartStop(true);
                backEnd.setLogMessage("Старт сервер");
                backEnd.getLogMessage(logMessage);
                //logMessage.setText(logMessage.getText() + backEnd.getStatus("server") + "\n");
            }
        });

        btnStop = new JButton("Остановка сервера.");
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backEnd.srvStartStop(false);
                backEnd.setLogMessage("Stop server.");
                backEnd.getLogMessage(logMessage);
                //logMessage.setText(logMessage.getText() + backEnd.getStatus("server") + "\n");
            }
        });



        panBtn = new JPanel(new GridLayout(1,2));
        panBtn.add(btnStart);
        panBtn.add(btnStop);
        add(panBtn, BorderLayout.SOUTH);
        add(scrollMessage);

        setVisible(true);
    }

}
