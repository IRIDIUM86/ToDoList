package com.random.percentwork;

import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                // Initiate the Jframe
                MainInterface MainFrame = new MainInterface();
                
                // Set it visible
                MainFrame.setVisible(true);
            }
        });
    }
}
