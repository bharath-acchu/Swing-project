
// A Simple Demo of Swing Application

package Swing_application;

import javax.swing.*;


public class SwingDemo {

    SwingDemo()
    {

        //create Jframe container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        //Give the frame the initiale state
        jfrm.setSize(300,200);

        //Terminate the program when user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a text based label
        JLabel jlab = new JLabel("swing means powerful GUIs");

        //add the label to content pane
        jfrm.add(jlab);

        //display the frame
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {

        //create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new SwingDemo();
            }
        });
    }



}
