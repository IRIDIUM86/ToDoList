package com.random.percentwork;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilePanel extends JPanel{
    public FilePanel(){
        // Create Child Panel
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(333,50));

        // Child panel components declaration
        JLabel ChatLabel = new JLabel("Child Panel is working");
            
        // Add components
        this.add(ChatLabel);
    }
}
