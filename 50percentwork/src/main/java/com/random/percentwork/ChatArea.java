package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatArea extends JPanel {
    // Declare this at the TOP so the whole class can use it later
    private JTextArea chats; 
    
    public ChatArea(){
        // Set the layout of the panel itself
        chats = new JTextArea();
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);

        // Setup the text area
        setupChatHistory();
    }

    private void setupChatHistory() {
        chats.setLineWrap(true);
        chats.setWrapStyleWord(true);
        chats.setEditable(false); 

        // Put the JTextArea INSIDE the JScrollPane
        JScrollPane chatScroll = new JScrollPane(chats);
        chatScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the ScrollPane (the frame) to the class (the wall)
        this.add(chatScroll, BorderLayout.CENTER);
    }

    public void addMessage(String sender, String text) {
    // Adds new line with the sender's name and the message
    chats.append(sender + ": " + text + "\n");
    }
}