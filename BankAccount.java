/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

/**
 *
 * @author austo
 */
public abstract class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;
    
    public BankAccount(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("Error: Balance is less than $1");
        }
    }
    
    public abstract boolean withdraw(double amount);
    
    public String getAccountInfo(){
        return accountNumber + "-" + ownerName + " | Balance $" + balance;
    }
    
    public double getBalance(){
        return balance;
    }
}
