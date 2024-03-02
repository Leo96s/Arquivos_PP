/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.menu;

import java.io.IOException;

import javax.sound.sampled.SourceDataLine;

import system.Calculator.AddCalculator;
import system.Calculator.CalculatorMain;
import system.FileSystem.InfoSystemtxt;
import system.consolereader.ConsoleReader;
import system.enums.Status;
import system.principal.Account;
import system.principal.AccountManager;

public class Menus {
    AccountManager manageraccount;
    Account account;
    CalculatorMain calculator;

    public Menus() {
        AccountManager temp = new AccountManager();
        this.manageraccount = temp;
        CalculatorMain temp2 = new CalculatorMain();
        this.calculator = temp2;
    }

    public void menuPrincipal() throws IOException {
        char choice;

        do {
            System.out.println("----------Menu Principal----------");
            System.out.println("1. Save");
            System.out.println("2. Login");
            System.out.println("3. Create account");
            System.out.println("4. Load");
            System.out.println("0. Exit");
            System.out.println("----------------------------------");
            System.out.print("Choose on option: ");

            choice = (char) System.in.read();

            System.in.read();

            switch (choice) {
                case '1':
                    saveAccounts();
                    break;
                case '2':
                    account = manageraccount.entryAccount();
                    menuAccount();
                    account.setStatus(Status.OFFLINE);
                    break;
                case '3':
                    manageraccount.createAccount();
                    break;
                case '4':
                    loadAccounts();
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
            }
        } while (choice != '0');
    }

    private void saveAccounts() {
        try {
            InfoSystemtxt.writeAccounts("accounts.txt", this.manageraccount);
            System.out.println("Accounts saved successfully.");
        } catch (IOException e) {
            System.out.println("File corrupted");
        }
    }

    private void loadAccounts() {
        try {
            this.manageraccount = InfoSystemtxt.readAccounts("accounts.txt");
            System.out.println("Accounts loaded successfully.");
        } catch (IOException e) {
            System.out.println("File corrupted");
        } catch (ClassNotFoundException e) {
            System.out.println("The class was not found");
        }
    }

    public void menuAccount() throws IOException {
        char choice;

        do {
            System.out.println("----------Menu Account----------");
            System.out.println("1. GetMyBalance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("0. Exit");
            System.out.println("----------------------------------");
            System.out.print("Choose on option: ");

            choice = (char) System.in.read();

            System.in.read();

            switch (choice) {
                case '1':
                System.out.println(account.BalancetoString());
                    break;
                case '2':
                account.deposit(ConsoleReader.intReader("Type the ammount to deposit: "));
                break;
                case '3':
                account.withdraw(ConsoleReader.intReader("Type the ammount to withdraw: "));
                    break;
                case '4':
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
            }
        } while (choice != '0');
    }
}
