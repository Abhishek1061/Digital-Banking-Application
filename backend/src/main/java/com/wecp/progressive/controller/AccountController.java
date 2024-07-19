package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;


    @GetMapping("/accounts")
    public ResponseEntity<List<Accounts>> getAllAccounts() throws SQLException {
        return new ResponseEntity<>(accountService.getAllAccounts(),HttpStatus.OK);
    }

    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<Accounts> getAccountById(@PathVariable int accountId) throws SQLException {
        return new ResponseEntity<>(accountService.getAccountById(accountId),HttpStatus.OK);
    }

    @GetMapping("/accounts/user/{customerId}")
    public ResponseEntity<List<Accounts>> getAccountsByUser(@PathVariable String param) {
        //return new ResponseEntity<>(accountService.getAccountsByUser(0),HttpStatus.OK);
        return null;
    }

    @PostMapping("/accounts")
    public ResponseEntity<Integer> addAccount(@RequestBody Accounts accounts) throws SQLException {
        return new ResponseEntity<>(accountService.addAccount(accounts),HttpStatus.OK);
        
    }

    @PutMapping("/accounts/{accountId}")
    public ResponseEntity<Void> updateAccount(@PathVariable int accountId, @RequestBody Accounts accounts) throws SQLException {
        accounts.setAccountId(accountId);
        accountService.updateAccount(accounts);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping("/accounts/{accountId}")
    public ResponseEntity<Void> deleteAccount(@PathVariable int accountId) throws SQLException {
        accountService.deleteAccount(accountId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}