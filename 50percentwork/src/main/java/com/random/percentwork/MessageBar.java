package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MessageBar extends JPanel {
    
    // 1. Define an interface for the listener
    public interface MessageListener {
        void onMessageSend(String text);
    }

    private JTextField inputContainer;
    private MessageListener listener; // Store the listener here

    public MessageBar() {
        JPanel inputBar = new JPanel();
        inputBar.setLayout(new BorderLayout());
        this.setBackground(Color.gray);

        inputContainer = new JTextField(20);
        JButton inputButton = new JButton("Send");

        this.add(inputContainer);
        this.add(inputButton);

        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = inputContainer.getText();

                if (userInput.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(inputBar, "Cannot be left empty!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Instead of creating a NEW ChatArea, we trigger the listener
                    if (listener != null) {
                        listener.onMessageSend(userInput);
                    }
                    // Optional: Clear text field after sending
                    inputContainer.setText(""); 
                }
            }
        });
    }

    // Allow other classes to attach the listener
    public void setOnSendListener(MessageListener listener) {
        this.listener = listener;
    }
}
