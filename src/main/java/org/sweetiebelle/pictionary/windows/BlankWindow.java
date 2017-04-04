package org.sweetiebelle.pictionary.windows;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.WindowConstants;

public class BlankWindow extends javax.swing.JFrame {

    private static final long serialVersionUID = -6200650056602497689L;

    public BlankWindow() {
        initComponents();
    }

 // @formatter:off 
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000, 500));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        pack();
    }// @formatter:on    

}
