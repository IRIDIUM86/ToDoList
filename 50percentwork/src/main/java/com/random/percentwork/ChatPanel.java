package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ChatPanel extends JPanel {
    public ChatPanel(){

        // Set layout
        this.setLayout(new BorderLayout());

        // Create Child Panel
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(333,50));

         // Child panel components declaration
        JLabel ChatLabel = new JLabel("Child Panel is working");
            
        // Add components
        this.add(ChatLabel);

        // draw the functionalities
        drawMessageBar();
        drawChatHistory();
        
    }

    private void drawMessageBar(){
        MessageBar mb = new MessageBar();

        this.add(mb, BorderLayout.SOUTH);
    }

    private void drawChatHistory(){
        ChatArea ca = new ChatArea();

        this.add(ca, BorderLayout.CENTER);
    }
}
