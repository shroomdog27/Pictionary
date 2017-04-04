package org.sweetiebelle.pictionary;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.sweetiebelle.pictionary.windows.GameWindow;
import org.sweetiebelle.pictionary.windows.MainMenu;
import org.sweetiebelle.pictionary.windows.TeamNumberSelectionPanel;

public class Pictionary implements Runnable {

    private MainMenu mainMenu;
    private GameWindow gameWindow;
    private int numOfTeamTwo;
    private int numOfTeamOne;
    private TeamNumberSelectionPanel teamNumSelection;

    public Pictionary() {
        mainMenu = new MainMenu(this);
        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        } catch (final Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> run());
    }

    /**
     * Executed first, this makes the main menu.
     */
    @Override
    public void run() {
        mainMenu.setVisible(true);
    }

    /**
     * When the "Start Game" button is pressed from the main menu, this method is called.
     */
    public void startGame() {
        mainMenu.setVisible(false);
        gameWindow = new GameWindow();
        gameWindow.setVisible(true);
        teamNumSelection = new TeamNumberSelectionPanel(this);
        gameWindow.setContentPane(teamNumSelection);
     //   gameWindow.update(gameWindow.getGraphics());
        gameWindow.setVisible(true);
    }

    /**
     * When the team number selection is complete, this method is called.
     */
    public void setTeamNumbers(int numOfTeamOne, int numOfTeamTwo) {
        this.numOfTeamOne = numOfTeamOne;
        this.numOfTeamTwo = numOfTeamTwo;
        teamNumSelection.setVisible(false);
        gameWindow.remove(teamNumSelection);
        System.out.printf("%d %d %n", numOfTeamOne, numOfTeamTwo);
    }
}
