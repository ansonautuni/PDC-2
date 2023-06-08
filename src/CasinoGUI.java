
public class CasinoGUI extends javax.swing.JFrame {

    private StatsGUI statsGUI;

    public CasinoGUI(StatsGUI statsGUI) {
        initComponents();
        this.statsGUI = statsGUI;
    }

    public CasinoGUI() {
        initComponents();
        updateCurrentActiveSaveLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        TitleLabel = new javax.swing.JLabel();
        SlotsMachineButton = new javax.swing.JButton();
        StatsButton = new javax.swing.JButton();
        ExitProgram = new javax.swing.JButton();
        SlotMachineLabel = new javax.swing.JLabel();
        StatsLabel = new javax.swing.JLabel();
        CloseProgramLabel = new javax.swing.JLabel();
        ChangeSave = new javax.swing.JButton();
        DBSavesLabel = new javax.swing.JLabel();
        CurrentActiveSave = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitleLabel.setText("Welcome to the Casino");

        SlotsMachineButton.setText("Slots Machine");
        SlotsMachineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotsMachineButtonActionPerformed(evt);
            }
        });

        StatsButton.setText("View Stats");
        StatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatsButtonActionPerformed(evt);
            }
        });

        ExitProgram.setText("Exit Progrm");
        ExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProgramActionPerformed(evt);
            }
        });

        SlotMachineLabel.setText("Play Slots Machine");

        StatsLabel.setText("View All Time Statistics");

        CloseProgramLabel.setText("Close Program");

        ChangeSave.setText("Change Save");
        ChangeSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeSaveActionPerformed(evt);
            }
        });

        DBSavesLabel.setText("View All Saves in Database");

        CurrentActiveSave.setText("Current Save : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChangeSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitProgram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StatsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SlotsMachineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SlotMachineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(StatsLabel)
                                    .addGap(0, 17, Short.MAX_VALUE)))
                            .addComponent(CloseProgramLabel)
                            .addComponent(DBSavesLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(CurrentActiveSave)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SlotsMachineButton)
                    .addComponent(SlotMachineLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatsButton)
                    .addComponent(StatsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeSave)
                    .addComponent(DBSavesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitProgram)
                    .addComponent(CloseProgramLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CurrentActiveSave)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SlotsMachineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotsMachineButtonActionPerformed
        SlotsMachineGUI.main(new String[0]);
        dispose();
    }//GEN-LAST:event_SlotsMachineButtonActionPerformed

    private void StatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatsButtonActionPerformed
        StatsGUI.main(new String[0]);
        dispose();
    }//GEN-LAST:event_StatsButtonActionPerformed

    private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitProgramActionPerformed

    private void ChangeSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeSaveActionPerformed
        DatabaseGUI.main(new String[0]);
        dispose();
    }//GEN-LAST:event_ChangeSaveActionPerformed

    private void updateCurrentActiveSaveLabel() {
        boolean hasEntry = DatabaseReader.hasEntry();
        if (hasEntry) {
            String activeSaveName = DatabaseReader.getName();
            CurrentActiveSave.setText("Current Save: " + activeSaveName);
        } else {
            CurrentActiveSave.setText("No save selected");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CasinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CasinoGUI casinoGUI = new CasinoGUI();
                casinoGUI.setVisible(true);
                casinoGUI.updateCurrentActiveSaveLabel();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeSave;
    private javax.swing.JLabel CloseProgramLabel;
    private javax.swing.JLabel CurrentActiveSave;
    private javax.swing.JLabel DBSavesLabel;
    private javax.swing.JButton ExitProgram;
    private javax.swing.JLabel SlotMachineLabel;
    private javax.swing.JButton SlotsMachineButton;
    private javax.swing.JButton StatsButton;
    private javax.swing.JLabel StatsLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
