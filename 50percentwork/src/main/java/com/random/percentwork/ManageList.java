package com.random.percentwork;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ManageList extends JPanel{
    
    public ManageList(){
        
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton addButton = new JButton("Add Task");
        JButton editButton = new JButton("Edit Task");
        JButton removeButton = new JButton("Remove Task");
        buttons.add(addButton);
        buttons.add(editButton);
        buttons.add(removeButton);
        add(buttons);
    }
}
