/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bankaccount;
import java.util.*;

/**
 *
 * @author austo
 */
public class Bank {
    private Map<String, BankAccount> accounts = new HashMap();
    
    public void addAccount(BankAccount account){
        accounts.put(account.accountNumber, account);
    }
    
    public BankAccount getAccount(String accNum){
        return accounts.get(accNum);
    }
    
    public boolean transfer(String fromAcc, String toAcc, double amount){
        BankAccount from = accounts.get(fromAcc);
        BankAccount to = accounts.get(toAcc);
        
        if(from != null && to != null && from.withdraw(amount)){
            to.deposit(amount);
            return true;
        }
        return false;
    }
    
    public void displayAccounts(){
        for(BankAccount acc : accounts.values()){
            System.out.println(acc.getAccountInfo());
        }
    }
}
