
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class savefileEditor {

    public static void resetStats(String filepath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(Filepath.getBalanceFilepath()));
        writer.write("100\n0\n0\n0");
        writer.close();
    }
    
    public static void writeToFile(String filepath, int balance, int winHistory, int lossLifetime, int gamesPlayed) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Filepath.getBalanceFilepath()))) {
            writer.write(String.valueOf(balance));
            writer.newLine();
            writer.write(String.valueOf(winHistory));
            writer.newLine();
            writer.write(String.valueOf(lossLifetime));
            writer.newLine();
            writer.write(String.valueOf(gamesPlayed));
        } catch (IOException e) {
            System.out.println("Failed to save balance to file.");
        }
    }
}
