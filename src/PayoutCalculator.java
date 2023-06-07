
public class PayoutCalculator {

    public static int calculatePayout(int matching, int betAmount, int balance,int multiplier) {

        switch (matching) {
            case 5:
                multiplier = 10;
                balance += betAmount * multiplier;
                return balance;

            case 4:
                multiplier = 5;
                balance += betAmount * multiplier;
                return balance;

            case 3:
                multiplier = 2;
                balance += betAmount * multiplier;
                return balance;

            default:
                balance -= betAmount;
                return balance;
        }
    }
}
