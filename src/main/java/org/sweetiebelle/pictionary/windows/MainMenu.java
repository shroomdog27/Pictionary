package org.sweetiebelle.pictionary.windows;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import org.sweetiebelle.pictionary.Pictionary;


public class MainMenu extends JFrame {

    private static final long serialVersionUID = -8032942795169604635L;
    private JButton optionsButton;
    private JLabel pictionaryLabel;
    private JButton startButton;
    private Pictionary pictionary;

    public MainMenu(Pictionary pictionary) {
        this.pictionary = pictionary;
        initComponents();
    }

 // @formatter:off          
    private void initComponents() {

        pictionaryLabel = new JLabel();
        startButton = new JButton();
        optionsButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        pictionaryLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        pictionaryLabel.setText("Pictionary");

        startButton.setText("Start Game");
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        optionsButton.setText("Options");
        optionsButton.setToolTipText("");
        optionsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                optionsButtonMouseClicked(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pictionaryLabel, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(565, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(startButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionsButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(pictionaryLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(optionsButton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        pack();
    }// @formatter:on                       

    protected void optionsButtonMouseClicked(MouseEvent evt) {
        JOptionPane.showMessageDialog(this, "There are currently no options to edit!");

    }

    protected void startButtonMouseClicked(MouseEvent evt) {
        pictionary.startGame();
    }

}
