


package com.bankingsystem.bankingapp.controller;

import com.bankingsystem.bankingapp.dto.AccountDto;
import com.bankingsystem.bankingapp.service.AccountService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/detailsofaccounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // CREATE ACCOUNT
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        AccountDto savedAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    // GET ACCOUNT BY ID
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable long id) {
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

    // DEPOSIT MONEY
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(
            @PathVariable long id,
            @RequestBody Map<String, Double> request) {

        double amount = request.get("amount");

        AccountDto accountDto = accountService.deposit(id, amount);

        return ResponseEntity.ok(accountDto);
    }

    // WITHDRAW MONEY
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdrawMoney(
            @PathVariable long id,
            @RequestBody Map<String, Double> request) {

        double amount = request.get("amount");

        AccountDto accountDto = accountService.moneyWithdrawal(id, amount);

        return ResponseEntity.ok(accountDto);
    }

    // DELETE ACCOUNT
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable long id) {

        accountService.deleteById(id);


        return ResponseEntity.ok("Account deleted successfully");
    }

    // GET ALL ACCOUNTS
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {

        List<AccountDto> accounts = accountService.getAllAccounts();

        return ResponseEntity.ok(accounts);
    }

}