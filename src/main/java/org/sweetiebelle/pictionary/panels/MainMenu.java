package org.sweetiebelle.pictionary.panels;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class MainMenu extends JPanel {

    private static final long serialVersionUID = -3343272442207698994L;

    private JButton optionsButton;
    private JLabel pictionaryLabel;
    private JButton startButton;

    public MainMenu() {
        initComponents();
    }

    // @formatter:off
    private void initComponents() {

        startButton = new JButton();
        optionsButton = new JButton();
        pictionaryLabel = new JLabel();

        startButton.setText("Start Game");
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });
        optionsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                optionsButtonMouseClicked(evt);
            }
        });

        optionsButton.setText("Options");
        optionsButton.setToolTipText("");

        pictionaryLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        pictionaryLabel.setText("Pictionary");

        final GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(optionsButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startButton, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pictionaryLabel, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(pictionaryLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
    } // @formatter:on

    private void startButtonMouseClicked(final MouseEvent evt) {
        // Open main Game Window
    }
    
    private void optionsButtonMouseClicked(final MouseEvent evt) {
        // Open a window that says there's nothing to do.
    }
}
