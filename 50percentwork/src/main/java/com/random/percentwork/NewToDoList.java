package com.random.percentwork;

import javax.swing.JDialog;

import java.awt.FlowLayout;
import java.awt.Frame;

public class NewToDoList extends JDialog{
    public NewToDoList(Frame MainInterface) {
        super(MainInterface, "Select Date", true);

        this.setSize(300,150);
        this.setLayout(new FlowLayout());
       

    }
}
