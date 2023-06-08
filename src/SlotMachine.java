
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SlotMachine extends Game {
    
    private int[] rolls;
    
    public void setRolls(int[] rolls) {
        this.rolls = rolls;
    }

    public void fillArray(int[] rolls, int rollMax) {
        Random random = new Random();

        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = random.nextInt(rollMax) + 1;
        }
    }

    //display the 5 numbers
    public String printArray(int[] rolls) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        for (int i = 0; i < rolls.length; i++) {
            sb.append(rolls[i]).append(" ");
        }
        return sb.toString();
    }

    //calculate matching numbers
    public int countOccurrences(int[] arr, int matching) {
        Map<Integer, Integer> counts = new HashMap<>();
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (counts.containsKey(num)) {
                int count = counts.get(num) + 1;
                counts.put(num, count);
                if (count > matching) {
                    matching = count;
                    maxNum = num;
                }
            } else {
                counts.put(num, 1);
            }
        }
        return matching;
    }

    public static void playSlotMachine(SlotsMachineGUI slotmachinegui) {
        try {
            int betAmount = slotmachinegui.getBetAmount();
            int balance;
            try {
                balance = DatabaseReader.readBalance();
            } catch (Exception e) {
                String resultString = "<html><font color='red'>Error: " + e.getMessage() + "</font></html>";
                slotmachinegui.updateResultText(resultString);
                return;
            }

            if (betAmount <= balance) {
                SlotMachine slotMachine = new SlotMachine();
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
                    String resultString = "<html><font color='red'>Error: " + e.getMessage() + "</font></html>";
                    slotmachinegui.updateResultText(resultString);
                    return;
                }

                slotMachine.fillArray(rolls, rollMax);
                String arrayString = slotMachine.printArray(rolls);
                int matching = slotMachine.countOccurrences(rolls, 0);
                String resultString = "Roll: " + arrayString + "<br>Matching numbers: " + matching;
                slotmachinegui.updateResultText(resultString);

                balance = Game.calculatePayout(matching, betAmount, balance, multiplier);
                gamesPlayed++;
                if (multiplier != 0) {
                    winHistory += balance;
                } else {
                    lossLifetime -= balance;
                }

                DatabaseWriter.updateBalance(Database.getActiveSave(), balance);
                DatabaseWriter.updatePointsWon(Database.getActiveSave(), winHistory + (betAmount * multiplier));
                DatabaseWriter.updatePointsLost(Database.getActiveSave(), lossLifetime + betAmount);
                DatabaseWriter.increaseGamesPlayed(Database.getActiveSave());

                // Update the balance value of the GUI
                balance = DatabaseReader.readBalance();
                slotmachinegui.updateBalanceValue(balance);
            } else {
                String resultString = "<html><font color='red'>Bet amount invalid, try again</font></html>";
                slotmachinegui.updateResultText(resultString);
            }
        } catch (NumberFormatException e) {
            String resultString = "<html><font color='red'>Invalid input, try again</font></html>";
            slotmachinegui.updateResultText(resultString);
        }
    }
}
