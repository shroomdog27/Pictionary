
package org.sweetiebelle.pictionary.windows;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

import org.sweetiebelle.pictionary.Pictionary;

public class TeamNumberSelectionPanel extends JPanel {


    private static final long serialVersionUID = -4768280559401707219L;
    private JLabel teamOneLabel;
    private JComboBox<String> team2Selection;
    private JLabel teamTwoLabel;
    private JButton confirmButton;
    private JComboBox<String> team1Selection;
    private int numOfTeamOne;
    private int numOfTeamTwo;
    private Pictionary pictionary;

    public TeamNumberSelectionPanel(Pictionary pictionary) {
        initComponents();
        this.pictionary = pictionary;
    }

 // @formatter:off 
    private void initComponents() {

        team1Selection = new JComboBox<String>();
        teamOneLabel = new JLabel();
        team2Selection = new JComboBox<String>();
        teamTwoLabel = new JLabel();
        confirmButton = new JButton();

        setPreferredSize(new Dimension(250, 250));

        team1Selection.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        team1Selection.setMaximumRowCount(6);
        team1Selection.setModel(new DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        team1Selection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                team1SelectionActionPerformed(evt);
            }
        });

        teamOneLabel.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        teamOneLabel.setText("Team One Size");
        teamOneLabel.setToolTipText("");

        team2Selection.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        team2Selection.setMaximumRowCount(6);
        team2Selection.setModel(new DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        team2Selection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                team2SelectionActionPerformed(evt);
            }
        });

        teamTwoLabel.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        teamTwoLabel.setText("Team Two Size");
        teamTwoLabel.setToolTipText("");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(teamOneLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(team1Selection, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(teamTwoLabel)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(team2Selection, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(confirmButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(teamTwoLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamOneLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(team1Selection, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(team2Selection))
                .addGap(27, 27, 27)
                .addComponent(confirmButton)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// @formatter:on                     

    private void team1SelectionActionPerformed(ActionEvent evt) {
        numOfTeamOne = Integer.valueOf((String) team1Selection.getSelectedItem());
    }

    private void team2SelectionActionPerformed(ActionEvent evt) {
        numOfTeamTwo = Integer.valueOf((String) team2Selection.getSelectedItem());
    }

    private void confirmButtonMouseClicked(MouseEvent evt) {
        pictionary.setTeamNumbers(numOfTeamOne, numOfTeamTwo);
        this.setVisible(false);
    }
}
