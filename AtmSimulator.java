import BanckSimulator.BankAccount;
import BanckSimulator.PremiumBankAccount;
import BanckSimulator.Atm;

public class AtmSimulator {
    public static void main (String[] args) { 

        BankAccount ac1 = new BankAccount("Chan Tai Man", "111", 1, 12345);
        BankAccount ac2 = new BankAccount("Lee Siu Fai", "111", 2, 34567);
        BankAccount ac3 = new PremiumBankAccount("Li Wai Chung", "222", 3, 999999);

        BankAccount [] accounts = {ac1, ac2, ac3};
        
        Atm myAtm = new Atm(accounts);

        myAtm.Activate();
    }
}
