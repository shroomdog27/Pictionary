package org.sweetiebelle.pictionary;

import java.awt.Color;

import javax.swing.JPanel;

public class GameTile {

    private JPanel one;
    private JPanel parent;
    private JPanel two;

    public GameTile(JPanel parent, JPanel one, JPanel two) {
        this.parent = parent;
        this.one = one;
        this.two = two;

    }

    public void disableOne() {
        one.setVisible(false);
    }

    public void disableTwo() {
        two.setVisible(false);
    }

    public void enableOne() {
        one.setVisible(true);
    }

    public void enableTwo() {
        two.setVisible(true);
    }

    public Color getColor() {
        return parent.getBackground();
    }

    public void setOneColor(Color col) {
        one.setBackground(col);
    }

    public void setTwoColor(Color col) {
        two.setBackground(col);
    }

}
