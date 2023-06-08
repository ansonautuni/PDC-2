
public class Game {
    
    private int betAmount;
    private int balance;
    private int multiplier;
    
    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public static int calculatePayout(int matching, int betAmount, int balance, int multiplier) {
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
