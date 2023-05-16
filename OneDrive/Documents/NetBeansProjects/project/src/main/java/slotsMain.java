
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class slotsMain {

    public static void main(String[] args) throws IOException {
        slotsCalculations sm = new slotsCalculations();
        
        String rules = "Matching rolls : [1,2] = Loss | [3] = 2x Bet | [4] = 5x Bet | [5] = 20x Bet";

        Scanner scanner = new Scanner(System.in);
        
        String filepath = "balance.txt";
        int balance = savefileEditor.readBalance(filepath);
        int winHistory = savefileEditor.readWinHistory(filepath);
        int lossLifetime = savefileEditor.readLossHistory(filepath);
        int gamesPlayed = savefileEditor.readGamesPlayed(filepath);
        int multiplier = 1;
        int[] rolls = new int[5];
        int rollMax = 5;

        System.out.println(rules);
        
        while (balance > 0) {
            System.out.println("Current balance: " + balance);
            int betAmount = 0;
            while (betAmount <= 0 || betAmount > balance) {
                System.out.println("Enter any text to return to main menu");
                System.out.print("Enter bet amount: ");
                try {
                    betAmount = scanner.nextInt();
                    if (betAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else if (betAmount <= 0) {
                        System.out.println("Invalid bet amount!");
                    }
                } 
                catch (InputMismatchException e) 
                {
                    System.out.println("Program will now exit.");
                    for (int i = 0; i < 50; i++) 
                    {
                        System.out.print("-");
                    }
                    System.out.println();
                    return;
                    
                }
                for (int i = 0; i < 50; i++) {
                    System.out.print("-");
                }
                System.out.println();
            }
    
            sm.fillArray(rolls, rollMax);
            sm.printArray(rolls);
            int matching = 0;
            matching = sm.countOccurrences(rolls, matching);
    
            switch (matching) 
            {
                case 5:
                    multiplier = 10;
                    winHistory = savefileEditor.readWinHistory(filepath);
                    lossLifetime = savefileEditor.readLossHistory(filepath);
                    gamesPlayed = savefileEditor.readGamesPlayed(filepath);
                    balance += betAmount * multiplier;
                    gamesPlayed++;
                    System.out.println("You win " + multiplier + "x!");
                    sm.writeToFile(filepath, balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                    break;

                case 4:
                    multiplier = 5;
                    winHistory = savefileEditor.readWinHistory(filepath);
                    lossLifetime = savefileEditor.readLossHistory(filepath);
                    gamesPlayed = savefileEditor.readGamesPlayed(filepath);
                    balance += betAmount * multiplier;
                    gamesPlayed++;
                    System.out.println("You win " + multiplier + "x!");
                    sm.writeToFile(filepath, balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                    break;

                case 3:
                    multiplier = 2;
                    winHistory = savefileEditor.readWinHistory(filepath);
                    lossLifetime = savefileEditor.readLossHistory(filepath);
                    gamesPlayed = savefileEditor.readGamesPlayed(filepath);
                    balance += betAmount * multiplier;
                    gamesPlayed++;
                    System.out.println("You win " + multiplier + "x!");
                    sm.writeToFile(filepath, balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                    break;

                default:
                    winHistory = savefileEditor.readWinHistory(filepath);
                    lossLifetime = savefileEditor.readLossHistory(filepath);
                    gamesPlayed = savefileEditor.readGamesPlayed(filepath);
                    balance -= betAmount;
                    gamesPlayed++;
                    System.out.println("You lost!");
                    sm.writeToFile(filepath, balance, winHistory + (betAmount * multiplier), lossLifetime + betAmount, gamesPlayed);
                    break;
            }

            System.out.println("Your new balance : " + balance);
            for (int i = 0; i < 50; i++) 
            {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("Game over!");
    }
}
