
package org.sweetiebelle.pictionary.panels;


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
    private JComboBox<Integer> team2Selection;
    private JLabel teamTwoLabel;
    private JButton confirmButton;
    private JComboBox<Integer> team1Selection;
    private int numOfTeamOne;
    private int numOfTeamTwo;
    private Pictionary pictionary;

    public TeamNumberSelectionPanel(Pictionary pictionary) {
        initComponents();
        this.pictionary = pictionary;
    }

 // @formatter:off 
    private void initComponents() {

        team1Selection = new JComboBox<Integer>();
        teamOneLabel = new JLabel();
        team2Selection = new JComboBox<Integer>();
        teamTwoLabel = new JLabel();
        confirmButton = new JButton();

        setMaximumSize(new java.awt.Dimension(250, 250));
        setMinimumSize(new java.awt.Dimension(250, 250));
        setPreferredSize(new java.awt.Dimension(250, 250));
        
        team1Selection.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        team1Selection.setMaximumRowCount(6);
        team1Selection.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4, 5, 6 }));
        team1Selection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                team1SelectionActionPerformed(evt);
            }
        });

        teamOneLabel.setFont(new Font("Times New Roman", 0, 14)); // NOI18N
        teamOneLabel.setText("Team One Size");
        teamOneLabel.setToolTipText("");

        team2Selection.setFont(new Font("Times New Roman", 0, 14)); // NOI18N
        team2Selection.setMaximumRowCount(6);
        team2Selection.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4, 5, 6 }));
        team2Selection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                team2SelectionActionPerformed(evt);
            }
        });

        teamTwoLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teamTwoLabel.setText("Team Two Size");
        teamTwoLabel.setToolTipText("");
        teamTwoLabel.setPreferredSize(new java.awt.Dimension(90, 17));

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
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(teamOneLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(team1Selection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(teamTwoLabel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(team2Selection, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(confirmButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamOneLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(team1Selection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamTwoLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(team2Selection, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(confirmButton)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// @formatter:on                     

    private void team1SelectionActionPerformed(ActionEvent evt) {
        numOfTeamOne = (int) team1Selection.getSelectedItem();
    }

    private void team2SelectionActionPerformed(ActionEvent evt) {
        numOfTeamTwo =  (int) team2Selection.getSelectedItem();
    }

    private void confirmButtonMouseClicked(MouseEvent evt) {
        if (numOfTeamOne == 0)
            numOfTeamOne = 2;
        if (numOfTeamTwo == 0)
            numOfTeamTwo = 2;
        pictionary.setTeamNumbers(numOfTeamOne, numOfTeamTwo);
        pictionary.getAvatars();
    }
}
