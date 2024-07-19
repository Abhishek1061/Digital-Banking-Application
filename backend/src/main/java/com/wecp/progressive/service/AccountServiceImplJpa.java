package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;

@Service
public class AccountServiceImplJpa implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountRepository.findAll();
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // return accountRepository.findAccountsByCustomersCutomerId(userId);  
        return accountRepository.findAccountsByCutomerId(userId);  
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
       return accountRepository.findById(accountId).get();
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
       accountRepository.save(accounts); 
       return accounts.getAccountId();
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        accountRepository.save(accounts); 
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        accountRepository.deleteById(accountId);    
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        return accountRepository.getAllAccountsSortedByBalance();
    
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return accountRepository.findAll();
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        //  Accounts acc = accountRepository.save(accounts);
        //  return (List<Accounts>) acc;
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
        return null;
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
        
    }
    
}