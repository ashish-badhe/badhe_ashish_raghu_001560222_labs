/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ashish
 */
public class AccountDirectory {
    
    private ArrayList<Account> accountDirectory;

    public AccountDirectory() {
        this.accountDirectory = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(ArrayList<Account> accountDirectory) {
        this.accountDirectory = accountDirectory;
    }
    
    public Account addAccount() {
        Account account = new Account();
        this.accountDirectory.add(account);
        return account;
    }
    
    public void deleteAccount(Account account) {
        this.accountDirectory.remove(account);
    }
    
    public Account searchAccount(int accountNumber){
        for(Account account : accountDirectory){
            if(accountNumber == account.getAccountNumber()){
                return account;
            }
        }
        return null;
    }
    
}
