
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SavefileReader {

    public static int readBalance(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        int balance = Integer.parseInt(reader.readLine().trim());
        if (balance == 0) {
            balance = 100;
            System.out.println("Balance was 0, 100 points given");
        }
        reader.close();
        return balance;
    }

    public static void printBalance(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        String line = reader.readLine(); // Read the first line of the file

        if (line != null) {
            System.out.println("Current balance: " + line);
        } else {
            System.out.println("No balance information found in the file.");
        }

        reader.close();
    }

    //method to read the second line which is how many points the user has won
    public static int readWinHistory(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        reader.readLine(); // skip first line
        int winHistory = Integer.parseInt(reader.readLine().trim());
        reader.close();
        return winHistory;
    }

    public static void printWinHistory(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        String line = reader.readLine(); // Read the first line (balance)
        line = reader.readLine(); // Read the second line (WinHistory)

        if (line != null) {
            System.out.println("Win History: " + line);
        } else {
            System.out.println("No win history information found in the file.");
        }

        reader.close();
    }

    //method to read the third line which is how many points the user has lost
    public static int readLossHistory(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        reader.readLine(); // skip first line
        reader.readLine(); // skip second line
        int lossLifetime = Integer.parseInt(reader.readLine().trim());
        reader.close();
        return lossLifetime;
    }

    public static void printLossHistory(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        String line = reader.readLine(); // Read the first line (balance)
        line = reader.readLine(); // Read the second line (WinHistory)
        line = reader.readLine(); // Read the third line (LossHistory)

        if (line != null) {
            System.out.println("Loss History: " + line);
        } else {
            System.out.println("No loss history information found in the file.");
        }

        reader.close();
    }

    //method to read the fourth line which is how many games has been played
    public static int readGamesPlayed(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        reader.readLine(); // skip first line
        reader.readLine(); // skip second line
        reader.readLine(); // skip third line
        int gamesPlayed = Integer.parseInt(reader.readLine().trim());
        reader.close();
        return gamesPlayed;
    }

    public static void printGamesPlayed(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Filepath.getBalanceFilepath()));
        String line = reader.readLine(); // Read the first line (balance)
        line = reader.readLine(); // Read the second line (WinHistory)
        line = reader.readLine(); // Read the third line (LossHistory)
        line = reader.readLine(); // Read the fourth line (Games Played)

        if (line != null) {
            System.out.println("Games Played: " + line);
        } else {
            System.out.println("No games played information found in the file.");
        }

        reader.close();
    }

}
