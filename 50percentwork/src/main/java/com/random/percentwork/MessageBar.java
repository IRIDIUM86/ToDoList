package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MessageBar extends JPanel {
    public MessageBar(){

        // Create panel object
        JPanel inputBar = new JPanel();

        // Set layout
        inputBar.setLayout(new BorderLayout());

        // Create Child Panel
        this.setBackground(Color.gray);

         // Child panel components declaration
        JTextField inputContainer = new JTextField(20);
        JButton inputButton = new JButton("Send");
        
        // Add components
        this.add(inputContainer);
        this.add(inputButton);
        
    }
}
