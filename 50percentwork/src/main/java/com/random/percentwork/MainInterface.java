
package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainInterface extends JFrame {
    public MainInterface(){
        //  Setting the title for the frame
        this.setTitle("To Do List Manager");
        
        // Set if the frame is close, shut down the app 
        // (For now close it first, i'm trying to make it can run on the background)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Ensure us using BorderLayout
        this.setLayout(new BorderLayout());

        // Frame size
        this.setSize(1000,500);

        // Method call
        drawMiddleColumn();
        drawRightColumn();
        drawLeftColumn();
    }

    private void drawMiddleColumn(){
        // Component declaration
        JLabel test = new JLabel("This page is working");
        JButton testButton = new JButton("Test python connectivity");
        
        // Loading the panel
        JPanel panel = new JPanel();

        // Sets the layout into boxlayout that basically put the components vertically
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        // Adding the component
        panel.add(test);
        test.setAlignmentX(test.CENTER_ALIGNMENT);  // Align it to the center
        panel.add(testButton);
        testButton.setAlignmentX(testButton.CENTER_ALIGNMENT); // Allignt it to the center
        this.add(panel,BorderLayout.CENTER);
        
        testButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // When the button is clicked
                ConnectPython connect = new ConnectPython();
                connect.connect();
            }
        });
    }

    private void drawRightColumn(){
        ChatPanel chatpanel = new ChatPanel();

        // Put this column at the rightest part of the frame.
        this.add(chatpanel, BorderLayout.EAST);
    }

    private void drawLeftColumn(){
        FilePanel filePanel = new FilePanel();

        this.add(filePanel, BorderLayout.WEST);
    }
}
