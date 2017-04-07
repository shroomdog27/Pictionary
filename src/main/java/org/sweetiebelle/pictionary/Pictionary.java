package org.sweetiebelle.pictionary;

import java.awt.Color;
import java.awt.EventQueue;
import java.security.SecureRandom;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.sweetiebelle.pictionary.frames.DisplayWindow;
import org.sweetiebelle.pictionary.frames.GameWindow;
import org.sweetiebelle.pictionary.frames.MainMenu;
import org.sweetiebelle.pictionary.frames.PaintingFrame;
import org.sweetiebelle.pictionary.panels.CardPanel;
import org.sweetiebelle.pictionary.panels.CoinFlipPanel;
import org.sweetiebelle.pictionary.panels.TeamAvatarSelectionPanel;
import org.sweetiebelle.pictionary.panels.TeamNumberSelectionPanel;
import org.sweetiebelle.pictionary.panels.TimeAndConfirmPanel;

public class Pictionary implements Runnable {

    public static final Color LIVING_CREATURE = Color.YELLOW;
    public static final Color OBJECT = Color.BLUE;
    public static final Color ACTION = new Color(245, 245, 220);
    public static final Color DIFFICULT = Color.GREEN;
    public static final Color ALL_PLAY = Color.RED;
    private final String[][] CARDS = { { "Elephant", "Dog", "Cat", "Donald Trump", "Morgan Freeman" }, { "Lamp", "Fan", "Pikachu" }, { "Running", "Banking", "Drawing" }, { "Amy Winehouse", "Sammy Davis Jr." } };
    private MainMenu mainMenu;
    private DisplayWindow displayWindow;
    @SuppressWarnings("unused")
    private int numOfTeamTwo;
    @SuppressWarnings("unused")
    private int numOfTeamOne;
    private TeamNumberSelectionPanel teamNumSelection;
    private TeamAvatarSelectionPanel avatarPanel;
    private Color team1Color;
    private Color team2Color;
    private GameWindow gameWindow;
    private SecureRandom random;
    private CardPanel card;
    private TimeAndConfirmPanel panel;
    private PaintingFrame paint;
    private CoinFlipPanel coinPanel;

    public Pictionary() {
        random = new SecureRandom();
        mainMenu = new MainMenu(this);
        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        } catch (final Exception e) {
            e.printStackTrace();
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
        displayWindow = new DisplayWindow();
        displayWindow.setVisible(true);
        teamNumSelection = new TeamNumberSelectionPanel(this);
        displayWindow.resizeWindow(250, 250);
        displayWindow.setContentPane(teamNumSelection);
        displayWindow.setTitle("Team Number Selection");
        displayWindow.setVisible(true);
    }

    /**
     * When the team number selection is complete, this method is called.
     */
    public void setTeamNumbers(int numOfTeamOne, int numOfTeamTwo) {
        this.numOfTeamOne = numOfTeamOne;
        this.numOfTeamTwo = numOfTeamTwo;
    }

    /**
     * Starts the process of getting an avatar
     */
    public void getAvatars() {
        teamNumSelection.setVisible(false);
        displayWindow.remove(teamNumSelection);
        avatarPanel = new TeamAvatarSelectionPanel(this);
        displayWindow.resizeWindow(900, 500);
        displayWindow.setTitle("Team Avatar Selection");
        displayWindow.setContentPane(avatarPanel);
    }

    public void setTeamColours(Color team1Color, Color team2Color) {
        this.team1Color = team1Color;
        this.team2Color = team2Color;
    }

    public void initializeBoard() {
        avatarPanel.setVisible(false);
        displayWindow.remove(avatarPanel);
        displayWindow.setVisible(false);
        gameWindow = new GameWindow(this, team1Color, team2Color, getWhoGoesFirst());
        gameWindow.setVisible(true);
    }   
    public void closeCoinWindow() {
        displayWindow.setVisible(false);
        displayWindow.remove(coinPanel);
    }

    private int getWhoGoesFirst() {
    //    final int whoGoesFirst = getRandom(1, 2);
    //    coinPanel = new CoinFlipPanel(this, whoGoesFirst);
  //      displayWindow.setVisible(true);
    //    displayWindow.setContentPane(coinPanel);
        return getRandom(1, 2);
    }

    /**
     * Returns a random integer
     * 
     * @param min
     *            minimum value, inclusive
     * @param max
     *            maximum value, inclusive
     * @return the random integer
     */
    public int getRandom(final int min, final int max) {
        return (int) ((max - min + 1) * random.nextDouble() + min);
    }

    public void doCardGame(int team, Color background) {
        displayWindow.resizeWindow(350, 200);
        displayWindow.setTitle("Card");
        card = new CardPanel(this, background, getNameFromCardType(background));
        displayWindow.setContentPane(card);
        displayWindow.setVisible(true);
        displayWindow.remove(card);
    }

    public void doneDisplaying() {
        card.setVisible(false);
        displayWindow.remove(card);
        displayWindow.setVisible(false);
        paint = new PaintingFrame();
        paint.setVisible(true);
        panel = new TimeAndConfirmPanel(this);
        displayWindow.resizeWindow(300, 250);
        displayWindow.setTitle("Timer");
        displayWindow.setContentPane(panel);
        displayWindow.setVisible(true);
        panel.start();
    }

    private String getNameFromCardType(Color type) {
        if (type.equals(LIVING_CREATURE)) {
            return CARDS[0][getRandom(0, CARDS[0].length - 1)];
        }
        if (type.equals(OBJECT)) {
            return CARDS[1][getRandom(0, CARDS[1].length - 1)];
        }
        if (type.equals(ACTION)) {
            return CARDS[2][getRandom(0, CARDS[2].length - 1)];
        }
        if (type.equals(DIFFICULT)) {
            return CARDS[3][getRandom(0, CARDS[3].length - 1)];
        }
        int ar1 = getRandom(0, CARDS.length - 1);
        return CARDS[ar1][getRandom(0, CARDS[ar1].length - 1)];
    }

    public void cardSuccess(boolean b) {
        panel.setVisible(false);
        displayWindow.remove(panel);
        displayWindow.setVisible(false);
        paint.setVisible(false);
        if (b) {
            // Do nothing, still their turn.

            if (gameWindow.currentTurn() == 1 && gameWindow.isOnEnd(1)) {
                gameWindow.victory(team1Color, team2Color, 1);
                return;
            } else if (gameWindow.currentTurn() == 2 && gameWindow.isOnEnd(2)) {
                gameWindow.victory(team1Color, team2Color, 2);
                return;
            }
            return;
        }
        if (gameWindow.currentTurn() == 1) {
            gameWindow.setTurn(2);
            return;
        }
        gameWindow.setTurn(1);
    }

}
