package com.random.percentwork;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FileChoice extends JPanel {
    private DefaultListModel<String> listModel;
    private JList<String> stringJList;
    public FileChoice(){

        this.setLayout(new BorderLayout());
        this.setBackground(Color.LIGHT_GRAY);
        
        // 1. Initialize the DefaultListModel
        listModel = new DefaultListModel<>();

        // 2. Populate initially (optional)
        listModel.addElement("To do list 29/01/26");
        listModel.addElement("To do list 28/01/26");
        listModel.addElement("To do list 27/01/26");
        listModel.addElement("To do list 26/01/26");
        listModel.addElement("To do list 25/01/26");
        listModel.addElement("To do list 24/01/26");
        listModel.addElement("To do list 23/01/26");


        // 3. Connect to JList
        stringJList = new JList<>(listModel);
        
        // Call scroll panel
        setupFileChoiceInt();
    }

    private void setupFileChoiceInt (){
        JScrollPane fileChoiceScroll = new JScrollPane(stringJList);
        fileChoiceScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(fileChoiceScroll, BorderLayout.CENTER);
    }
}