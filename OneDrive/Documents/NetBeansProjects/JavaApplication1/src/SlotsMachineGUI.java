
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Deadl
 */
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
        jTextField1 = new javax.swing.JTextField();
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

        jTextField1.setPreferredSize(new java.awt.Dimension(80, 26));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance)
                    .addComponent(BalanceValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betamount)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            int betAmount = Integer.parseInt(jTextField1.getText());
            int balance = Integer.parseInt(BalanceValue.getText());

            if (betAmount <= balance) {
                slotsCalculations sm = new slotsCalculations();
                int winHistory;
                int lossLifetime;
                int gamesPlayed;
                int multiplier = 1;
                int[] rolls = new int[5];
                int rollMax = 5;

                try {
                    winHistory = savefileEditor.readWinHistory("balance.txt");
                    lossLifetime = savefileEditor.readLossHistory("balance.txt");
                    gamesPlayed = savefileEditor.readGamesPlayed("balance.txt");
                } catch (IOException e) {
                    // Handle the IOException here
                    // For example, display an error message in ResultVariable
                    ResultVariable.setText("<html><font color='red'>Error reading file: " + e.getMessage() + "</font></html>");
                    return;
                }

                sm.fillArray(rolls, rollMax);
                String arrayString = sm.printArray(rolls);
                int matching = sm.countOccurrences(rolls, 0);
                String resultString = "Roll: " + arrayString + "<br>Matching numbers: " + matching;
                ResultVariable.setText("<html>" + resultString + "</html>");

                switch (matching) {
                    case 5:
                        multiplier = 10;
                        balance += betAmount * multiplier;
                        gamesPlayed++;
                        ResultVariable.setText("<html>" + resultString + "<br>You win " + multiplier + "x!</html>");
                        sm.writeToFile("balance.txt", balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                        break;

                    case 4:
                        multiplier = 5;
                        balance += betAmount * multiplier;
                        gamesPlayed++;
                        ResultVariable.setText("<html>" + resultString + "<br>You win " + multiplier + "x!</html>");
                        sm.writeToFile("balance.txt", balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                        break;

                    case 3:
                        multiplier = 2;
                        balance += betAmount * multiplier;
                        gamesPlayed++;
                        ResultVariable.setText("<html>" + resultString + "<br>You win " + multiplier + "x!</html>");
                        sm.writeToFile("balance.txt", balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                        break;

                    default:
                        balance -= betAmount;
                        gamesPlayed++;
                        ResultVariable.setText("<html>" + resultString + "<br>You lost!</html>");
                        sm.writeToFile("balance.txt", balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                        break;
                }

                // Update the balance value on the GUI
                updateBalance(balance);
            } else {
                ResultVariable.setText("<html><font color='red'>Bet amount invalid, try again</font></html>");
            }
        } catch (NumberFormatException e) {
            ResultVariable.setText("<html><font color='red'>Invalid input, try again</font></html>");
        }
    }//GEN-LAST:event_RollButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SlotsMachineGUI gui = new SlotsMachineGUI();
                try {
                    int balance = readBalance("balance.txt");
                    gui.updateBalance(balance);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                gui.setVisible(true);
            }
        });
    }

    public void updateBalance(int balance) {
        BalanceValue.setText(String.valueOf(balance));
    }

    public static int readBalance(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("balance.txt"));
        int balance = Integer.parseInt(reader.readLine().trim());
        if (balance == 0) {
            balance = 100;
            System.out.println("Balance was 0, 100 points given");
        }
        reader.close();
        return balance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceValue;
    private javax.swing.JLabel ResultVariable;
    private javax.swing.JButton RollButton;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel betamount;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel result;
    private javax.swing.JButton returntomain;
    private javax.swing.JLabel rules;
    private javax.swing.JLabel rulestext;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}