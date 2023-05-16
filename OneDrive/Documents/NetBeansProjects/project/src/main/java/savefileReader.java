
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class savefileReader 
{
    public static int readBalance(String filepath) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        int balance = Integer.parseInt(reader.readLine().trim());
        if (balance == 0) 
        {
            balance = 100;
            System.out.println("Balance was 0, 100 points given");
        }
        reader.close();
        return balance;
    }

    public static void printBalance(String filePath) throws IOException {
        int balance = readBalance(filePath);
        System.out.println("Current balance: " + balance);
    }
}
