
public class CasinoGUI extends javax.swing.JFrame {

    public CasinoGUI(StatsGUI statsGUI) {
        initComponents();
    }

    public CasinoGUI() {
        initComponents();
        updateCurrentActiveSaveLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        slotsMachineButton = new javax.swing.JButton();
        statsButton = new javax.swing.JButton();
        exitProgram = new javax.swing.JButton();
        slotMachineLabel = new javax.swing.JLabel();
        statsLabel = new javax.swing.JLabel();
        closeProgramLabel = new javax.swing.JLabel();
        changeSave = new javax.swing.JButton();
        DBSavesLabel = new javax.swing.JLabel();
        currentActiveSave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setText("Welcome to the Casino");

        slotsMachineButton.setText("Slots Machine");
        slotsMachineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotsMachineButtonActionPerformed(evt);
            }
        });

        statsButton.setText("View Stats");
        statsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsButtonActionPerformed(evt);
            }
        });

        exitProgram.setText("Exit Progrm");
        exitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramActionPerformed(evt);
            }
        });

        slotMachineLabel.setText("Play Slots Machine");

        statsLabel.setText("View All Time Statistics");

        closeProgramLabel.setText("Close Program");

        changeSave.setText("Change Save");
        changeSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSaveActionPerformed(evt);
            }
        });

        DBSavesLabel.setText("View All Saves in Database");

        currentActiveSave.setText("Current Save : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(changeSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitProgram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slotsMachineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(slotMachineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(statsLabel)
                                    .addGap(0, 25, Short.MAX_VALUE)))
                            .addComponent(closeProgramLabel)
                            .addComponent(DBSavesLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(currentActiveSave)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slotsMachineButton)
                    .addComponent(slotMachineLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statsButton)
                    .addComponent(statsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeSave)
                    .addComponent(DBSavesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitProgram)
                    .addComponent(closeProgramLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentActiveSave)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slotsMachineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotsMachineButtonActionPerformed
        if (DatabaseReader.hasEntry()) {
            SlotsMachineGUI.main(new String[0]);
            dispose();
        }
    }//GEN-LAST:event_slotsMachineButtonActionPerformed

    private void statsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsButtonActionPerformed
        StatsGUI.main(new String[0]);
        dispose();
    }//GEN-LAST:event_statsButtonActionPerformed

    private void exitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitProgramActionPerformed

    private void changeSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSaveActionPerformed
        DatabaseGUI.main(new String[0]);
        dispose();
    }//GEN-LAST:event_changeSaveActionPerformed

    private void updateCurrentActiveSaveLabel() {
        boolean hasEntry = DatabaseReader.hasEntry();
        if (hasEntry) {
            String activeSaveName = DatabaseReader.getName();
            currentActiveSave.setText("Current Save: " + activeSaveName);
        } else {
            currentActiveSave.setText("No save selected");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            CasinoGUI casinoGUI = new CasinoGUI();
            casinoGUI.setVisible(true);
            casinoGUI.updateCurrentActiveSaveLabel();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DBSavesLabel;
    private javax.swing.JButton changeSave;
    private javax.swing.JLabel closeProgramLabel;
    private javax.swing.JLabel currentActiveSave;
    private javax.swing.JButton exitProgram;
    private javax.swing.JLabel slotMachineLabel;
    private javax.swing.JButton slotsMachineButton;
    private javax.swing.JButton statsButton;
    private javax.swing.JLabel statsLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
