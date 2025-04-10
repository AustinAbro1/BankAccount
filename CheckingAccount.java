/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bankaccount;

/**
 *
 * @author austo
 */
public class CheckingAccount extends BankAccount {
    private static final double overdraftLimit = -500;
    
    public CheckingAccount(String accNum, String owner, double bal){
        super(accNum, owner, bal);
    }
    
    @Override
    public boolean withdraw(double amount){
        if(amount > 0 && (balance - amount) > -overdraftLimit){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }
}
