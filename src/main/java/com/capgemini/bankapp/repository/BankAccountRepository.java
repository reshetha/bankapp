package com.capgemini.bankapp.repository;

import java.util.List;

import com.capgemini.bankapp.entities.BankAccount;

public interface BankAccountRepository 
{
	
	public double getBalance(long accountId);
	public boolean updateBalance(long accountId, double newBalance);
    public boolean addBankaccount(BankAccount account);
    public BankAccount findBankAccountById(long accountId);
    public List<BankAccount> findBankAccounts();
    public BankAccount updateBankAccount(BankAccount account);
    public boolean deleteBankAccount(long accountId);
    
}
