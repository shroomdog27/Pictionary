package org.sweetiebelle.pictionary.frames;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.sweetiebelle.pictionary.Pictionary;

public class GameWindow extends javax.swing.JFrame {

    private static final long serialVersionUID = 2872734321591378767L;
    private javax.swing.JLabel dieNumberLabel;
    private ArrayList<JPanel> panels;
    private Pictionary pictionary;
    private javax.swing.JPanel startPanel;
    private int teamNumber;
    private javax.swing.JLabel teamNumberToRollLabel;
    private int teamOnePos;
    private int teamTwoPos;

    public GameWindow(Pictionary pictionary, java.awt.Color teamOne, java.awt.Color teamTwo, int goingFirst) {
        this.pictionary = pictionary;
        initComponents();
        makeArrayFromPanels();
        moveTeamOneToPanel(startPanel);
        moveTeamTwoToPanel(startPanel);
        teamNumber = goingFirst;
        updateteamRollingText("Team " + teamNumber + ", it's your turn to roll!");
        teamOnePos = 54;
        teamTwoPos = 54;
    }

   // @formatter:off
    private void initComponents() {

    }// @formatter:on

    private void makeArrayFromPanels() {
    }

    private void moveTeamOneToPanel(javax.swing.JPanel panelToMoveTo) {

    }

    private void moveTeamTwoToPanel(javax.swing.JPanel panelToMoveTo) {

    }

    /**
     * Called when we roll the dice, this also initates a turn.
     * 
     * @param evt
     */
    @SuppressWarnings("unused")
    private void rollButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if (teamNumber == 1) {
            int number = pictionary.getRandom(1, 6);
            dieNumberLabel.setText("" + number);
            javax.swing.JPanel panelToMoveTo = panels.get(teamOnePos - number);
            teamOnePos -= number;
            moveTeamOneToPanel(panelToMoveTo);
            pictionary.doCardGame(1, panelToMoveTo.getBackground());
            updateteamRollingText("Team " + teamNumber + ", it's your turn to roll!");
            return;
        }
        if (teamNumber == 2) {
            int number = pictionary.getRandom(1, 6);
            dieNumberLabel.setText("" + number);
            javax.swing.JPanel panelToMoveTo = panels.get(teamTwoPos - number);
            teamTwoPos -= number;
            moveTeamTwoToPanel(panelToMoveTo);
            pictionary.doCardGame(2, panelToMoveTo.getBackground());
            updateteamRollingText("Team " + teamNumber + ", it's your turn to roll!");
        }
    }
    public int currentTurn() {
        return teamNumber;
    }
    
    public void setTurn(int teamTurn) {
        teamNumber = teamTurn;
    }

    private void updateteamRollingText(String newText) {
        teamNumberToRollLabel.setText(newText);
    }
}
