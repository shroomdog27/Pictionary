
package org.sweetiebelle.pictionary.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CardPanel extends JPanel {


    private static final long serialVersionUID = -3439582449341978263L;
    private JLabel textToDisplay;

    public CardPanel() {
        initComponents();
    }

 // @formatter:off  
    private void initComponents() {

        textToDisplay = new JLabel();

        setPreferredSize(new Dimension(350, 200));

        textToDisplay.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
        textToDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        textToDisplay.setText("");
        textToDisplay.setToolTipText("");
        textToDisplay.setOpaque(true);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(textToDisplay, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(textToDisplay, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// @formatter:on
    /**
     * Changes the background colour
     * @param colourToChangeTo the new colour
     */
    public void changeColor(Color colourToChangeTo) {
        setBackground(colourToChangeTo);
        textToDisplay.setBackground(colourToChangeTo);
    }
    /**
     * Changes the display text
     * @param newText the new text
     */
    public void changeDisplayText(String newText) {
        textToDisplay.setText(newText);
    }

}
