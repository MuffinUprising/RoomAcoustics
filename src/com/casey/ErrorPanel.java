package com.casey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by casey on 5/11/15.
 */

//Error panel that pops up for input validation
public class ErrorPanel extends JPopupMenu{

    private JButton OKButton;
    private JLabel numbersOnly;

    public ErrorPanel(){
        setVisible(false);
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(300, 200));
        setFocusable(true);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        //jlabel and button
        numbersOnly = new JLabel("Please enter numbers");
        OKButton = new JButton("Ok");

        //insets
        c.insets = new Insets(5, 0, 0, 2);

        //anchor at line start
        c.anchor = GridBagConstraints.CENTER;

        c.gridx = 0;
        c.gridy = 1;
        add(numbersOnly, c);

        c.gridx = 0;
        c.gridy = 2;
        add(OKButton);

        //action listener for ok button
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

}
