package org.sweetiebelle.pictionary.windows;

import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DisplayWindow extends JFrame {

    private static final long serialVersionUID = -1757704359109286780L;
    public DisplayWindow() {
        initComponents();
    }

 // @formatter:off                       
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setName("displayWindow");
        setPreferredSize(new Dimension(500, 500));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        pack();
    }// @formatter:on    

    public void resizeWindow(int newWidth, int newHeight) {
        Dimension d = new Dimension(newWidth, newHeight);
        setPreferredSize(d);
        setSize(d);
    }

}
