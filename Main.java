/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bankaccount;

/**
 *
 * @author austo
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        BankAccount acct1 = new SavingsAccount("SA113", "Austoon", 800);
        BankAccount acct2 = new CheckingAccount("CA456", "Shooosh", 500);
        
        bank.addAccount(acct1);
        bank.addAccount(acct2);
        
        acct1.deposit(200);
        acct2.deposit(100);
        
        bank.displayAccounts();
        
        bank.transfer("SA113", "CA456", 500);
        
        bank.displayAccounts();
    }
}
