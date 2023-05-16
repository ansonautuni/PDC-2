import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class projectmain 
{
    public static void main(String[] args) {
        String filePath = "balance.txt";
        
        try {
            savefileReader.printBalance(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
