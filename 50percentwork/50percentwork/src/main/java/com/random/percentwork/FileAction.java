package com.random.percentwork;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileAction extends JPanel{

    public FileAction(){
        // Make child panel
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GRAY);

        // Make components
        JButton addFileButton = new JButton("Add");
        JButton openFileButton = new JButton("Open");
        JButton deleteFileButton = new JButton("Delete");

        // Adding components
        this.add(addFileButton);
        this.add(openFileButton);
        this.add(deleteFileButton);

        // Button listeners
        addFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("Add button is working");
                }
            }
        );

        openFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("Open button is working");
                }
            }
        );

        deleteFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("Delete button is working");
                }
            }
        );
    }

}
