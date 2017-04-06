
package org.sweetiebelle.pictionary.panels;



import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import org.sweetiebelle.pictionary.Pictionary;

public class TimeAndConfirmPanel extends JPanel {

    private static final long serialVersionUID = -1154252354133914384L;
    private JButton correctButton;
    private JLabel time;
    private Pictionary pictionary;
    private boolean alreadyCalled = false;

    public TimeAndConfirmPanel(Pictionary pic) {
        this.pictionary = pic;
        initComponents();
    }

 // @formatter:off 
    private void initComponents() {

        correctButton = new JButton();
        time = new JLabel();

        setMaximumSize(new Dimension(300, 250));
        setMinimumSize(new Dimension(300, 250));
        setPreferredSize(new Dimension(300, 250));

        correctButton.setText("CORRECT");
        correctButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                correctButtonMouseClicked(evt);
            }
        });

        time.setFont(new Font("Times New Roman", 0, 36)); // NOI18N
        time.setHorizontalAlignment(SwingConstants.CENTER);
        time.setText("60");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(correctButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(time, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(time, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(correctButton)
                .addGap(32, 32, 32))
        );
    }// @formatter:on

    private void correctButtonMouseClicked(MouseEvent evt) {
        // They pressed the button before time ran out.
        success(true);
    }

    private void success(boolean success) {
        if (alreadyCalled)
            return;
        if (success) {
            // JOptionPane.showMessageDialog(this, "You got the answer correct!", "Correct", JOptionPane.ERROR_MESSAGE);
            alreadyCalled = true;
            pictionary.cardSuccess(true);
        } else {
            JOptionPane.showMessageDialog(this, "Sorry, you ran out of time!", "Out of time", JOptionPane.ERROR_MESSAGE);
            alreadyCalled = true;
            pictionary.cardSuccess(false);
        }

    }

    public void start() {
        Timer timer = new Timer(1000, new ActionListener() {
            int min = 0;
            int count = 60;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count > min) {
                    count--;
                    time.setText("" + count);
                } else {
                    ((Timer) e.getSource()).stop();
                    success(false);
                }
            }
        });
        timer.start();
    }

}
