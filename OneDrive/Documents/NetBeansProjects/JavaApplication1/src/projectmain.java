import java.util.InputMismatchException;
import java.util.Scanner;

public class projectmain 
{
    public static void main(String[] args) throws Exception {
        
        String filepath = "balance.txt";
        int maxchoice = 4;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Casino!");
            System.out.println("1. Slot Machine");
            System.out.println("2. See Stats");
            System.out.println("3. Exit");
            System.out.println("4. Reset Stats");
            System.out.println("Any Invalid option will also end program");

            int choice = 0;
            while (choice <= 0 || choice > maxchoice) {
                System.out.print("Enter your choice: ");
                
                try {
                    choice = scanner.nextInt();
                    if (choice <= 0 || choice > maxchoice) {
                        System.out.println("Invalid choice!");
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
                for (int i = 0; i < 50; i++) 
                {
                    System.out.print("-");
                }
                System.out.println();
                }

            switch (choice) {
                case 1:
                    slotsMain.main(args);
                    break;
                case 2: // See Stats
                    savefileEditor.printBalance(filepath);
                    savefileEditor.printWinHistory(filepath);
                    savefileEditor.printLossHistory(filepath);
                    savefileEditor.printGamesPlayed(filepath);
                    for (int i = 0; i < 50; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                case 4:
                    savefileEditor.resetStats(filepath);
            }
        }
    }
}
