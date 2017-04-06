
package org.sweetiebelle.pictionary.panels;

import java.util.concurrent.Future;

import javax.swing.JOptionPane;

import org.sweetiebelle.pictionary.Pictionary;

public class TimeAndConfirmPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = -1154252354133914384L;
    private javax.swing.JButton correctButton;
    private javax.swing.JLabel time;
    private Pictionary pictionary;
    private Future<?> task;

    public TimeAndConfirmPanel(Pictionary pic) {
        this.pictionary = pic;
        initComponents();
    }

 // @formatter:off 
    private void initComponents() {

        correctButton = new javax.swing.JButton();
        time = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(300, 250));
        setMinimumSize(new java.awt.Dimension(300, 250));
        setPreferredSize(new java.awt.Dimension(300, 250));

        correctButton.setText("CORRECT");
        correctButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correctButtonMouseClicked(evt);
            }
        });

        time.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("60");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(correctButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(correctButton)
                .addGap(32, 32, 32))
        );
    }// @formatter:on

    private void correctButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (task.cancel(true)) {
            // They pressed the button before time ran out.
            JOptionPane.showMessageDialog(this, "You got the answer correct!", "Correct", JOptionPane.ERROR_MESSAGE);
            pictionary.cardSuccess(true);
        }
        // They didn't.

        JOptionPane.showMessageDialog(this, "Sorry, you ran out of time!", "Out of time", JOptionPane.ERROR_MESSAGE);
        pictionary.cardSuccess(false);
        this.setVisible(false);
    }

    public void start() {
        task = Pictionary.threads.submit(() -> {
            try {
                for (int i = 59; i <= 0; i--) {
                    Thread.sleep(1000);
                    time.setText("" + i);
                }
            } catch (InterruptedException ex) {
                // Normal Operation
            }
        });
        JOptionPane.showMessageDialog(this, "Sorry, you ran out of time!", "Out of time", JOptionPane.ERROR_MESSAGE);
        pictionary.cardSuccess(false);
        this.setVisible(false);
    }

}
