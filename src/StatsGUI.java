
public class StatsGUI extends javax.swing.JFrame {

    /**
     * Creates new form StatsGUI
     */
    public StatsGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BalanceValue = new javax.swing.JLabel();
        PointsWon = new javax.swing.JLabel();
        PointsLost = new javax.swing.JLabel();
        NetEarnings = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GamesPlayed = new javax.swing.JLabel();
        ResetStatsButton = new javax.swing.JButton();
        ReturnToMainButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Statistics");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Balance");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Points Won");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Points Lost");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Net Earnings");

        BalanceValue.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BalanceValue.setText("Balance");

        PointsWon.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PointsWon.setText("PointsWon");

        PointsLost.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PointsLost.setText("PointsLost");

        NetEarnings.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        NetEarnings.setText("NetEarnings");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Games Played");

        GamesPlayed.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        GamesPlayed.setText("GamesPlayed");

        ResetStatsButton.setText("Reset All Stats");
        ResetStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetStatsButtonActionPerformed(evt);
            }
        });

        ReturnToMainButton.setText("Return to Main");
        ReturnToMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnToMainButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(4, 4, 4))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(ResetStatsButton)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalanceValue)
                    .addComponent(PointsWon)
                    .addComponent(PointsLost)
                    .addComponent(GamesPlayed)
                    .addComponent(NetEarnings)
                    .addComponent(ReturnToMainButton))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BalanceValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PointsWon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PointsLost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(GamesPlayed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NetEarnings))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetStatsButton)
                    .addComponent(ReturnToMainButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetStatsButtonActionPerformed
        int activeSave = DatabaseGUI.getActiveSave();
        DatabaseWriter.resetStats(activeSave);
        updateMenu(); // Update the values of the existing instance
    }//GEN-LAST:event_ResetStatsButtonActionPerformed

    private void ReturnToMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnToMainButtonActionPerformed
        CasinoMainGUI cmgui = new CasinoMainGUI();
        cmgui.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnToMainButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StatsGUI statsGUI = new StatsGUI();
                statsGUI.setVisible(true);

                statsGUI.updateMenu();
            }
        });
    }

    public void updateBalance() {
        int balance = DatabaseReader.readBalance();
        BalanceValue.setText(String.valueOf(balance));
    }

    public void updatePointsWon() {
        int pointsWon = DatabaseReader.readPointsWon();
        PointsWon.setText(String.valueOf(pointsWon));
    }

    public void updatePointsLost() {
        int pointsLost = DatabaseReader.readPointsLost();
        PointsLost.setText(String.valueOf(pointsLost));
    }

    public void updateGamesPlayed() {
        int gamesPlayed = DatabaseReader.readGamesPlayed();
        GamesPlayed.setText(String.valueOf(gamesPlayed));
    }

    public void updateNetEarnings(int pointswon, int pointslost) {
        int netEarnings = pointswon - pointslost;
        NetEarnings.setText(String.valueOf(netEarnings));
    }

    public void updateMenu() {
        try {
            updateBalance();
            int pointswon = DatabaseReader.readPointsWon();
            updatePointsWon();
            int pointslost = DatabaseReader.readPointsLost();
            updatePointsLost();
            int gamesplayed = DatabaseReader.readGamesPlayed();
            updateGamesPlayed();
            updateNetEarnings(pointswon, pointslost);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceValue;
    private javax.swing.JLabel GamesPlayed;
    private javax.swing.JLabel NetEarnings;
    private javax.swing.JLabel PointsLost;
    private javax.swing.JLabel PointsWon;
    private javax.swing.JButton ResetStatsButton;
    private javax.swing.JButton ReturnToMainButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
