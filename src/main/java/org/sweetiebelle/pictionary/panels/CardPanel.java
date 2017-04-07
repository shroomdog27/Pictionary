
package org.sweetiebelle.pictionary.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import org.sweetiebelle.pictionary.Pictionary;

public class CardPanel extends JPanel {

    private static final long serialVersionUID = -3439582449341978263L;
    private JLabel textToDisplay;
    private JButton showButton;
    private Pictionary pictionary;

    public CardPanel(Pictionary pictionary, Color background, String textToDisplay) {
        initComponents();
        this.pictionary = pictionary;
        this.setBackground(background);
        this.textToDisplay.setText(textToDisplay);
        this.textToDisplay.setVisible(false);
    }

 // @formatter:off  
    private void initComponents() {

        textToDisplay = new JLabel();
        showButton = new JButton();

        setPreferredSize(new Dimension(350, 200));

        textToDisplay.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
        textToDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        textToDisplay.setOpaque(true);

        showButton.setText("SHOW");
        showButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                showButtonMouseClicked(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(textToDisplay, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(showButton)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(textToDisplay, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showButton)
                .addGap(27, 27, 27))
        );
    }// @formatter:on

    /**
     * Changes the background colour
     * 
     * @param colourToChangeTo
     *            the new colour
     */
    public void changeColor(Color colourToChangeTo) {
        setBackground(colourToChangeTo);
        textToDisplay.setBackground(colourToChangeTo);
    }

    /**
     * Changes the display text
     * 
     * @param newText
     *            the new text
     */
    public void changeDisplayText(String newText) {
        textToDisplay.setText(newText);
    }

    private void showButtonMouseClicked(MouseEvent evt) {
        textToDisplay.setVisible(true);
        showButton.setVisible(false);
        Timer timer = new Timer(1000, new ActionListener() {
            int max = 5;
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < max) {
                    count++;
                } else {
                    ((Timer) e.getSource()).stop();
                    pictionary.doneDisplaying();
                }
            }
        });
        timer.start();
    }
}
