package org.sweetiebelle.pictionary;

import java.awt.Color;
import java.awt.EventQueue;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.sweetiebelle.pictionary.frames.DisplayWindow;
import org.sweetiebelle.pictionary.frames.GameWindow;
import org.sweetiebelle.pictionary.frames.MainMenu;
import org.sweetiebelle.pictionary.frames.PaintingFrame;
import org.sweetiebelle.pictionary.panels.CardPanel;
import org.sweetiebelle.pictionary.panels.TeamAvatarSelectionPanel;
import org.sweetiebelle.pictionary.panels.TeamNumberSelectionPanel;
import org.sweetiebelle.pictionary.panels.TimeAndConfirmPanel;

public class Pictionary implements Runnable {

    public static final Color LIVING_CREATURE = Color.YELLOW;
    public static final Color OBJECT = Color.BLUE;
    public static final Color ACTION = new Color(245, 245, 220);
    public static final Color DIFFICULT = Color.GREEN;
    public static final Color ALL_PLAY = Color.RED;
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
    public static final ExecutorService threads =  Executors.newCachedThreadPool();

    public Pictionary() {
        random = new SecureRandom();
        random.setSeed(new byte[20]);
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
        System.out.printf("%d %d %n", numOfTeamOne, numOfTeamTwo);
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
        System.out.printf("1 is %s, 2 is %s%n", team1Color.toString(), team2Color.toString());
    }

    public void initializeBoard() {
        avatarPanel.setVisible(false);
        displayWindow.remove(avatarPanel);
        displayWindow.setVisible(false);
         gameWindow = new GameWindow(this, team1Color, team2Color, getWhoGoesFirst());
         gameWindow.setVisible(true);
         System.out.println("Finished setting tiles.");
        //doCardGame(1, LIVING_CREATURE);
    }

    private int getWhoGoesFirst() {
        return 1;
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
        CardPanel card = new CardPanel();
        String cardToHaveDrawn = getNameFromCardType(background);
        card.changeColor(background);
        card.changeDisplayText(cardToHaveDrawn);
        displayWindow.setContentPane(card);
        displayWindow.setVisible(true);
        threads.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            displayWindow.remove(card);
            displayWindow.setVisible(false);
            PaintingFrame paint = new PaintingFrame();
            paint.setVisible(true);
            TimeAndConfirmPanel panel = new TimeAndConfirmPanel(this);
            displayWindow.resizeWindow(300, 250);
            displayWindow.setTitle("Timer");
            displayWindow.setContentPane(panel);
            panel.start();
        });
    }

    private String getNameFromCardType(Color type) {
        if (type.equals(LIVING_CREATURE)) {
            return "Donald Trump";
        }
        if (type.equals(OBJECT)) {
            return "Donald Trump";
        }
        if (type.equals(ACTION)) {
            return "Donald Trump";
        }
        if (type.equals(DIFFICULT)) {
            return "Donald Trump";
        }
        if (type.equals(ALL_PLAY)) {
            return "Donald Trump";
        }
        return "Donald Trump";
    }

    public void cardSuccess(boolean b) {
        if(b) {
            // Do nothing, still their turn.
            return;
        }
        if(gameWindow.currentTurn() == 1) {
            gameWindow.setTurn(2);
            return;
        }
        gameWindow.setTurn(1);
    }
}
