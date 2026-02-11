package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChatPanel extends JPanel {

    // Declare these as class fields so we can access them throughout the class
    private ChatArea ca;
    private MessageBar mb;

    public ChatPanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(333, 150));

        JLabel ChatLabel = new JLabel("AI Assistance");
        this.add(ChatLabel, BorderLayout.NORTH); // Moved to NORTH to not overlap with CENTER

        // Initialize the components
        ca = new ChatArea();
        mb = new MessageBar();

        // CONNECT THEM: Tell MessageBar what to do when a message is sent
        mb.setOnSendListener(new MessageBar.MessageListener() {
            @Override
            public void onMessageSend(String text) {
                // When message is sent, add it to the EXISTING ChatArea
                ca.addMessage("User", text);
            }
        });

        // Add them to the panel
        this.add(ca, BorderLayout.CENTER);
        this.add(mb, BorderLayout.SOUTH);
    }
}