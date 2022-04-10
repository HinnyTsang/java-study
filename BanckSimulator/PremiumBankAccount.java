package BanckSimulator;
import java.text.DecimalFormat;

public class PremiumBankAccount extends BankAccount {

    public PremiumBankAccount () {
        super();
    }

    public PremiumBankAccount (String holderName, String password, long accountNumber, double balanced) {
        super(holderName, password, accountNumber, balanced);
    }
    public Boolean withdraw(double amount) {
        
        if (amount > 10000)
            return false;

        this.balanced -= amount;
        return true;
    }

    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        return String.format("[Premium Account] Holder: %s, Account Balance: $%s", this.holderName, formatter.format(this.balanced));
     }
 
}
