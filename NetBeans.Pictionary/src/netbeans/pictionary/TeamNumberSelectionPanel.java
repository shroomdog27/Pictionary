/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans.pictionary;

/**
 *
 * @author sweetie
 */
public class TeamNumberSelectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeamNumberSelectionPanel
     */
    public TeamNumberSelectionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        team1Selection = new javax.swing.JComboBox<>();
        teamOneLabel = new javax.swing.JLabel();
        team2Selection = new javax.swing.JComboBox<>();
        teamTwoLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(250, 250));

        team1Selection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        team1Selection.setMaximumRowCount(6);
        team1Selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        team1Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team1SelectionActionPerformed(evt);
            }
        });

        teamOneLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamOneLabel.setText("Team One Size");
        teamOneLabel.setToolTipText("");

        team2Selection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        team2Selection.setMaximumRowCount(6);
        team2Selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        team2Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team2SelectionActionPerformed(evt);
            }
        });

        teamTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamTwoLabel.setText("Team Two Size");
        teamTwoLabel.setToolTipText("");
        teamTwoLabel.setPreferredSize(new java.awt.Dimension(90, 17));

        confirmButton.setText("OK");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamOneLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(team1Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamTwoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(team2Selection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(confirmButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamOneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(team1Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamTwoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(team2Selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(confirmButton)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void team1SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team1SelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_team1SelectionActionPerformed

    private void team2SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team2SelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_team2SelectionActionPerformed

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JComboBox<String> team1Selection;
    private javax.swing.JComboBox<String> team2Selection;
    private javax.swing.JLabel teamOneLabel;
    private javax.swing.JLabel teamTwoLabel;
    // End of variables declaration//GEN-END:variables
}
