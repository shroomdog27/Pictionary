package org.sweetiebelle.pictionary.frames;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DisplayWindow extends JFrame {

    private static final long serialVersionUID = -1757704359109286780L;

    public DisplayWindow() {
        initComponents();
    }

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("displayWindow");
        setPreferredSize(new Dimension(500, 500));
        setResizable(false);
    }

    public void resizeWindow(int newWidth, int newHeight) {
        Dimension d = new Dimension(newWidth, newHeight);
        setPreferredSize(d);
        setSize(d);
    }

}
