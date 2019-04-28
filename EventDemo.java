

    //handle an event in a swing program



package Event_handling;

import java.awt.*;        // contains FlowLayout class.
import java.awt.event.*;  //defines ActionListener interface and Action event class.
import javax.swing.*;



public class EventDemo {

    JLabel jlab;

    EventDemo()
    {
        //create a new JFrame container
        JFrame jfrm = new JFrame("An Event Example");

        //specify the FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        //give the frame an initial size
        jfrm.setSize(300,200);

        //Termination of the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make two buttons
        JButton jbtnalpha = new JButton("Alpha");
        JButton jbtnbeta = new JButton("Beta");

        //Add actionlistener for aplha
        jbtnalpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha was pressed");
            }
        });


        //Add actionlistener for beta
        jbtnbeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta was pressed");
            }
        });

        //Add buttons to content pane
        jfrm.add(jbtnalpha);
        jfrm.add(jbtnbeta);

        //Create a text based label
        jlab= new JLabel("Press button.");

        //Add the label to content pane
        jfrm.add(jlab);

        //Display the frame
        jfrm.setVisible(true);

    }


    public static void main(String[] args) {
        //create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });



    }

}
