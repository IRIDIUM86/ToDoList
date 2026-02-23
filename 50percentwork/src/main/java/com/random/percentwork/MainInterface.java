package com.random.percentwork;

import java.awt.BorderLayout;

import javax.swing.JFrame;


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
        ToDoList todolist = new ToDoList();

        // Put this column at the center of the frame.
        this.add(todolist, BorderLayout.CENTER);
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