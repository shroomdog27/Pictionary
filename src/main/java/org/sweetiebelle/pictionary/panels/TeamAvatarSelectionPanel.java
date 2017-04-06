/*
 * To change this license header, choose License Headers in Project Properties. To change this template file, choose Tools | Templates and open the template in the editor.
 */
package org.sweetiebelle.pictionary.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import org.sweetiebelle.pictionary.Pictionary;

public class TeamAvatarSelectionPanel extends JPanel {

    private static final long serialVersionUID = -3578698236168646789L;
    private Pictionary pictionary;
    private JPanel selected;
    private JPanel blackColour;
    private JPanel blueColor;
    private JButton confirmButton;
    private JPanel greenColour;
    private JPanel purpleColour;
    private JPanel redColour;
    private JLabel teamNameLabel;
    private JPanel turquoiseColour;
    private JPanel whiteColour;
    private JPanel yellowColour;
    private JPanel team1Select;
    private Color team1Color;
    private Color team2Color;

    public TeamAvatarSelectionPanel(Pictionary pictionary) {
        this.pictionary = pictionary;
        initComponents();
    }

 // @formatter:off    
    private void initComponents() {

        greenColour = new JPanel();
        blueColor = new JPanel();
        yellowColour = new JPanel();
        redColour = new JPanel();
        turquoiseColour = new JPanel();
        blackColour = new JPanel();
        whiteColour = new JPanel();
        purpleColour = new JPanel();
        teamNameLabel = new JLabel();
        confirmButton = new JButton();

        greenColour.setBackground(new Color(0, 255, 0));
        greenColour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                greenColourMouseClicked(evt);
            }
        });

        GroupLayout greenColourLayout = new GroupLayout(greenColour);
        greenColour.setLayout(greenColourLayout);
        greenColourLayout.setHorizontalGroup(
            greenColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        greenColourLayout.setVerticalGroup(
            greenColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        blueColor.setBackground(new Color(0, 0, 255));
        blueColor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                blueColorMouseClicked(evt);
            }
        });

        GroupLayout blueColorLayout = new GroupLayout(blueColor);
        blueColor.setLayout(blueColorLayout);
        blueColorLayout.setHorizontalGroup(
            blueColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        blueColorLayout.setVerticalGroup(
            blueColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        yellowColour.setBackground(new Color(255, 255, 0));
        yellowColour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                yellowColourMouseClicked(evt);
            }
        });

        GroupLayout yellowColourLayout = new GroupLayout(yellowColour);
        yellowColour.setLayout(yellowColourLayout);
        yellowColourLayout.setHorizontalGroup(
            yellowColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        yellowColourLayout.setVerticalGroup(
            yellowColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        redColour.setBackground(new Color(255, 0, 0));
        redColour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                redColourMouseClicked(evt);
            }
        });

        GroupLayout redColourLayout = new GroupLayout(redColour);
        redColour.setLayout(redColourLayout);
        redColourLayout.setHorizontalGroup(
            redColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        redColourLayout.setVerticalGroup(
            redColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        turquoiseColour.setBackground(new Color(0, 255, 255));
        turquoiseColour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                turquoiseColourMouseClicked(evt);
            }
        });

        GroupLayout turquoiseColourLayout = new GroupLayout(turquoiseColour);
        turquoiseColour.setLayout(turquoiseColourLayout);
        turquoiseColourLayout.setHorizontalGroup(
            turquoiseColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        turquoiseColourLayout.setVerticalGroup(
            turquoiseColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        blackColour.setBackground(new Color(0, 0, 0));
        blackColour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                blackColourMouseClicked(evt);
            }
        });

        GroupLayout blackColourLayout = new GroupLayout(blackColour);
        blackColour.setLayout(blackColourLayout);
        blackColourLayout.setHorizontalGroup(
            blackColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        blackColourLayout.setVerticalGroup(
            blackColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        whiteColour.setBackground(new Color(255, 255, 255));
        whiteColour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                whiteColourMouseClicked(evt);
            }
        });

        GroupLayout whiteColourLayout = new GroupLayout(whiteColour);
        whiteColour.setLayout(whiteColourLayout);
        whiteColourLayout.setHorizontalGroup(
            whiteColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        whiteColourLayout.setVerticalGroup(
            whiteColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        purpleColour.setBackground(new Color(255, 0, 255));
        purpleColour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                purpleColourMouseClicked(evt);
            }
        });

        GroupLayout purpleColourLayout = new GroupLayout(purpleColour);
        purpleColour.setLayout(purpleColourLayout);
        purpleColourLayout.setHorizontalGroup(
            purpleColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        purpleColourLayout.setVerticalGroup(
            purpleColourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        teamNameLabel.setFont(new Font("Times New Roman", 1, 36)); // NOI18N
        teamNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        teamNameLabel.setText("Team 1, Select your icon!");
        teamNameLabel.setToolTipText("");

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
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(blackColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(whiteColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(yellowColour, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(purpleColour, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(redColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(turquoiseColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(teamNameLabel, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(confirmButton)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(teamNameLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(redColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(turquoiseColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(purpleColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(blackColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(whiteColour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(confirmButton)
                .addGap(44, 44, 44))
        );
    }// @formatter:on

    private void confirmButtonMouseClicked(MouseEvent evt) {
        if (team1Select == null) {
            if (selected == null) {
                JOptionPane.showMessageDialog(this, "You have to select a team colour, team 1!");
                return;
            }
            team1Select = selected;
            team1Color = selected.getBackground();
            selected.setBackground(Color.GRAY);
            selected.setBorder(null);
            teamNameLabel.setText("Team 2, Select your icon!");
            selected = null;
            return;
        }
        if (selected == null) {
            JOptionPane.showMessageDialog(this, "You have to select a team colour, team 2!");
            return;
        }
        team2Color = selected.getBackground();
        pictionary.setTeamColours(team1Color, team2Color);
        pictionary.initializeBoard();
    }

    private void blueColorMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(blueColor))
            return;
        blueColor.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = blueColor;

    }

    private void greenColourMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(greenColour))
            return;
        greenColour.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = greenColour;
    }

    private void yellowColourMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(yellowColour))
            return;
        yellowColour.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = yellowColour;
    }

    private void redColourMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(redColour))
            return;
        redColour.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = redColour;
    }

    private void blackColourMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(blackColour))
            return;
        blackColour.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = blackColour;

    }

    private void whiteColourMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(whiteColour))
            return;
        whiteColour.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = whiteColour;
    }

    private void purpleColourMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(purpleColour))
            return;
        purpleColour.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = purpleColour;
    }

    private void turquoiseColourMouseClicked(MouseEvent evt) {
        if (checkAndDeselectOther(turquoiseColour))
            return;
        turquoiseColour.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Selected", TitledBorder.CENTER, TitledBorder.TOP));
        selected = turquoiseColour;
    }

    private boolean checkAndDeselectOther(JPanel next) {
        if (team1Select == null) {
            if (selected == null)
                return false;
            selected.setBorder(null);
            selected = null;
            return false;
        }
        if(selected == null)
            return false;
        if ( team1Select.equals(next))
            return true;
        selected.setBorder(null);
        selected = null;
        return false;
    }

}
