package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class FilePanel extends JPanel{
    private FileAction fa;
    private FileChoice fc;

    public FilePanel(){
        // Create Child Panel
        this.setLayout(new BorderLayout());
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(333,50));

        // Create Title on the panel
        JLabel filePanelTitle = new JLabel("To Do List History");
        // Child panel components declaration
        fa = new FileAction();
        fc = new FileChoice();
        
        this.add(fa, BorderLayout.SOUTH);
        this.add(fc, BorderLayout.CENTER);
        this.add(filePanelTitle,BorderLayout.NORTH);
    }
}
