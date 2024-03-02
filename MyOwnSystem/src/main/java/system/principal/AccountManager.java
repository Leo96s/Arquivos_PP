/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.principal;

import java.io.Serializable;

import system.enums.Status;

/**
 *
 * @author Leonardo
 */
public class AccountManager implements Serializable{
    private Account[] accountList;
    
    private UserManage manageuser;
    
    private int count;
    
    private final int INITIAL_SIZE = 10;
    
    public AccountManager() {
        this.accountList = new Account[INITIAL_SIZE];
        UserManage temp = new UserManage();
        this.manageuser = temp;
    }
    
    public void createAccount() {
        User newuser = manageuser.createUser();
        Account newAccount = new Account(newuser);
        
        this.accountList[count++] = newAccount;
    }

    public Account entryAccount(){
        int total = 0;
        int indexToAtribute = 0;
        User temp = this.manageuser.UserOnline();
        Account account = new Account();

        for(int i=0; i < this.count; i++){

            if(this.accountList[i].getUser().equals(temp)){
                indexToAtribute = i;
            }

            if(this.accountList[i].getStatus().equals(Status.OFFLINE)){
                total++;
            }
        
        }
        if(total == this.count || this.accountList[indexToAtribute].getStatus().equals(Status.ONLINE)){
            account = this.accountList[indexToAtribute];

            if(total == this.count){
                account.setStatus(Status.ONLINE);
            }

        }
        if(this.manageuser.authenticateUser(temp) == true && this.accountList[indexToAtribute].getStatus().equals(Status.ONLINE)){
            
            System.out.println("YOU HAVE ENTRY IN SYSTEM!");
            return account;
        }
        System.out.println("You have an account in system Online");
        return null;
    }
    
    public void deposit(Account account, double amount) {
        // Implementação da operação de depósito na conta fornecida
    }
    
    public void withdraw(Account account, double amount) {
        // Implementação da operação de saque da conta fornecida
    }
    
    public void transfer(Account sourceAccount, Account recipientAccount, double amount) {
        // Implementação da operação de transferência entre contas fornecidas
    }
    
    public double getAccountBalance(Account account) {
        return account.getBalance();
    }
    
    // Outros métodos relevantes, como obter histórico de transações, extrato da conta, etc.
}


