package com.random.percentwork;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ToDoList extends JPanel {

    private ManageList ml;
    JTextField timeInput;
    JTextField taskInput;
    DefaultTableModel tableModel;

    public ToDoList() {
        setLayout(new BorderLayout(10, 10));

        // ---------- TOP PANEL (INPUT) ----------
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel Title = new JLabel("To-Do List");
        Title.setFont(new Font("Times New Roman", Font.BOLD, 16));
        inputPanel.add(Title);


        // ---------- TO DO LIST (Hard Code)----------
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));

        JPanel taskRow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JCheckBox checkBox = new JCheckBox();
        JLabel timeLabel = new JLabel("08:00");
        JLabel taskLabel = new JLabel("Finish assignment");

        taskRow.add(checkBox);
        taskRow.add(timeLabel);
        taskRow.add(taskLabel);
        
        listPanel.add(taskRow);
        


        // ---------- BUTTON ACTION ----------
        ml = new ManageList();

        // ---------- LAYOUT ----------
        add(inputPanel, BorderLayout.NORTH);
        add(listPanel, BorderLayout.CENTER);
        add(ml, BorderLayout.SOUTH);
    }
}
