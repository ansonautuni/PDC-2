
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class slotsCalculations {

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
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
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
        //System.out.println("\nThe number " + maxNum + " occurs the most times: " + matching + " times.");
        return matching;
    }

    public static void writeToFile(String filepath, int balance, int winHistory, int lossLifetime, int gamesPlayed) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
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
