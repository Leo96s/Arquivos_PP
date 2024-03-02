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
public class Account implements Serializable{
    private static int nextaccountNumber;
    private int accountNumber;
    private double balance;

    private Status status;
    /**
    private List<Transaction> transactionHistory;
    */
    private User user;
    
    public Account(User user) {
        this.accountNumber = nextaccountNumber++;
        this.user = user;
        this.status = Status.OFFLINE;
        // Outras inicializações, se necessário
    }

    public Account(){
        
    }

    
    // Getters and Setters
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
    
    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
    */
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }

    // Métodos adicionais
    public void deposit(int amount) {
        this.balance += amount;
    }
    
    public void withdraw(int amount) {
        this.balance -= amount;
    }
    
    public void transfer(Account recipientAccount, double amount) {
        // Implementação da operação de transferência para outra conta
    }
    
    // Outros métodos relevantes, como consultar saldo, extrato, etc.
    
    public String BalancetoString(){
        StringBuilder sb = new StringBuilder();

        sb.append("My balance is: ").append(this.getBalance()).append("\n");
    
        return sb.toString();
    }
}

