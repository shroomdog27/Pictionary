package org.sweetiebelle.pictionary.frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import org.sweetiebelle.pictionary.GameTile;
import org.sweetiebelle.pictionary.Pictionary;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class GameWindow extends JFrame {

    private static final long serialVersionUID = 2872734321591378767L;
    private JPanel diceBox;
    private JLabel dieDescriptor;
    private JLabel dieNumberLabel;
    private JLabel endLabel;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JPanel jPanel19;
    private JPanel jPanel2;
    private JPanel jPanel20;
    private JPanel jPanel21;
    private JPanel jPanel22;
    private JPanel jPanel23;
    private JPanel jPanel24;
    private JPanel jPanel25;
    private JPanel jPanel26;
    private JPanel jPanel27;
    private JPanel jPanel28;
    private JPanel jPanel29;
    private JPanel jPanel3;
    private JPanel jPanel30;
    private JPanel jPanel31;
    private JPanel jPanel32;
    private JPanel jPanel33;
    private JPanel jPanel34;
    private JPanel jPanel35;
    private JPanel jPanel36;
    private JPanel jPanel37;
    private JPanel jPanel38;
    private JPanel jPanel39;
    private JPanel jPanel4;
    private JPanel jPanel40;
    private JPanel jPanel41;
    private JPanel jPanel42;
    private JPanel jPanel43;
    private JPanel jPanel44;
    private JPanel jPanel45;
    private JPanel jPanel46;
    private JPanel jPanel47;
    private JPanel jPanel48;
    private JPanel jPanel49;
    private JPanel jPanel5;
    private JPanel jPanel50;
    private JPanel jPanel51;
    private JPanel jPanel52;
    private JPanel jPanel53;
    private JPanel jPanel54;
    private JPanel jPanel55;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private ArrayList<GameTile> panels;
    private Pictionary pictionary;
    private JButton rollButton;
    private JLabel startLabel;
    private JPanel team1Pos1;
    private JPanel team1Pos10;
    private JPanel team1Pos11;
    private JPanel team1Pos12;
    private JPanel team1Pos13;
    private JPanel team1Pos14;
    private JPanel team1Pos15;
    private JPanel team1Pos16;
    private JPanel team1Pos17;
    private JPanel team1Pos18;
    private JPanel team1Pos19;
    private JPanel team1Pos2;
    private JPanel team1Pos20;
    private JPanel team1Pos21;
    private JPanel team1Pos22;
    private JPanel team1Pos23;
    private JPanel team1Pos24;
    private JPanel team1Pos25;
    private JPanel team1Pos26;
    private JPanel team1Pos27;
    private JPanel team1Pos28;
    private JPanel team1Pos29;
    private JPanel team1Pos3;
    private JPanel team1Pos30;
    private JPanel team1Pos31;
    private JPanel team1Pos32;
    private JPanel team1Pos33;
    private JPanel team1Pos34;
    private JPanel team1Pos35;
    private JPanel team1Pos36;
    private JPanel team1Pos37;
    private JPanel team1Pos38;
    private JPanel team1Pos39;
    private JPanel team1Pos4;
    private JPanel team1Pos40;
    private JPanel team1Pos41;
    private JPanel team1Pos42;
    private JPanel team1Pos43;
    private JPanel team1Pos44;
    private JPanel team1Pos45;
    private JPanel team1Pos46;
    private JPanel team1Pos47;
    private JPanel team1Pos48;
    private JPanel team1Pos49;
    private JPanel team1Pos5;
    private JPanel team1Pos50;
    private JPanel team1Pos51;
    private JPanel team1Pos52;
    private JPanel team1Pos53;
    private JPanel team1Pos54;
    private JPanel team1Pos6;
    private JPanel team1Pos7;
    private JPanel team1Pos8;
    private JPanel team1Pos9;
    private JPanel team1PosEnd;
    private JPanel team2Pos1;
    private JPanel team2Pos10;
    private JPanel team2Pos11;
    private JPanel team2Pos12;
    private JPanel team2Pos13;
    private JPanel team2Pos14;
    private JPanel team2Pos15;
    private JPanel team2Pos16;
    private JPanel team2Pos17;
    private JPanel team2Pos18;
    private JPanel team2Pos19;
    private JPanel team2Pos2;
    private JPanel team2Pos20;
    private JPanel team2Pos21;
    private JPanel team2Pos22;
    private JPanel team2Pos23;
    private JPanel team2Pos24;
    private JPanel team2Pos25;
    private JPanel team2Pos26;
    private JPanel team2Pos27;
    private JPanel team2Pos28;
    private JPanel team2Pos29;
    private JPanel team2Pos3;
    private JPanel team2Pos30;
    private JPanel team2Pos31;
    private JPanel team2Pos32;
    private JPanel team2Pos33;
    private JPanel team2Pos34;
    private JPanel team2Pos35;
    private JPanel team2Pos36;
    private JPanel team2Pos37;
    private JPanel team2Pos38;
    private JPanel team2Pos39;
    private JPanel team2Pos4;
    private JPanel team2Pos40;
    private JPanel team2Pos41;
    private JPanel team2Pos42;
    private JPanel team2Pos43;
    private JPanel team2Pos44;
    private JPanel team2Pos45;
    private JPanel team2Pos46;
    private JPanel team2Pos47;
    private JPanel team2Pos48;
    private JPanel team2Pos49;
    private JPanel team2Pos5;
    private JPanel team2Pos50;
    private JPanel team2Pos51;
    private JPanel team2Pos52;
    private JPanel team2Pos53;
    private JPanel team2Pos54;
    private JPanel team2Pos6;
    private JPanel team2Pos7;
    private JPanel team2Pos8;
    private JPanel team2Pos9;
    private JPanel team2PosEnd;
    private int teamNumber;
    private JLabel teamNumberToRollLabel;
    private int teamOnePos;
    private int teamTwoPos;

    public GameWindow(Pictionary pictionary, Color teamOne, Color teamTwo, int goingFirst) {
        this.pictionary = pictionary;
        initComponents();
        makeArrayFromPanels();
        resetPanels(teamOne, teamTwo);
        moveTeamOneToPanel(panels.get(54));
        moveTeamTwoToPanel(panels.get(54));

        teamNumber = goingFirst;
        updateteamRollingText("Team " + teamNumber + ", it's your turn to roll!");
        teamOnePos = 54;
        teamTwoPos = 54;
    }

    public int currentTurn() {
        return teamNumber;
    }

    public void resetPanels(Color teamOneColor, Color teamTwoColor) {
        for (GameTile tile : panels) {
            tile.disableOne();
            tile.disableTwo();
            tile.setOneColor(teamOneColor);
            tile.setTwoColor(teamTwoColor);
        }
    }

    // @formatter:off
    private void initComponents() {

        jPanel1 = new JPanel();
        endLabel = new JLabel();
        team1PosEnd = new JPanel();
        team2PosEnd = new JPanel();
        jPanel2 = new JPanel();
        team1Pos1 = new JPanel();
        team2Pos1 = new JPanel();
        jPanel3 = new JPanel();
        team1Pos2 = new JPanel();
        team2Pos2 = new JPanel();
        jPanel4 = new JPanel();
        team1Pos3 = new JPanel();
        team2Pos3 = new JPanel();
        jPanel5 = new JPanel();
        team1Pos4 = new JPanel();
        team2Pos4 = new JPanel();
        jPanel6 = new JPanel();
        team1Pos5 = new JPanel();
        team2Pos5 = new JPanel();
        jPanel7 = new JPanel();
        team1Pos6 = new JPanel();
        team2Pos6 = new JPanel();
        jPanel8 = new JPanel();
        team1Pos7 = new JPanel();
        team2Pos7 = new JPanel();
        jPanel9 = new JPanel();
        team1Pos8 = new JPanel();
        team2Pos8 = new JPanel();
        jPanel10 = new JPanel();
        team1Pos9 = new JPanel();
        team2Pos9 = new JPanel();
        jPanel11 = new JPanel();
        team1Pos10 = new JPanel();
        team2Pos10 = new JPanel();
        jPanel12 = new JPanel();
        team1Pos11 = new JPanel();
        team2Pos11 = new JPanel();
        jPanel13 = new JPanel();
        team1Pos12 = new JPanel();
        team2Pos12 = new JPanel();
        jPanel14 = new JPanel();
        team1Pos13 = new JPanel();
        team2Pos13 = new JPanel();
        jPanel15 = new JPanel();
        team1Pos14 = new JPanel();
        team2Pos14 = new JPanel();
        jPanel16 = new JPanel();
        team1Pos15 = new JPanel();
        team2Pos15 = new JPanel();
        jPanel17 = new JPanel();
        team1Pos16 = new JPanel();
        team2Pos16 = new JPanel();
        jPanel18 = new JPanel();
        team1Pos17 = new JPanel();
        team2Pos17 = new JPanel();
        jPanel19 = new JPanel();
        team1Pos18 = new JPanel();
        team2Pos18 = new JPanel();
        jPanel20 = new JPanel();
        team1Pos19 = new JPanel();
        team2Pos19 = new JPanel();
        jPanel21 = new JPanel();
        team1Pos20 = new JPanel();
        team2Pos20 = new JPanel();
        jPanel22 = new JPanel();
        team1Pos21 = new JPanel();
        team2Pos21 = new JPanel();
        jPanel23 = new JPanel();
        team1Pos22 = new JPanel();
        team2Pos22 = new JPanel();
        jPanel24 = new JPanel();
        team1Pos23 = new JPanel();
        team2Pos23 = new JPanel();
        jPanel25 = new JPanel();
        team1Pos24 = new JPanel();
        team2Pos24 = new JPanel();
        jPanel26 = new JPanel();
        team1Pos25 = new JPanel();
        team2Pos25 = new JPanel();
        jPanel27 = new JPanel();
        team1Pos26 = new JPanel();
        team2Pos26 = new JPanel();
        jPanel28 = new JPanel();
        team1Pos27 = new JPanel();
        team2Pos27 = new JPanel();
        jPanel29 = new JPanel();
        team1Pos28 = new JPanel();
        team2Pos28 = new JPanel();
        jPanel30 = new JPanel();
        team1Pos29 = new JPanel();
        team2Pos29 = new JPanel();
        jPanel31 = new JPanel();
        team1Pos30 = new JPanel();
        team2Pos30 = new JPanel();
        jPanel32 = new JPanel();
        team1Pos31 = new JPanel();
        team2Pos31 = new JPanel();
        jPanel33 = new JPanel();
        team1Pos32 = new JPanel();
        team2Pos32 = new JPanel();
        jPanel34 = new JPanel();
        team1Pos33 = new JPanel();
        team2Pos33 = new JPanel();
        jPanel35 = new JPanel();
        team1Pos34 = new JPanel();
        team2Pos34 = new JPanel();
        jPanel36 = new JPanel();
        team1Pos35 = new JPanel();
        team2Pos35 = new JPanel();
        jPanel37 = new JPanel();
        team1Pos36 = new JPanel();
        team2Pos36 = new JPanel();
        jPanel38 = new JPanel();
        team1Pos37 = new JPanel();
        team2Pos37 = new JPanel();
        jPanel39 = new JPanel();
        team1Pos38 = new JPanel();
        team2Pos38 = new JPanel();
        jPanel40 = new JPanel();
        team1Pos39 = new JPanel();
        team2Pos39 = new JPanel();
        jPanel41 = new JPanel();
        team1Pos40 = new JPanel();
        team2Pos40 = new JPanel();
        jPanel42 = new JPanel();
        team1Pos41 = new JPanel();
        team2Pos41 = new JPanel();
        jPanel43 = new JPanel();
        team1Pos42 = new JPanel();
        team2Pos42 = new JPanel();
        jPanel44 = new JPanel();
        team1Pos43 = new JPanel();
        team2Pos43 = new JPanel();
        jPanel45 = new JPanel();
        team1Pos44 = new JPanel();
        team2Pos44 = new JPanel();
        jPanel46 = new JPanel();
        team1Pos45 = new JPanel();
        team2Pos45 = new JPanel();
        jPanel47 = new JPanel();
        team1Pos46 = new JPanel();
        team2Pos46 = new JPanel();
        jPanel48 = new JPanel();
        team1Pos47 = new JPanel();
        team2Pos47 = new JPanel();
        jPanel49 = new JPanel();
        team1Pos48 = new JPanel();
        team2Pos48 = new JPanel();
        jPanel50 = new JPanel();
        team1Pos49 = new JPanel();
        team2Pos49 = new JPanel();
        jPanel51 = new JPanel();
        team1Pos50 = new JPanel();
        team2Pos50 = new JPanel();
        jPanel52 = new JPanel();
        team1Pos51 = new JPanel();
        team2Pos51 = new JPanel();
        jPanel53 = new JPanel();
        team1Pos52 = new JPanel();
        team2Pos52 = new JPanel();
        jPanel54 = new JPanel();
        team1Pos53 = new JPanel();
        team2Pos53 = new JPanel();
        jPanel55 = new JPanel();
        team1Pos54 = new JPanel();
        team2Pos54 = new JPanel();
        startLabel = new JLabel();
        diceBox = new JPanel();
        dieDescriptor = new JLabel();
        dieNumberLabel = new JLabel();
        rollButton = new JButton();
        teamNumberToRollLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new Dimension(1200, 750));
        setPreferredSize(new Dimension(1200, 750));
        setResizable(false);
        setSize(new Dimension(1200, 750));

        jPanel1.setBackground(Color.red);
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel1.setMaximumSize(new Dimension(75, 75));
        jPanel1.setMinimumSize(new Dimension(75, 75));
        jPanel1.setPreferredSize(new Dimension(75, 75));
        jPanel1.setLayout(new AbsoluteLayout());

        endLabel.setHorizontalAlignment(SwingConstants.CENTER);
        endLabel.setText("END");
        jPanel1.add(endLabel, new AbsoluteConstraints(26, 31, -1, -1));

        team1PosEnd.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1PosEnd.setMaximumSize(new Dimension(25, 25));
        team1PosEnd.setMinimumSize(new Dimension(25, 25));
        team1PosEnd.setPreferredSize(new Dimension(25, 25));

        GroupLayout team1PosEndLayout = new GroupLayout(team1PosEnd);
        team1PosEnd.setLayout(team1PosEndLayout);
        team1PosEndLayout.setHorizontalGroup(
            team1PosEndLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1PosEndLayout.setVerticalGroup(
            team1PosEndLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel1.add(team1PosEnd, new AbsoluteConstraints(0, 50, -1, -1));

        team2PosEnd.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2PosEnd.setMaximumSize(new Dimension(25, 25));
        team2PosEnd.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2PosEndLayout = new GroupLayout(team2PosEnd);
        team2PosEnd.setLayout(team2PosEndLayout);
        team2PosEndLayout.setHorizontalGroup(
            team2PosEndLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2PosEndLayout.setVerticalGroup(
            team2PosEndLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel1.add(team2PosEnd, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel2.setBackground(Color.green);
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel2.setMaximumSize(new Dimension(75, 75));
        jPanel2.setLayout(new AbsoluteLayout());

        team1Pos1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos1.setMaximumSize(new Dimension(25, 25));
        team1Pos1.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos1Layout = new GroupLayout(team1Pos1);
        team1Pos1.setLayout(team1Pos1Layout);
        team1Pos1Layout.setHorizontalGroup(
            team1Pos1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos1Layout.setVerticalGroup(
            team1Pos1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(team1Pos1, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos1.setMaximumSize(new Dimension(25, 25));
        team2Pos1.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos1Layout = new GroupLayout(team2Pos1);
        team2Pos1.setLayout(team2Pos1Layout);
        team2Pos1Layout.setHorizontalGroup(
            team2Pos1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos1Layout.setVerticalGroup(
            team2Pos1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(team2Pos1, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel3.setBackground(new Color(245, 245, 220));
        jPanel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel3.setMaximumSize(new Dimension(75, 75));
        jPanel3.setLayout(new AbsoluteLayout());

        team1Pos2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos2.setMaximumSize(new Dimension(25, 25));
        team1Pos2.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos2Layout = new GroupLayout(team1Pos2);
        team1Pos2.setLayout(team1Pos2Layout);
        team1Pos2Layout.setHorizontalGroup(
            team1Pos2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos2Layout.setVerticalGroup(
            team1Pos2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel3.add(team1Pos2, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos2.setMaximumSize(new Dimension(25, 25));
        team2Pos2.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos2Layout = new GroupLayout(team2Pos2);
        team2Pos2.setLayout(team2Pos2Layout);
        team2Pos2Layout.setHorizontalGroup(
            team2Pos2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos2Layout.setVerticalGroup(
            team2Pos2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel3.add(team2Pos2, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel4.setBackground(Color.blue);
        jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel4.setMaximumSize(new Dimension(75, 75));
        jPanel4.setLayout(new AbsoluteLayout());

        team1Pos3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos3.setMaximumSize(new Dimension(25, 25));
        team1Pos3.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos3Layout = new GroupLayout(team1Pos3);
        team1Pos3.setLayout(team1Pos3Layout);
        team1Pos3Layout.setHorizontalGroup(
            team1Pos3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos3Layout.setVerticalGroup(
            team1Pos3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel4.add(team1Pos3, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos3.setMaximumSize(new Dimension(25, 25));
        team2Pos3.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos3Layout = new GroupLayout(team2Pos3);
        team2Pos3.setLayout(team2Pos3Layout);
        team2Pos3Layout.setHorizontalGroup(
            team2Pos3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos3Layout.setVerticalGroup(
            team2Pos3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel4.add(team2Pos3, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel5.setBackground(Color.yellow);
        jPanel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel5.setMaximumSize(new Dimension(75, 75));
        jPanel5.setLayout(new AbsoluteLayout());

        team1Pos4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos4.setMaximumSize(new Dimension(25, 25));
        team1Pos4.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos4Layout = new GroupLayout(team1Pos4);
        team1Pos4.setLayout(team1Pos4Layout);
        team1Pos4Layout.setHorizontalGroup(
            team1Pos4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos4Layout.setVerticalGroup(
            team1Pos4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel5.add(team1Pos4, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos4.setMaximumSize(new Dimension(25, 25));
        team2Pos4.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos4Layout = new GroupLayout(team2Pos4);
        team2Pos4.setLayout(team2Pos4Layout);
        team2Pos4Layout.setHorizontalGroup(
            team2Pos4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos4Layout.setVerticalGroup(
            team2Pos4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel5.add(team2Pos4, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel6.setBackground(Color.red);
        jPanel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel6.setMaximumSize(new Dimension(75, 75));
        jPanel6.setLayout(new AbsoluteLayout());

        team1Pos5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos5.setMaximumSize(new Dimension(25, 25));
        team1Pos5.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos5Layout = new GroupLayout(team1Pos5);
        team1Pos5.setLayout(team1Pos5Layout);
        team1Pos5Layout.setHorizontalGroup(
            team1Pos5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos5Layout.setVerticalGroup(
            team1Pos5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel6.add(team1Pos5, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos5.setMaximumSize(new Dimension(25, 25));
        team2Pos5.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos5Layout = new GroupLayout(team2Pos5);
        team2Pos5.setLayout(team2Pos5Layout);
        team2Pos5Layout.setHorizontalGroup(
            team2Pos5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos5Layout.setVerticalGroup(
            team2Pos5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel6.add(team2Pos5, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel7.setBackground(Color.green);
        jPanel7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel7.setMaximumSize(new Dimension(75, 75));
        jPanel7.setLayout(new AbsoluteLayout());

        team1Pos6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos6.setMaximumSize(new Dimension(25, 25));
        team1Pos6.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos6Layout = new GroupLayout(team1Pos6);
        team1Pos6.setLayout(team1Pos6Layout);
        team1Pos6Layout.setHorizontalGroup(
            team1Pos6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos6Layout.setVerticalGroup(
            team1Pos6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel7.add(team1Pos6, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos6.setMaximumSize(new Dimension(25, 25));
        team2Pos6.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos6Layout = new GroupLayout(team2Pos6);
        team2Pos6.setLayout(team2Pos6Layout);
        team2Pos6Layout.setHorizontalGroup(
            team2Pos6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos6Layout.setVerticalGroup(
            team2Pos6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel7.add(team2Pos6, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel8.setBackground(new Color(245, 245, 220));
        jPanel8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel8.setMaximumSize(new Dimension(75, 75));
        jPanel8.setLayout(new AbsoluteLayout());

        team1Pos7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos7.setMaximumSize(new Dimension(25, 25));
        team1Pos7.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos7Layout = new GroupLayout(team1Pos7);
        team1Pos7.setLayout(team1Pos7Layout);
        team1Pos7Layout.setHorizontalGroup(
            team1Pos7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos7Layout.setVerticalGroup(
            team1Pos7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel8.add(team1Pos7, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos7.setMaximumSize(new Dimension(25, 25));
        team2Pos7.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos7Layout = new GroupLayout(team2Pos7);
        team2Pos7.setLayout(team2Pos7Layout);
        team2Pos7Layout.setHorizontalGroup(
            team2Pos7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos7Layout.setVerticalGroup(
            team2Pos7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel8.add(team2Pos7, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel9.setBackground(Color.blue);
        jPanel9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel9.setMaximumSize(new Dimension(75, 75));
        jPanel9.setLayout(new AbsoluteLayout());

        team1Pos8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos8.setMaximumSize(new Dimension(25, 25));
        team1Pos8.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos8Layout = new GroupLayout(team1Pos8);
        team1Pos8.setLayout(team1Pos8Layout);
        team1Pos8Layout.setHorizontalGroup(
            team1Pos8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos8Layout.setVerticalGroup(
            team1Pos8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel9.add(team1Pos8, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos8.setMaximumSize(new Dimension(25, 25));
        team2Pos8.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos8Layout = new GroupLayout(team2Pos8);
        team2Pos8.setLayout(team2Pos8Layout);
        team2Pos8Layout.setHorizontalGroup(
            team2Pos8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos8Layout.setVerticalGroup(
            team2Pos8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel9.add(team2Pos8, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel10.setBackground(Color.yellow);
        jPanel10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel10.setMaximumSize(new Dimension(75, 75));
        jPanel10.setLayout(new AbsoluteLayout());

        team1Pos9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos9.setMaximumSize(new Dimension(25, 25));
        team1Pos9.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos9Layout = new GroupLayout(team1Pos9);
        team1Pos9.setLayout(team1Pos9Layout);
        team1Pos9Layout.setHorizontalGroup(
            team1Pos9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos9Layout.setVerticalGroup(
            team1Pos9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel10.add(team1Pos9, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos9.setMaximumSize(new Dimension(25, 25));
        team2Pos9.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos9Layout = new GroupLayout(team2Pos9);
        team2Pos9.setLayout(team2Pos9Layout);
        team2Pos9Layout.setHorizontalGroup(
            team2Pos9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos9Layout.setVerticalGroup(
            team2Pos9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel10.add(team2Pos9, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel11.setBackground(Color.red);
        jPanel11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel11.setMaximumSize(new Dimension(75, 75));
        jPanel11.setLayout(new AbsoluteLayout());

        team1Pos10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos10.setMaximumSize(new Dimension(25, 25));
        team1Pos10.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos10Layout = new GroupLayout(team1Pos10);
        team1Pos10.setLayout(team1Pos10Layout);
        team1Pos10Layout.setHorizontalGroup(
            team1Pos10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos10Layout.setVerticalGroup(
            team1Pos10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel11.add(team1Pos10, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos10.setMaximumSize(new Dimension(25, 25));
        team2Pos10.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos10Layout = new GroupLayout(team2Pos10);
        team2Pos10.setLayout(team2Pos10Layout);
        team2Pos10Layout.setHorizontalGroup(
            team2Pos10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos10Layout.setVerticalGroup(
            team2Pos10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel11.add(team2Pos10, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel12.setBackground(Color.green);
        jPanel12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel12.setMaximumSize(new Dimension(75, 75));
        jPanel12.setLayout(new AbsoluteLayout());

        team1Pos11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos11.setMaximumSize(new Dimension(25, 25));
        team1Pos11.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos11Layout = new GroupLayout(team1Pos11);
        team1Pos11.setLayout(team1Pos11Layout);
        team1Pos11Layout.setHorizontalGroup(
            team1Pos11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos11Layout.setVerticalGroup(
            team1Pos11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel12.add(team1Pos11, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos11.setMaximumSize(new Dimension(25, 25));
        team2Pos11.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos11Layout = new GroupLayout(team2Pos11);
        team2Pos11.setLayout(team2Pos11Layout);
        team2Pos11Layout.setHorizontalGroup(
            team2Pos11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos11Layout.setVerticalGroup(
            team2Pos11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel12.add(team2Pos11, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel13.setBackground(new Color(245, 245, 220));
        jPanel13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel13.setMaximumSize(new Dimension(75, 75));
        jPanel13.setLayout(new AbsoluteLayout());

        team1Pos12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos12.setMaximumSize(new Dimension(25, 25));
        team1Pos12.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos12Layout = new GroupLayout(team1Pos12);
        team1Pos12.setLayout(team1Pos12Layout);
        team1Pos12Layout.setHorizontalGroup(
            team1Pos12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos12Layout.setVerticalGroup(
            team1Pos12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel13.add(team1Pos12, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos12.setMaximumSize(new Dimension(25, 25));
        team2Pos12.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos12Layout = new GroupLayout(team2Pos12);
        team2Pos12.setLayout(team2Pos12Layout);
        team2Pos12Layout.setHorizontalGroup(
            team2Pos12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos12Layout.setVerticalGroup(
            team2Pos12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel13.add(team2Pos12, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel14.setBackground(Color.blue);
        jPanel14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel14.setMaximumSize(new Dimension(75, 75));
        jPanel14.setLayout(new AbsoluteLayout());

        team1Pos13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos13.setMaximumSize(new Dimension(25, 25));
        team1Pos13.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos13Layout = new GroupLayout(team1Pos13);
        team1Pos13.setLayout(team1Pos13Layout);
        team1Pos13Layout.setHorizontalGroup(
            team1Pos13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos13Layout.setVerticalGroup(
            team1Pos13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel14.add(team1Pos13, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos13.setMaximumSize(new Dimension(25, 25));
        team2Pos13.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos13Layout = new GroupLayout(team2Pos13);
        team2Pos13.setLayout(team2Pos13Layout);
        team2Pos13Layout.setHorizontalGroup(
            team2Pos13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos13Layout.setVerticalGroup(
            team2Pos13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel14.add(team2Pos13, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel15.setBackground(Color.yellow);
        jPanel15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel15.setMaximumSize(new Dimension(75, 75));
        jPanel15.setLayout(new AbsoluteLayout());

        team1Pos14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos14.setMaximumSize(new Dimension(25, 25));
        team1Pos14.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos14Layout = new GroupLayout(team1Pos14);
        team1Pos14.setLayout(team1Pos14Layout);
        team1Pos14Layout.setHorizontalGroup(
            team1Pos14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos14Layout.setVerticalGroup(
            team1Pos14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel15.add(team1Pos14, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos14.setMaximumSize(new Dimension(25, 25));
        team2Pos14.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos14Layout = new GroupLayout(team2Pos14);
        team2Pos14.setLayout(team2Pos14Layout);
        team2Pos14Layout.setHorizontalGroup(
            team2Pos14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos14Layout.setVerticalGroup(
            team2Pos14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel15.add(team2Pos14, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel16.setBackground(Color.red);
        jPanel16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel16.setMaximumSize(new Dimension(75, 75));
        jPanel16.setLayout(new AbsoluteLayout());

        team1Pos15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos15.setMaximumSize(new Dimension(25, 25));
        team1Pos15.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos15Layout = new GroupLayout(team1Pos15);
        team1Pos15.setLayout(team1Pos15Layout);
        team1Pos15Layout.setHorizontalGroup(
            team1Pos15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos15Layout.setVerticalGroup(
            team1Pos15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel16.add(team1Pos15, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos15.setMaximumSize(new Dimension(25, 25));
        team2Pos15.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos15Layout = new GroupLayout(team2Pos15);
        team2Pos15.setLayout(team2Pos15Layout);
        team2Pos15Layout.setHorizontalGroup(
            team2Pos15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos15Layout.setVerticalGroup(
            team2Pos15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel16.add(team2Pos15, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel17.setBackground(Color.green);
        jPanel17.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel17.setMaximumSize(new Dimension(75, 75));
        jPanel17.setLayout(new AbsoluteLayout());

        team1Pos16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos16.setMaximumSize(new Dimension(25, 25));
        team1Pos16.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos16Layout = new GroupLayout(team1Pos16);
        team1Pos16.setLayout(team1Pos16Layout);
        team1Pos16Layout.setHorizontalGroup(
            team1Pos16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos16Layout.setVerticalGroup(
            team1Pos16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel17.add(team1Pos16, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos16.setMaximumSize(new Dimension(25, 25));
        team2Pos16.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos16Layout = new GroupLayout(team2Pos16);
        team2Pos16.setLayout(team2Pos16Layout);
        team2Pos16Layout.setHorizontalGroup(
            team2Pos16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos16Layout.setVerticalGroup(
            team2Pos16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel17.add(team2Pos16, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel18.setBackground(new Color(245, 245, 220));
        jPanel18.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel18.setMaximumSize(new Dimension(75, 75));
        jPanel18.setLayout(new AbsoluteLayout());

        team1Pos17.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos17.setMaximumSize(new Dimension(25, 25));
        team1Pos17.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos17Layout = new GroupLayout(team1Pos17);
        team1Pos17.setLayout(team1Pos17Layout);
        team1Pos17Layout.setHorizontalGroup(
            team1Pos17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos17Layout.setVerticalGroup(
            team1Pos17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel18.add(team1Pos17, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos17.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos17.setMaximumSize(new Dimension(25, 25));
        team2Pos17.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos17Layout = new GroupLayout(team2Pos17);
        team2Pos17.setLayout(team2Pos17Layout);
        team2Pos17Layout.setHorizontalGroup(
            team2Pos17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos17Layout.setVerticalGroup(
            team2Pos17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel18.add(team2Pos17, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel19.setBackground(Color.blue);
        jPanel19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel19.setMaximumSize(new Dimension(75, 75));
        jPanel19.setLayout(new AbsoluteLayout());

        team1Pos18.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos18.setMaximumSize(new Dimension(25, 25));
        team1Pos18.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos18Layout = new GroupLayout(team1Pos18);
        team1Pos18.setLayout(team1Pos18Layout);
        team1Pos18Layout.setHorizontalGroup(
            team1Pos18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos18Layout.setVerticalGroup(
            team1Pos18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel19.add(team1Pos18, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos18.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos18.setMaximumSize(new Dimension(25, 25));
        team2Pos18.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos18Layout = new GroupLayout(team2Pos18);
        team2Pos18.setLayout(team2Pos18Layout);
        team2Pos18Layout.setHorizontalGroup(
            team2Pos18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos18Layout.setVerticalGroup(
            team2Pos18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel19.add(team2Pos18, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel20.setBackground(Color.yellow);
        jPanel20.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel20.setMaximumSize(new Dimension(75, 75));
        jPanel20.setLayout(new AbsoluteLayout());

        team1Pos19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos19.setMaximumSize(new Dimension(25, 25));
        team1Pos19.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos19Layout = new GroupLayout(team1Pos19);
        team1Pos19.setLayout(team1Pos19Layout);
        team1Pos19Layout.setHorizontalGroup(
            team1Pos19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos19Layout.setVerticalGroup(
            team1Pos19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel20.add(team1Pos19, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos19.setMaximumSize(new Dimension(25, 25));
        team2Pos19.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos19Layout = new GroupLayout(team2Pos19);
        team2Pos19.setLayout(team2Pos19Layout);
        team2Pos19Layout.setHorizontalGroup(
            team2Pos19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos19Layout.setVerticalGroup(
            team2Pos19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel20.add(team2Pos19, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel21.setBackground(Color.red);
        jPanel21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel21.setMaximumSize(new Dimension(75, 75));
        jPanel21.setLayout(new AbsoluteLayout());

        team1Pos20.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos20.setMaximumSize(new Dimension(25, 25));
        team1Pos20.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos20Layout = new GroupLayout(team1Pos20);
        team1Pos20.setLayout(team1Pos20Layout);
        team1Pos20Layout.setHorizontalGroup(
            team1Pos20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos20Layout.setVerticalGroup(
            team1Pos20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel21.add(team1Pos20, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos20.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos20.setMaximumSize(new Dimension(25, 25));
        team2Pos20.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos20Layout = new GroupLayout(team2Pos20);
        team2Pos20.setLayout(team2Pos20Layout);
        team2Pos20Layout.setHorizontalGroup(
            team2Pos20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos20Layout.setVerticalGroup(
            team2Pos20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel21.add(team2Pos20, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel22.setBackground(Color.green);
        jPanel22.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel22.setMaximumSize(new Dimension(75, 75));
        jPanel22.setLayout(new AbsoluteLayout());

        team1Pos21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos21.setMaximumSize(new Dimension(25, 25));
        team1Pos21.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos21Layout = new GroupLayout(team1Pos21);
        team1Pos21.setLayout(team1Pos21Layout);
        team1Pos21Layout.setHorizontalGroup(
            team1Pos21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos21Layout.setVerticalGroup(
            team1Pos21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel22.add(team1Pos21, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos21.setMaximumSize(new Dimension(25, 25));
        team2Pos21.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos21Layout = new GroupLayout(team2Pos21);
        team2Pos21.setLayout(team2Pos21Layout);
        team2Pos21Layout.setHorizontalGroup(
            team2Pos21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos21Layout.setVerticalGroup(
            team2Pos21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel22.add(team2Pos21, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel23.setBackground(new Color(245, 245, 220));
        jPanel23.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel23.setMaximumSize(new Dimension(75, 75));
        jPanel23.setLayout(new AbsoluteLayout());

        team1Pos22.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos22.setMaximumSize(new Dimension(25, 25));
        team1Pos22.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos22Layout = new GroupLayout(team1Pos22);
        team1Pos22.setLayout(team1Pos22Layout);
        team1Pos22Layout.setHorizontalGroup(
            team1Pos22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos22Layout.setVerticalGroup(
            team1Pos22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel23.add(team1Pos22, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos22.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos22.setMaximumSize(new Dimension(25, 25));
        team2Pos22.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos22Layout = new GroupLayout(team2Pos22);
        team2Pos22.setLayout(team2Pos22Layout);
        team2Pos22Layout.setHorizontalGroup(
            team2Pos22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos22Layout.setVerticalGroup(
            team2Pos22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel23.add(team2Pos22, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel24.setBackground(Color.blue);
        jPanel24.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel24.setMaximumSize(new Dimension(75, 75));
        jPanel24.setLayout(new AbsoluteLayout());

        team1Pos23.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos23.setMaximumSize(new Dimension(25, 25));
        team1Pos23.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos23Layout = new GroupLayout(team1Pos23);
        team1Pos23.setLayout(team1Pos23Layout);
        team1Pos23Layout.setHorizontalGroup(
            team1Pos23Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos23Layout.setVerticalGroup(
            team1Pos23Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel24.add(team1Pos23, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos23.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos23.setMaximumSize(new Dimension(25, 25));
        team2Pos23.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos23Layout = new GroupLayout(team2Pos23);
        team2Pos23.setLayout(team2Pos23Layout);
        team2Pos23Layout.setHorizontalGroup(
            team2Pos23Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos23Layout.setVerticalGroup(
            team2Pos23Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel24.add(team2Pos23, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel25.setBackground(Color.yellow);
        jPanel25.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel25.setMaximumSize(new Dimension(75, 75));
        jPanel25.setLayout(new AbsoluteLayout());

        team1Pos24.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos24.setMaximumSize(new Dimension(25, 25));
        team1Pos24.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos24Layout = new GroupLayout(team1Pos24);
        team1Pos24.setLayout(team1Pos24Layout);
        team1Pos24Layout.setHorizontalGroup(
            team1Pos24Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos24Layout.setVerticalGroup(
            team1Pos24Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel25.add(team1Pos24, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos24.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos24.setMaximumSize(new Dimension(25, 25));
        team2Pos24.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos24Layout = new GroupLayout(team2Pos24);
        team2Pos24.setLayout(team2Pos24Layout);
        team2Pos24Layout.setHorizontalGroup(
            team2Pos24Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos24Layout.setVerticalGroup(
            team2Pos24Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel25.add(team2Pos24, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel26.setBackground(Color.red);
        jPanel26.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel26.setMaximumSize(new Dimension(75, 75));
        jPanel26.setLayout(new AbsoluteLayout());

        team1Pos25.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos25.setMaximumSize(new Dimension(25, 25));
        team1Pos25.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos25Layout = new GroupLayout(team1Pos25);
        team1Pos25.setLayout(team1Pos25Layout);
        team1Pos25Layout.setHorizontalGroup(
            team1Pos25Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos25Layout.setVerticalGroup(
            team1Pos25Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel26.add(team1Pos25, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos25.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos25.setMaximumSize(new Dimension(25, 25));
        team2Pos25.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos25Layout = new GroupLayout(team2Pos25);
        team2Pos25.setLayout(team2Pos25Layout);
        team2Pos25Layout.setHorizontalGroup(
            team2Pos25Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos25Layout.setVerticalGroup(
            team2Pos25Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel26.add(team2Pos25, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel27.setBackground(Color.green);
        jPanel27.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel27.setMaximumSize(new Dimension(75, 75));
        jPanel27.setLayout(new AbsoluteLayout());

        team1Pos26.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos26.setMaximumSize(new Dimension(25, 25));
        team1Pos26.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos26Layout = new GroupLayout(team1Pos26);
        team1Pos26.setLayout(team1Pos26Layout);
        team1Pos26Layout.setHorizontalGroup(
            team1Pos26Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos26Layout.setVerticalGroup(
            team1Pos26Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel27.add(team1Pos26, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos26.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos26.setMaximumSize(new Dimension(25, 25));
        team2Pos26.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos26Layout = new GroupLayout(team2Pos26);
        team2Pos26.setLayout(team2Pos26Layout);
        team2Pos26Layout.setHorizontalGroup(
            team2Pos26Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos26Layout.setVerticalGroup(
            team2Pos26Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel27.add(team2Pos26, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel28.setBackground(new Color(245, 245, 220));
        jPanel28.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel28.setMaximumSize(new Dimension(75, 75));
        jPanel28.setLayout(new AbsoluteLayout());

        team1Pos27.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos27.setMaximumSize(new Dimension(25, 25));
        team1Pos27.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos27Layout = new GroupLayout(team1Pos27);
        team1Pos27.setLayout(team1Pos27Layout);
        team1Pos27Layout.setHorizontalGroup(
            team1Pos27Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos27Layout.setVerticalGroup(
            team1Pos27Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel28.add(team1Pos27, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos27.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos27.setMaximumSize(new Dimension(25, 25));
        team2Pos27.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos27Layout = new GroupLayout(team2Pos27);
        team2Pos27.setLayout(team2Pos27Layout);
        team2Pos27Layout.setHorizontalGroup(
            team2Pos27Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos27Layout.setVerticalGroup(
            team2Pos27Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel28.add(team2Pos27, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel29.setBackground(Color.blue);
        jPanel29.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel29.setMaximumSize(new Dimension(75, 75));
        jPanel29.setLayout(new AbsoluteLayout());

        team1Pos28.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos28.setMaximumSize(new Dimension(25, 25));
        team1Pos28.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos28Layout = new GroupLayout(team1Pos28);
        team1Pos28.setLayout(team1Pos28Layout);
        team1Pos28Layout.setHorizontalGroup(
            team1Pos28Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos28Layout.setVerticalGroup(
            team1Pos28Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel29.add(team1Pos28, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos28.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos28.setMaximumSize(new Dimension(25, 25));
        team2Pos28.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos28Layout = new GroupLayout(team2Pos28);
        team2Pos28.setLayout(team2Pos28Layout);
        team2Pos28Layout.setHorizontalGroup(
            team2Pos28Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos28Layout.setVerticalGroup(
            team2Pos28Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel29.add(team2Pos28, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel30.setBackground(Color.yellow);
        jPanel30.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel30.setMaximumSize(new Dimension(75, 75));
        jPanel30.setLayout(new AbsoluteLayout());

        team1Pos29.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos29.setMaximumSize(new Dimension(25, 25));
        team1Pos29.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos29Layout = new GroupLayout(team1Pos29);
        team1Pos29.setLayout(team1Pos29Layout);
        team1Pos29Layout.setHorizontalGroup(
            team1Pos29Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos29Layout.setVerticalGroup(
            team1Pos29Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel30.add(team1Pos29, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos29.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos29.setMaximumSize(new Dimension(25, 25));
        team2Pos29.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos29Layout = new GroupLayout(team2Pos29);
        team2Pos29.setLayout(team2Pos29Layout);
        team2Pos29Layout.setHorizontalGroup(
            team2Pos29Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos29Layout.setVerticalGroup(
            team2Pos29Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel30.add(team2Pos29, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel31.setBackground(Color.red);
        jPanel31.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel31.setMaximumSize(new Dimension(75, 75));
        jPanel31.setLayout(new AbsoluteLayout());

        team1Pos30.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos30.setMaximumSize(new Dimension(25, 25));
        team1Pos30.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos30Layout = new GroupLayout(team1Pos30);
        team1Pos30.setLayout(team1Pos30Layout);
        team1Pos30Layout.setHorizontalGroup(
            team1Pos30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos30Layout.setVerticalGroup(
            team1Pos30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel31.add(team1Pos30, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos30.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos30.setMaximumSize(new Dimension(25, 25));
        team2Pos30.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos30Layout = new GroupLayout(team2Pos30);
        team2Pos30.setLayout(team2Pos30Layout);
        team2Pos30Layout.setHorizontalGroup(
            team2Pos30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos30Layout.setVerticalGroup(
            team2Pos30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel31.add(team2Pos30, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel32.setBackground(Color.green);
        jPanel32.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel32.setMaximumSize(new Dimension(75, 75));
        jPanel32.setLayout(new AbsoluteLayout());

        team1Pos31.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos31.setMaximumSize(new Dimension(25, 25));
        team1Pos31.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos31Layout = new GroupLayout(team1Pos31);
        team1Pos31.setLayout(team1Pos31Layout);
        team1Pos31Layout.setHorizontalGroup(
            team1Pos31Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos31Layout.setVerticalGroup(
            team1Pos31Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel32.add(team1Pos31, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos31.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos31.setMaximumSize(new Dimension(25, 25));
        team2Pos31.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos31Layout = new GroupLayout(team2Pos31);
        team2Pos31.setLayout(team2Pos31Layout);
        team2Pos31Layout.setHorizontalGroup(
            team2Pos31Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos31Layout.setVerticalGroup(
            team2Pos31Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel32.add(team2Pos31, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel33.setBackground(new Color(245, 245, 220));
        jPanel33.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel33.setMaximumSize(new Dimension(75, 75));
        jPanel33.setLayout(new AbsoluteLayout());

        team1Pos32.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos32.setMaximumSize(new Dimension(25, 25));
        team1Pos32.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos32Layout = new GroupLayout(team1Pos32);
        team1Pos32.setLayout(team1Pos32Layout);
        team1Pos32Layout.setHorizontalGroup(
            team1Pos32Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos32Layout.setVerticalGroup(
            team1Pos32Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel33.add(team1Pos32, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos32.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos32.setMaximumSize(new Dimension(25, 25));
        team2Pos32.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos32Layout = new GroupLayout(team2Pos32);
        team2Pos32.setLayout(team2Pos32Layout);
        team2Pos32Layout.setHorizontalGroup(
            team2Pos32Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos32Layout.setVerticalGroup(
            team2Pos32Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel33.add(team2Pos32, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel34.setBackground(Color.blue);
        jPanel34.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel34.setMaximumSize(new Dimension(75, 75));
        jPanel34.setLayout(new AbsoluteLayout());

        team1Pos33.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos33.setMaximumSize(new Dimension(25, 25));
        team1Pos33.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos33Layout = new GroupLayout(team1Pos33);
        team1Pos33.setLayout(team1Pos33Layout);
        team1Pos33Layout.setHorizontalGroup(
            team1Pos33Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos33Layout.setVerticalGroup(
            team1Pos33Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel34.add(team1Pos33, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos33.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos33.setMaximumSize(new Dimension(25, 25));
        team2Pos33.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos33Layout = new GroupLayout(team2Pos33);
        team2Pos33.setLayout(team2Pos33Layout);
        team2Pos33Layout.setHorizontalGroup(
            team2Pos33Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos33Layout.setVerticalGroup(
            team2Pos33Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel34.add(team2Pos33, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel35.setBackground(Color.yellow);
        jPanel35.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel35.setMaximumSize(new Dimension(75, 75));
        jPanel35.setLayout(new AbsoluteLayout());

        team1Pos34.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos34.setMaximumSize(new Dimension(25, 25));
        team1Pos34.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos34Layout = new GroupLayout(team1Pos34);
        team1Pos34.setLayout(team1Pos34Layout);
        team1Pos34Layout.setHorizontalGroup(
            team1Pos34Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos34Layout.setVerticalGroup(
            team1Pos34Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel35.add(team1Pos34, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos34.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos34.setMaximumSize(new Dimension(25, 25));
        team2Pos34.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos34Layout = new GroupLayout(team2Pos34);
        team2Pos34.setLayout(team2Pos34Layout);
        team2Pos34Layout.setHorizontalGroup(
            team2Pos34Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos34Layout.setVerticalGroup(
            team2Pos34Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel35.add(team2Pos34, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel36.setBackground(Color.red);
        jPanel36.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel36.setMaximumSize(new Dimension(75, 75));
        jPanel36.setLayout(new AbsoluteLayout());

        team1Pos35.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos35.setMaximumSize(new Dimension(25, 25));
        team1Pos35.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos35Layout = new GroupLayout(team1Pos35);
        team1Pos35.setLayout(team1Pos35Layout);
        team1Pos35Layout.setHorizontalGroup(
            team1Pos35Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos35Layout.setVerticalGroup(
            team1Pos35Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel36.add(team1Pos35, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos35.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos35.setMaximumSize(new Dimension(25, 25));
        team2Pos35.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos35Layout = new GroupLayout(team2Pos35);
        team2Pos35.setLayout(team2Pos35Layout);
        team2Pos35Layout.setHorizontalGroup(
            team2Pos35Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos35Layout.setVerticalGroup(
            team2Pos35Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel36.add(team2Pos35, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel37.setBackground(Color.green);
        jPanel37.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel37.setMaximumSize(new Dimension(75, 75));
        jPanel37.setLayout(new AbsoluteLayout());

        team1Pos36.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos36.setMaximumSize(new Dimension(25, 25));
        team1Pos36.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos36Layout = new GroupLayout(team1Pos36);
        team1Pos36.setLayout(team1Pos36Layout);
        team1Pos36Layout.setHorizontalGroup(
            team1Pos36Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos36Layout.setVerticalGroup(
            team1Pos36Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel37.add(team1Pos36, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos36.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos36.setMaximumSize(new Dimension(25, 25));
        team2Pos36.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos36Layout = new GroupLayout(team2Pos36);
        team2Pos36.setLayout(team2Pos36Layout);
        team2Pos36Layout.setHorizontalGroup(
            team2Pos36Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos36Layout.setVerticalGroup(
            team2Pos36Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel37.add(team2Pos36, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel38.setBackground(new Color(245, 245, 220));
        jPanel38.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel38.setMaximumSize(new Dimension(75, 75));
        jPanel38.setLayout(new AbsoluteLayout());

        team1Pos37.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos37.setMaximumSize(new Dimension(25, 25));
        team1Pos37.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos37Layout = new GroupLayout(team1Pos37);
        team1Pos37.setLayout(team1Pos37Layout);
        team1Pos37Layout.setHorizontalGroup(
            team1Pos37Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos37Layout.setVerticalGroup(
            team1Pos37Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel38.add(team1Pos37, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos37.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos37.setMaximumSize(new Dimension(25, 25));
        team2Pos37.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos37Layout = new GroupLayout(team2Pos37);
        team2Pos37.setLayout(team2Pos37Layout);
        team2Pos37Layout.setHorizontalGroup(
            team2Pos37Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos37Layout.setVerticalGroup(
            team2Pos37Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel38.add(team2Pos37, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel39.setBackground(Color.blue);
        jPanel39.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel39.setMaximumSize(new Dimension(75, 75));
        jPanel39.setLayout(new AbsoluteLayout());

        team1Pos38.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos38.setMaximumSize(new Dimension(25, 25));
        team1Pos38.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos38Layout = new GroupLayout(team1Pos38);
        team1Pos38.setLayout(team1Pos38Layout);
        team1Pos38Layout.setHorizontalGroup(
            team1Pos38Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos38Layout.setVerticalGroup(
            team1Pos38Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel39.add(team1Pos38, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos38.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos38.setMaximumSize(new Dimension(25, 25));
        team2Pos38.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos38Layout = new GroupLayout(team2Pos38);
        team2Pos38.setLayout(team2Pos38Layout);
        team2Pos38Layout.setHorizontalGroup(
            team2Pos38Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos38Layout.setVerticalGroup(
            team2Pos38Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel39.add(team2Pos38, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel40.setBackground(Color.yellow);
        jPanel40.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel40.setMaximumSize(new Dimension(75, 75));
        jPanel40.setLayout(new AbsoluteLayout());

        team1Pos39.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos39.setMaximumSize(new Dimension(25, 25));
        team1Pos39.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos39Layout = new GroupLayout(team1Pos39);
        team1Pos39.setLayout(team1Pos39Layout);
        team1Pos39Layout.setHorizontalGroup(
            team1Pos39Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos39Layout.setVerticalGroup(
            team1Pos39Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel40.add(team1Pos39, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos39.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos39.setMaximumSize(new Dimension(25, 25));
        team2Pos39.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos39Layout = new GroupLayout(team2Pos39);
        team2Pos39.setLayout(team2Pos39Layout);
        team2Pos39Layout.setHorizontalGroup(
            team2Pos39Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos39Layout.setVerticalGroup(
            team2Pos39Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel40.add(team2Pos39, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel41.setBackground(Color.red);
        jPanel41.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel41.setMaximumSize(new Dimension(75, 75));
        jPanel41.setLayout(new AbsoluteLayout());

        team1Pos40.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos40.setMaximumSize(new Dimension(25, 25));
        team1Pos40.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos40Layout = new GroupLayout(team1Pos40);
        team1Pos40.setLayout(team1Pos40Layout);
        team1Pos40Layout.setHorizontalGroup(
            team1Pos40Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos40Layout.setVerticalGroup(
            team1Pos40Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel41.add(team1Pos40, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos40.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos40.setMaximumSize(new Dimension(25, 25));
        team2Pos40.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos40Layout = new GroupLayout(team2Pos40);
        team2Pos40.setLayout(team2Pos40Layout);
        team2Pos40Layout.setHorizontalGroup(
            team2Pos40Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos40Layout.setVerticalGroup(
            team2Pos40Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel41.add(team2Pos40, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel42.setBackground(Color.green);
        jPanel42.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel42.setMaximumSize(new Dimension(75, 75));
        jPanel42.setLayout(new AbsoluteLayout());

        team1Pos41.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos41.setMaximumSize(new Dimension(25, 25));
        team1Pos41.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos41Layout = new GroupLayout(team1Pos41);
        team1Pos41.setLayout(team1Pos41Layout);
        team1Pos41Layout.setHorizontalGroup(
            team1Pos41Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos41Layout.setVerticalGroup(
            team1Pos41Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel42.add(team1Pos41, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos41.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos41.setMaximumSize(new Dimension(25, 25));
        team2Pos41.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos41Layout = new GroupLayout(team2Pos41);
        team2Pos41.setLayout(team2Pos41Layout);
        team2Pos41Layout.setHorizontalGroup(
            team2Pos41Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos41Layout.setVerticalGroup(
            team2Pos41Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel42.add(team2Pos41, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel43.setBackground(new Color(245, 245, 220));
        jPanel43.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel43.setMaximumSize(new Dimension(75, 75));
        jPanel43.setLayout(new AbsoluteLayout());

        team1Pos42.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos42.setMaximumSize(new Dimension(25, 25));
        team1Pos42.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos42Layout = new GroupLayout(team1Pos42);
        team1Pos42.setLayout(team1Pos42Layout);
        team1Pos42Layout.setHorizontalGroup(
            team1Pos42Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos42Layout.setVerticalGroup(
            team1Pos42Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel43.add(team1Pos42, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos42.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos42.setMaximumSize(new Dimension(25, 25));
        team2Pos42.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos42Layout = new GroupLayout(team2Pos42);
        team2Pos42.setLayout(team2Pos42Layout);
        team2Pos42Layout.setHorizontalGroup(
            team2Pos42Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos42Layout.setVerticalGroup(
            team2Pos42Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel43.add(team2Pos42, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel44.setBackground(Color.blue);
        jPanel44.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel44.setMaximumSize(new Dimension(75, 75));
        jPanel44.setLayout(new AbsoluteLayout());

        team1Pos43.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos43.setMaximumSize(new Dimension(25, 25));
        team1Pos43.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos43Layout = new GroupLayout(team1Pos43);
        team1Pos43.setLayout(team1Pos43Layout);
        team1Pos43Layout.setHorizontalGroup(
            team1Pos43Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos43Layout.setVerticalGroup(
            team1Pos43Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel44.add(team1Pos43, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos43.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos43.setMaximumSize(new Dimension(25, 25));
        team2Pos43.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos43Layout = new GroupLayout(team2Pos43);
        team2Pos43.setLayout(team2Pos43Layout);
        team2Pos43Layout.setHorizontalGroup(
            team2Pos43Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos43Layout.setVerticalGroup(
            team2Pos43Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel44.add(team2Pos43, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel45.setBackground(Color.yellow);
        jPanel45.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel45.setMaximumSize(new Dimension(75, 75));
        jPanel45.setLayout(new AbsoluteLayout());

        team1Pos44.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos44.setMaximumSize(new Dimension(25, 25));
        team1Pos44.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos44Layout = new GroupLayout(team1Pos44);
        team1Pos44.setLayout(team1Pos44Layout);
        team1Pos44Layout.setHorizontalGroup(
            team1Pos44Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos44Layout.setVerticalGroup(
            team1Pos44Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel45.add(team1Pos44, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos44.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos44.setMaximumSize(new Dimension(25, 25));
        team2Pos44.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos44Layout = new GroupLayout(team2Pos44);
        team2Pos44.setLayout(team2Pos44Layout);
        team2Pos44Layout.setHorizontalGroup(
            team2Pos44Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos44Layout.setVerticalGroup(
            team2Pos44Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel45.add(team2Pos44, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel46.setBackground(Color.red);
        jPanel46.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel46.setMaximumSize(new Dimension(75, 75));
        jPanel46.setLayout(new AbsoluteLayout());

        team1Pos45.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos45.setMaximumSize(new Dimension(25, 25));
        team1Pos45.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos45Layout = new GroupLayout(team1Pos45);
        team1Pos45.setLayout(team1Pos45Layout);
        team1Pos45Layout.setHorizontalGroup(
            team1Pos45Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos45Layout.setVerticalGroup(
            team1Pos45Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel46.add(team1Pos45, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos45.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos45.setMaximumSize(new Dimension(25, 25));
        team2Pos45.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos45Layout = new GroupLayout(team2Pos45);
        team2Pos45.setLayout(team2Pos45Layout);
        team2Pos45Layout.setHorizontalGroup(
            team2Pos45Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos45Layout.setVerticalGroup(
            team2Pos45Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel46.add(team2Pos45, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel47.setBackground(Color.green);
        jPanel47.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel47.setMaximumSize(new Dimension(75, 75));
        jPanel47.setLayout(new AbsoluteLayout());

        team1Pos46.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos46.setMaximumSize(new Dimension(25, 25));
        team1Pos46.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos46Layout = new GroupLayout(team1Pos46);
        team1Pos46.setLayout(team1Pos46Layout);
        team1Pos46Layout.setHorizontalGroup(
            team1Pos46Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos46Layout.setVerticalGroup(
            team1Pos46Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel47.add(team1Pos46, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos46.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos46.setMaximumSize(new Dimension(25, 25));
        team2Pos46.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos46Layout = new GroupLayout(team2Pos46);
        team2Pos46.setLayout(team2Pos46Layout);
        team2Pos46Layout.setHorizontalGroup(
            team2Pos46Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos46Layout.setVerticalGroup(
            team2Pos46Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel47.add(team2Pos46, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel48.setBackground(new Color(245, 245, 220));
        jPanel48.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel48.setMaximumSize(new Dimension(75, 75));
        jPanel48.setLayout(new AbsoluteLayout());

        team1Pos47.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos47.setMaximumSize(new Dimension(25, 25));
        team1Pos47.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos47Layout = new GroupLayout(team1Pos47);
        team1Pos47.setLayout(team1Pos47Layout);
        team1Pos47Layout.setHorizontalGroup(
            team1Pos47Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos47Layout.setVerticalGroup(
            team1Pos47Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel48.add(team1Pos47, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos47.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos47.setMaximumSize(new Dimension(25, 25));
        team2Pos47.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos47Layout = new GroupLayout(team2Pos47);
        team2Pos47.setLayout(team2Pos47Layout);
        team2Pos47Layout.setHorizontalGroup(
            team2Pos47Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos47Layout.setVerticalGroup(
            team2Pos47Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel48.add(team2Pos47, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel49.setBackground(Color.blue);
        jPanel49.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel49.setMaximumSize(new Dimension(75, 75));
        jPanel49.setLayout(new AbsoluteLayout());

        team1Pos48.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos48.setMaximumSize(new Dimension(25, 25));
        team1Pos48.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos48Layout = new GroupLayout(team1Pos48);
        team1Pos48.setLayout(team1Pos48Layout);
        team1Pos48Layout.setHorizontalGroup(
            team1Pos48Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos48Layout.setVerticalGroup(
            team1Pos48Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel49.add(team1Pos48, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos48.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos48.setMaximumSize(new Dimension(25, 25));
        team2Pos48.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos48Layout = new GroupLayout(team2Pos48);
        team2Pos48.setLayout(team2Pos48Layout);
        team2Pos48Layout.setHorizontalGroup(
            team2Pos48Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos48Layout.setVerticalGroup(
            team2Pos48Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel49.add(team2Pos48, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel50.setBackground(Color.yellow);
        jPanel50.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel50.setMaximumSize(new Dimension(75, 75));
        jPanel50.setLayout(new AbsoluteLayout());

        team1Pos49.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos49.setMaximumSize(new Dimension(25, 25));
        team1Pos49.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos49Layout = new GroupLayout(team1Pos49);
        team1Pos49.setLayout(team1Pos49Layout);
        team1Pos49Layout.setHorizontalGroup(
            team1Pos49Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos49Layout.setVerticalGroup(
            team1Pos49Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel50.add(team1Pos49, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos49.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos49.setMaximumSize(new Dimension(25, 25));
        team2Pos49.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos49Layout = new GroupLayout(team2Pos49);
        team2Pos49.setLayout(team2Pos49Layout);
        team2Pos49Layout.setHorizontalGroup(
            team2Pos49Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos49Layout.setVerticalGroup(
            team2Pos49Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel50.add(team2Pos49, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel51.setBackground(Color.red);
        jPanel51.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel51.setMaximumSize(new Dimension(75, 75));
        jPanel51.setLayout(new AbsoluteLayout());

        team1Pos50.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos50.setMaximumSize(new Dimension(25, 25));
        team1Pos50.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos50Layout = new GroupLayout(team1Pos50);
        team1Pos50.setLayout(team1Pos50Layout);
        team1Pos50Layout.setHorizontalGroup(
            team1Pos50Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos50Layout.setVerticalGroup(
            team1Pos50Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel51.add(team1Pos50, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos50.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos50.setMaximumSize(new Dimension(25, 25));
        team2Pos50.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos50Layout = new GroupLayout(team2Pos50);
        team2Pos50.setLayout(team2Pos50Layout);
        team2Pos50Layout.setHorizontalGroup(
            team2Pos50Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos50Layout.setVerticalGroup(
            team2Pos50Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel51.add(team2Pos50, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel52.setBackground(Color.green);
        jPanel52.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel52.setMaximumSize(new Dimension(75, 75));
        jPanel52.setLayout(new AbsoluteLayout());

        team1Pos51.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos51.setMaximumSize(new Dimension(25, 25));
        team1Pos51.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos51Layout = new GroupLayout(team1Pos51);
        team1Pos51.setLayout(team1Pos51Layout);
        team1Pos51Layout.setHorizontalGroup(
            team1Pos51Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos51Layout.setVerticalGroup(
            team1Pos51Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel52.add(team1Pos51, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos51.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos51.setMaximumSize(new Dimension(25, 25));
        team2Pos51.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos51Layout = new GroupLayout(team2Pos51);
        team2Pos51.setLayout(team2Pos51Layout);
        team2Pos51Layout.setHorizontalGroup(
            team2Pos51Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos51Layout.setVerticalGroup(
            team2Pos51Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel52.add(team2Pos51, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel53.setBackground(new Color(245, 245, 220));
        jPanel53.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel53.setMaximumSize(new Dimension(75, 75));
        jPanel53.setLayout(new AbsoluteLayout());

        team1Pos52.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos52.setMaximumSize(new Dimension(25, 25));
        team1Pos52.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos52Layout = new GroupLayout(team1Pos52);
        team1Pos52.setLayout(team1Pos52Layout);
        team1Pos52Layout.setHorizontalGroup(
            team1Pos52Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos52Layout.setVerticalGroup(
            team1Pos52Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel53.add(team1Pos52, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos52.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos52.setMaximumSize(new Dimension(25, 25));
        team2Pos52.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos52Layout = new GroupLayout(team2Pos52);
        team2Pos52.setLayout(team2Pos52Layout);
        team2Pos52Layout.setHorizontalGroup(
            team2Pos52Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos52Layout.setVerticalGroup(
            team2Pos52Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel53.add(team2Pos52, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel54.setBackground(Color.blue);
        jPanel54.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel54.setMaximumSize(new Dimension(75, 75));
        jPanel54.setLayout(new AbsoluteLayout());

        team1Pos53.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos53.setMaximumSize(new Dimension(25, 25));
        team1Pos53.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos53Layout = new GroupLayout(team1Pos53);
        team1Pos53.setLayout(team1Pos53Layout);
        team1Pos53Layout.setHorizontalGroup(
            team1Pos53Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos53Layout.setVerticalGroup(
            team1Pos53Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel54.add(team1Pos53, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos53.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos53.setMaximumSize(new Dimension(25, 25));
        team2Pos53.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos53Layout = new GroupLayout(team2Pos53);
        team2Pos53.setLayout(team2Pos53Layout);
        team2Pos53Layout.setHorizontalGroup(
            team2Pos53Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos53Layout.setVerticalGroup(
            team2Pos53Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel54.add(team2Pos53, new AbsoluteConstraints(50, 0, -1, -1));

        jPanel55.setBackground(Color.yellow);
        jPanel55.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel55.setMaximumSize(new Dimension(75, 75));
        jPanel55.setLayout(new AbsoluteLayout());

        team1Pos54.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team1Pos54.setMaximumSize(new Dimension(25, 25));
        team1Pos54.setMinimumSize(new Dimension(25, 25));

        GroupLayout team1Pos54Layout = new GroupLayout(team1Pos54);
        team1Pos54.setLayout(team1Pos54Layout);
        team1Pos54Layout.setHorizontalGroup(
            team1Pos54Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team1Pos54Layout.setVerticalGroup(
            team1Pos54Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel55.add(team1Pos54, new AbsoluteConstraints(0, 50, -1, -1));

        team2Pos54.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        team2Pos54.setMaximumSize(new Dimension(25, 25));
        team2Pos54.setMinimumSize(new Dimension(25, 25));

        GroupLayout team2Pos54Layout = new GroupLayout(team2Pos54);
        team2Pos54.setLayout(team2Pos54Layout);
        team2Pos54Layout.setHorizontalGroup(
            team2Pos54Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        team2Pos54Layout.setVerticalGroup(
            team2Pos54Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel55.add(team2Pos54, new AbsoluteConstraints(50, 0, -1, -1));

        startLabel.setHorizontalAlignment(SwingConstants.CENTER);
        startLabel.setText("START");
        jPanel55.add(startLabel, new AbsoluteConstraints(20, 30, -1, -1));

        diceBox.setMaximumSize(new Dimension(300, 200));
        diceBox.setMinimumSize(new Dimension(300, 200));

        dieDescriptor.setFont(new Font("Times New Roman", 0, 14)); // NOI18N
        dieDescriptor.setText("Click the Roll button below to roll the die!");

        dieNumberLabel.setFont(new Font("Stencil", 0, 36)); // NOI18N
        dieNumberLabel.setText("6");

        rollButton.setFont(new Font("Times New Roman", 0, 11)); // NOI18N
        rollButton.setText("Roll!");
        rollButton.setToolTipText("Click me to Roll the Dice!");
        rollButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                rollButtonMouseClicked(evt);
            }
        });

        GroupLayout diceBoxLayout = new GroupLayout(diceBox);
        diceBox.setLayout(diceBoxLayout);
        diceBoxLayout.setHorizontalGroup(
            diceBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(diceBoxLayout.createSequentialGroup()
                .addComponent(dieDescriptor, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dieNumberLabel, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
            .addGroup(diceBoxLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(rollButton, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diceBoxLayout.setVerticalGroup(
            diceBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(diceBoxLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(diceBoxLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(dieDescriptor, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addComponent(dieNumberLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(rollButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        teamNumberToRollLabel.setFont(new Font("Times New Roman", 0, 14)); // NOI18N
        teamNumberToRollLabel.setHorizontalAlignment(SwingConstants.CENTER);
        teamNumberToRollLabel.setText("Team #, it's your turn to roll!");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel55, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel54, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel53, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel52, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel51, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel38, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel39, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel47, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel46, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel45, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel48, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel49, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel44, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel41, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel42, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel43, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(teamNumberToRollLabel, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(diceBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel50, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel51, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel52, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel53, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel55, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel49, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel47, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel46, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel45, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(972, 972, 972))
                                    .addGroup(GroupLayout.Alignment.LEADING, layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel39, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel38, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jPanel19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel41, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jPanel44, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel42, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel43, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jPanel24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel48, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(teamNumberToRollLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(diceBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// @formatter:on

    private void makeArrayFromPanels() {
        panels = new ArrayList<GameTile>(55);
        panels.add(new GameTile(jPanel1, team1PosEnd, team2PosEnd));
        panels.add(new GameTile(jPanel2, team1Pos1, team2Pos1));
        panels.add(new GameTile(jPanel3, team1Pos2, team2Pos2));
        panels.add(new GameTile(jPanel4, team1Pos3, team2Pos3));
        panels.add(new GameTile(jPanel5, team1Pos4, team2Pos4));
        panels.add(new GameTile(jPanel6, team1Pos5, team2Pos5));
        panels.add(new GameTile(jPanel7, team1Pos6, team2Pos6));
        panels.add(new GameTile(jPanel8, team1Pos7, team2Pos7));
        panels.add(new GameTile(jPanel9, team1Pos8, team2Pos8));
        panels.add(new GameTile(jPanel10, team1Pos9, team2Pos9));
        panels.add(new GameTile(jPanel11, team1Pos10, team2Pos10));
        panels.add(new GameTile(jPanel12, team1Pos11, team2Pos11));
        panels.add(new GameTile(jPanel13, team1Pos12, team2Pos12));
        panels.add(new GameTile(jPanel14, team1Pos13, team2Pos13));
        panels.add(new GameTile(jPanel15, team1Pos14, team2Pos14));
        panels.add(new GameTile(jPanel16, team1Pos15, team2Pos15));
        panels.add(new GameTile(jPanel17, team1Pos16, team2Pos16));
        panels.add(new GameTile(jPanel18, team1Pos17, team2Pos17));
        panels.add(new GameTile(jPanel19, team1Pos18, team2Pos18));
        panels.add(new GameTile(jPanel20, team1Pos19, team2Pos19));
        panels.add(new GameTile(jPanel21, team1Pos20, team2Pos20));
        panels.add(new GameTile(jPanel22, team1Pos21, team2Pos21));
        panels.add(new GameTile(jPanel23, team1Pos22, team2Pos22));
        panels.add(new GameTile(jPanel24, team1Pos23, team2Pos23));
        panels.add(new GameTile(jPanel25, team1Pos24, team2Pos24));
        panels.add(new GameTile(jPanel26, team1Pos25, team2Pos25));
        panels.add(new GameTile(jPanel27, team1Pos26, team2Pos26));
        panels.add(new GameTile(jPanel28, team1Pos27, team2Pos27));
        panels.add(new GameTile(jPanel29, team1Pos28, team2Pos28));
        panels.add(new GameTile(jPanel30, team1Pos29, team2Pos29));
        panels.add(new GameTile(jPanel31, team1Pos30, team2Pos30));
        panels.add(new GameTile(jPanel32, team1Pos31, team2Pos31));
        panels.add(new GameTile(jPanel33, team1Pos32, team2Pos32));
        panels.add(new GameTile(jPanel34, team1Pos33, team2Pos33));
        panels.add(new GameTile(jPanel35, team1Pos34, team2Pos34));
        panels.add(new GameTile(jPanel36, team1Pos35, team2Pos35));
        panels.add(new GameTile(jPanel37, team1Pos36, team2Pos36));
        panels.add(new GameTile(jPanel38, team1Pos37, team2Pos37));
        panels.add(new GameTile(jPanel39, team1Pos38, team2Pos38));
        panels.add(new GameTile(jPanel40, team1Pos39, team2Pos39));
        panels.add(new GameTile(jPanel41, team1Pos40, team2Pos40));
        panels.add(new GameTile(jPanel42, team1Pos41, team2Pos41));
        panels.add(new GameTile(jPanel43, team1Pos42, team2Pos42));
        panels.add(new GameTile(jPanel44, team1Pos43, team2Pos43));
        panels.add(new GameTile(jPanel45, team1Pos44, team2Pos44));
        panels.add(new GameTile(jPanel46, team1Pos45, team2Pos45));
        panels.add(new GameTile(jPanel47, team1Pos46, team2Pos46));
        panels.add(new GameTile(jPanel48, team1Pos47, team2Pos47));
        panels.add(new GameTile(jPanel49, team1Pos48, team2Pos48));
        panels.add(new GameTile(jPanel50, team1Pos49, team2Pos49));
        panels.add(new GameTile(jPanel51, team1Pos50, team2Pos50));
        panels.add(new GameTile(jPanel52, team1Pos51, team2Pos51));
        panels.add(new GameTile(jPanel53, team1Pos52, team2Pos52));
        panels.add(new GameTile(jPanel54, team1Pos53, team2Pos53));
        panels.add(new GameTile(jPanel55, team1Pos54, team2Pos54));
    }

    private void moveTeamOneToPanel(GameTile panelToMoveTo) {
        GameTile current = panels.get(teamOnePos);
        current.disableOne();
        panelToMoveTo.enableOne();
    }

    private void moveTeamTwoToPanel(GameTile panelToMoveTo) {
        GameTile current = panels.get(teamTwoPos);
        current.disableTwo();
        panelToMoveTo.enableTwo();
    }

    /**
     * Called when we roll the dice, this also initates a turn.
     * 
     * @param evt
     */
    private void rollButtonMouseClicked(MouseEvent evt) {
        if (teamNumber == 1) {
            int number = pictionary.getRandom(1, 6);
            dieNumberLabel.setText("" + number);
            GameTile panelToMoveTo = panels.get(teamOnePos - number);

            moveTeamOneToPanel(panelToMoveTo);
            teamOnePos = teamOnePos - number;
            // pictionary.doCardGame(1, panelToMoveTo.getColor());
            teamNumber = 2;
            updateteamRollingText("Team " + teamNumber + ", it's your turn to roll!");
            return;
        }
        if (teamNumber == 2) {
            int number = pictionary.getRandom(1, 6);
            dieNumberLabel.setText("" + number);
            GameTile panelToMoveTo = panels.get(teamTwoPos - number);

            moveTeamTwoToPanel(panelToMoveTo);
            teamTwoPos = teamTwoPos - number;
            // pictionary.doCardGame(2, panelToMoveTo.getColor());
            teamNumber = 1;
            updateteamRollingText("Team " + teamNumber + ", it's your turn to roll!");
        }
    }

    public void setTurn(int teamTurn) {
        teamNumber = teamTurn;
    }

    private void updateteamRollingText(String newText) {
        teamNumberToRollLabel.setText(newText);
    }
}
