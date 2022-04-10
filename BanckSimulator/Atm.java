package BanckSimulator;

import java.util.HashMap;
import java.util.Scanner;

public class Atm {
    
    private HashMap<Long, BankAccount> accounts;
    
    public Atm() {};

    private BankAccount loginAccount;


    public Atm(BankAccount[] accounts) {
        System.out.println("Creating ATM ...");

        for (BankAccount ac: accounts) {
            this.accounts.put(ac.getAccountNumber(), ac);
        }

    }

    public Boolean login(){

        long accountNumber;
        String password;

        Scanner reader = new Scanner(System.in);

        System.out.println("=== ABC Bank ATM ===");
        
        System.out.print("Account Number: ");
        accountNumber = reader.nextLong();

        if (!this.accounts.containsKey(accountNumber)) {
            System.out.println("Login failed. Please try again.");
            return false;
        }

        System.out.print("Password: ");
        password = reader.next();

        if (accounts.get(accountNumber).loginSuccess(password)) {
            System.out.println("Login success.");
            this.loginAccount = accounts.get(accountNumber);
            return true;
        }
        else {
            System.out.println("Login failed. Please try again.");
            return false;
        }
    }

    public void Activate(){
        System.out.print("Initialize the ATM.");
        while (!this.login()) {}
    }
}
