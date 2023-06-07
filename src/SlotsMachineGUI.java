
public class SlotsMachineGUI extends javax.swing.JFrame {

    /**
     * Creates new form SlotsMachineGUI
     */
    public SlotsMachineGUI() {
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

        title = new javax.swing.JLabel();
        rules = new javax.swing.JLabel();
        rulestext = new javax.swing.JLabel();
        RollButton = new javax.swing.JButton();
        betamount = new javax.swing.JLabel();
        BetAmountTextField = new javax.swing.JTextField();
        balance = new javax.swing.JLabel();
        BalanceValue = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        ResultVariable = new javax.swing.JLabel();
        returntomain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("SlotsMachine");

        rules.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rules.setText("Rules");

        rulestext.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rulestext.setText("Matching rolls : [1,2] = Loss | [3] = 2x Bet | [4] = 5x Bet | [5] = 20x Bet");

        RollButton.setText("Roll");
        RollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollButtonActionPerformed(evt);
            }
        });

        betamount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        betamount.setText("Bet Amount");

        BetAmountTextField.setPreferredSize(new java.awt.Dimension(80, 26));
        BetAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetAmountTextFieldActionPerformed(evt);
            }
        });

        balance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balance.setText("Balance");

        BalanceValue.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BalanceValue.setText("BalanceValue");

        result.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        result.setText("Result");

        ResultVariable.setText("     ");

        returntomain.setText("Return to Main Menu");
        returntomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returntomainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RollButton)
                        .addGap(48, 48, 48)
                        .addComponent(returntomain)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(betamount)
                            .addComponent(balance)
                            .addComponent(rules)
                            .addComponent(result))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResultVariable)
                            .addComponent(rulestext)
                            .addComponent(BalanceValue)
                            .addComponent(BetAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rules)
                    .addComponent(rulestext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balance)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BalanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betamount)
                    .addComponent(BetAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result)
                    .addComponent(ResultVariable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RollButton)
                    .addComponent(returntomain))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollButtonActionPerformed
        try {
            int betAmount = Integer.parseInt(BetAmountTextField.getText());
            int balance;
            try {
                balance = DatabaseReader.readBalance();
            } catch (Exception e) {
                // Handle the exception here
                // For example, display an error message
                ResultVariable.setText("<html><font color='red'>Error: " + e.getMessage() + "</font></html>");
                return;
            }

            if (betAmount <= balance) {
                SlotMachineCalculator slotMachine = new SlotMachineCalculator();
                int winHistory;
                int lossLifetime;
                int gamesPlayed;
                int[] rolls = new int[5];
                int rollMax = 5;
                int multiplier = 1;

                try {
                    winHistory = DatabaseReader.readPointsWon();
                    lossLifetime = DatabaseReader.readPointsLost();
                    gamesPlayed = DatabaseReader.readGamesPlayed();
                } catch (Exception e) {
                    // Handle the exception here
                    // For example, display an error message
                    ResultVariable.setText("<html><font color='red'>Error: " + e.getMessage() + "</font></html>");
                    return;
                }

                slotMachine.fillArray(rolls, rollMax);
                String arrayString = slotMachine.printArray(rolls);
                int matching = slotMachine.countOccurrences(rolls, 0);
                String resultString = "Roll: " + arrayString + "<br>Matching numbers: " + matching;
                ResultVariable.setText("<html>" + resultString + "</html>");

                balance = PayoutCalculator.calculatePayout(matching, betAmount, balance, multiplier);
                gamesPlayed++;
                if (multiplier != 0) {
                    winHistory += balance;
                } else {
                    lossLifetime -= balance;
                }

                DatabaseWriter.updateBalance(DatabaseGUI.getActiveSave(), balance);
                DatabaseWriter.updatePointsWon(DatabaseGUI.getActiveSave(), winHistory + (betAmount * multiplier));
                DatabaseWriter.updatePointsLost(DatabaseGUI.getActiveSave(), lossLifetime + betAmount);
                DatabaseWriter.increaseGamesPlayed(DatabaseGUI.getActiveSave());

                // Update the balance value of the GUI
                balance = DatabaseReader.readBalance();
                BalanceValue.setText(Integer.toString(balance));
            } else {
                ResultVariable.setText("<html><font color='red'>Bet amount invalid, try again</font></html>");
            }
        } catch (NumberFormatException e) {
            ResultVariable.setText("<html><font color='red'>Invalid input, try again</font></html>");
        }
    }//GEN-LAST:event_RollButtonActionPerformed

    private void BetAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetAmountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BetAmountTextFieldActionPerformed

    private void returntomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returntomainActionPerformed
        CasinoMainGUI cmgui = new CasinoMainGUI();
        cmgui.setVisible(true);
        dispose();
    }//GEN-LAST:event_returntomainActionPerformed

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
            java.util.logging.Logger.getLogger(SlotsMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotsMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotsMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotsMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SlotsMachineGUI gui = new SlotsMachineGUI();

                // Read the initial balance from the database
                int balance = DatabaseReader.readBalance();

                // Update the balance value of the GUI
                gui.BalanceValue.setText(Integer.toString(balance));

                gui.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceValue;
    private javax.swing.JTextField BetAmountTextField;
    private javax.swing.JLabel ResultVariable;
    private javax.swing.JButton RollButton;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel betamount;
    private javax.swing.JLabel result;
    private javax.swing.JButton returntomain;
    private javax.swing.JLabel rules;
    private javax.swing.JLabel rulestext;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
