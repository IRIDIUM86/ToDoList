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

        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String userInput = inputContainer.getText();
                
                // If empty
                if (userInput.isEmpty()){
                    // Play a beep sound
                    Toolkit.getDefaultToolkit().beep();

                    // Show the warning dialog
                    JOptionPane.showMessageDialog(
                        inputBar,
                        "Cannot be left empty!",  // The message to display
                        "Warning",                     // The title of the dialog box
                        JOptionPane.WARNING_MESSAGE    // The message type (shows a warning icon)
                    );
                }
                else{
                    String sender = "User";
                    ChatArea addmessage = new ChatArea();
                    addmessage.addMessage(sender,userInput);
                }
            }
        });
        
    }
}
