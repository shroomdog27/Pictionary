package org.sweetiebelle.pictionary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.sweetiebelle.pictionary.windows.BlankWindow;
import org.sweetiebelle.pictionary.windows.GameWindow;
import org.sweetiebelle.pictionary.windows.MainMenu;
import org.sweetiebelle.pictionary.windows.TeamAvatarSelectionPanel;
import org.sweetiebelle.pictionary.windows.TeamNumberSelectionPanel;

public class Pictionary implements Runnable {

    private MainMenu mainMenu;
    private GameWindow gameWindow;
    private int numOfTeamTwo;
    private int numOfTeamOne;
    private TeamNumberSelectionPanel teamNumSelection;
    private TeamAvatarSelectionPanel avatarPanel;
    private Color team1Color;
    private Color team2Color;

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
        gameWindow.resizeWindow(250, 250);
        gameWindow.setContentPane(teamNumSelection);
        gameWindow.setVisible(true);
    }

    /**
     * When the team number selection is complete, this method is called.
     */
    public void setTeamNumbers(int numOfTeamOne, int numOfTeamTwo) {
        this.numOfTeamOne = numOfTeamOne;
        this.numOfTeamTwo = numOfTeamTwo;
        System.out.printf("%d %d %n", numOfTeamOne, numOfTeamTwo);
    }

    /**
     * Starts the process of getting an avatar
     */
    public void getAvatars() {
        teamNumSelection.setVisible(false);
        gameWindow.remove(teamNumSelection);
        avatarPanel = new TeamAvatarSelectionPanel(this);
        gameWindow.resizeWindow(900, 500);
        gameWindow.setContentPane(avatarPanel);
    }

    public void setTeamColours(Color team1Color, Color team2Color) {
        this.team1Color = team1Color;
        this.team2Color = team2Color;
        System.out.printf("1 is %s, 2 is %s%n", team1Color.toString(), team2Color.toString());
    }

    public void initializeBoard() {
        avatarPanel.setVisible(false);
        gameWindow.remove(avatarPanel);
      //  gameWindow.setContentPane(new BlankWindow());
    }
}
