package org.sweetiebelle.pictionary.windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import org.sweetiebelle.pictionary.Rectangle;

import com.google.common.collect.Iterators;

public class GameWindow extends JFrame {

    private static final long serialVersionUID = -1757704359109286780L;
    // Variable, so we can change it later if we want.
    private static final int TILE_SIDE = 75;

    public GameWindow() {
        initComponents();
    }

 // @formatter:off                       
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setName("gameFrame"); // NOI18N
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

    public void setPeices() {
        ArrayList<Rectangle> tiles = new ArrayList<Rectangle>(55);
        JLabel startLabel = new JLabel();
        startLabel.setText("START");
        JLabel endLabel = new JLabel();
        BlankPanel board = new BlankPanel();
        this.setContentPane(board);
        endLabel.setText("END");
        // Calculate the end / center tile and offset
        int cX = Math.round(getHeight() / 2);
        int cY = Math.round(getWidth() / 2);
        Point center = new Point(cX, cY);
        final double offset = TILE_SIDE * Math.cos(Math.PI / 4);
        Rectangle end = getRectangle(center, offset);
        System.out.println(tiles.size());
        tiles.add(end);
        // Calculate the start tile
        Point startCenter = new Point(cX * 6 + TILE_SIDE, cY * -6 + TILE_SIDE);
        Rectangle start = getRectangle(startCenter, offset);
        tiles.add(0, start);
        // Haven't figured out the best method for creating all the tiles yet.
        for (int i = 2; i <= 55 - 1; i++) {
            int x;
            int y;
            switch (i) {
                case 2: {
                    x = cX + TILE_SIDE;
                    y = cY + TILE_SIDE;
                    tiles.add(i - 1, getRectangle(new Point(x, y), offset));
                    break;
                }
                case 3: {

                }
            }
        }
        Graphics gc = board.getGraphics();
        Iterator<Color> colours = Iterators.cycle(Color.YELLOW, Color.BLUE, new Color(245, 245, 220), Color.GREEN, Color.RED);
        // This is where we render the tiles on the board. Haven't figured out how to draw it on the window yet.
        for (int i = 0; i < tiles.size(); i++) {
            if(i == 0) {
                // Start tile
            }
            if(i == 54) {
                // end tile
            }
            Rectangle rec = tiles.get(i);
            int x = rec.getLower().x;
            int y = rec.getLower().y;
            int width = rec.getUpper().x - rec.getLower().x;
            int height = rec.getUpper().y - rec.getLower().y;
            gc.setColor(colours.next());
            gc.fillRect(x, y, width, height);
        }
    }

    private Rectangle getRectangle(Point center, double offset) {
        return new Rectangle(center.x + offset, center.y + offset, center.x - offset, center.y - offset);
    }

}
