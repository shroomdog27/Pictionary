package org.sweetiebelle.pictionary;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.sweetiebelle.pictionary.panels.MainMenu;
import org.sweetiebelle.pictionary.panels.MainWindow;

public class Pictionary implements Runnable {

    private MainMenu menu;
    private MainWindow window;

    public Pictionary() {
        window = new MainWindow();
        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        } catch (final Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> run());
    }

    @Override
    public void run() {
        window.setVisible(true);
        //menu = new MainMenu();
       // window.add(menu);
       // menu.setVisible(true);
    }
}
