package org.sweetiebelle.pictionary.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.sweetiebelle.pictionary.Pictionary;

public class CoinFlipPanel extends JPanel {

    private static final long serialVersionUID = 4921924685730722034L;
    private int whoGoesFirst;
    private JButton confirmButton;
    private JPanel coinPanel;
    private JLabel numberDisplay;
    private Pictionary pictionary;

    public CoinFlipPanel(Pictionary pic, int whoGoesFirst) {
        pictionary = pic;
        this.whoGoesFirst = whoGoesFirst;
        initComponents();
    }

 // @formatter:off 
    private void initComponents() {

        coinPanel = new JPanel() {
            private static final long serialVersionUID = -4592185444105247070L;

            @Override
            public void paintComponent(Graphics gc) {
                super.paintComponent(gc);
              //  gc.drawOval((int)getSize().getHeight() / 20,(int) getSize().getWidth() / 2, 25, 25);
                gc.setColor(Color.GRAY);
                gc.fillOval(0, 0, 25, 25);
            }
            
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(25, 25);
                
            }
        };
        numberDisplay = new JLabel();
        confirmButton = new JButton();

        numberDisplay.setFont(new Font("Times New Roman", 0, 14)); // NOI18N
        numberDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        numberDisplay.setText("" + whoGoesFirst);
        numberDisplay.setToolTipText("");
        numberDisplay.setForeground(Color.WHITE);

        GroupLayout jPanel1Layout = new GroupLayout(coinPanel);
        coinPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(numberDisplay, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(numberDisplay)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        confirmButton.setFont(new Font("Times New Roman", 0, 11)); // NOI18N
        confirmButton.setText("OK");
        confirmButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(coinPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(confirmButton)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(coinPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(confirmButton)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// @formatter:on

    private void confirmButtonMouseClicked(MouseEvent evt) {
       pictionary.closeCoinWindow();
    }

}
