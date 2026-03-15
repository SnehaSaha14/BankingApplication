package com.bankingsystem.bankingapp.service.implementation;

import com.bankingsystem.bankingapp.repository.AccountRepository;
import com.bankingsystem.bankingapp.service.AccountService;
import com.bankingsystem.bankingapp.dto.AccountDto;
import com.bankingsystem.bankingapp.entity.Account;
import com.bankingsystem.bankingapp.mapper.AccountMapper;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class AccountServiceImplements implements AccountService  {

    private final AccountRepository accountRepository;

    // Constructor injection
    public AccountServiceImplements(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found with id " + id));



        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(long id, double amount) {

        if (amount <= 0) {
            throw new RuntimeException("Invalid deposit amount");
        }

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found with id " + id));


        String accountType = account.getAccountType();

        if (accountType.equalsIgnoreCase("Savings") && amount > 1000000) {
            throw new RuntimeException("SAVINGS ACCOUNT: You cannot deposit more than 10 Lakhs");

        } else if (accountType.equalsIgnoreCase("Current") && amount > 200000) {
            throw new RuntimeException("CURRENT ACCOUNT: You cannot deposit more than 2 Lakhs");
        }

        account.setBalance(account.getBalance() + amount);

        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto moneyWithdrawal(long id, double amount) {

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found with id " + id));

        if (amount <= 0) {
            throw new RuntimeException("Invalid withdrawal amount");
        }

        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }

        account.setBalance(account.getBalance() - amount);

        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public void deleteById(long id) {

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found with id " + id));

        accountRepository.delete(account);
    }

    @Override
    public List<AccountDto> getAllAccounts() {

        List<Account> accounts = accountRepository.findAll();
        List<AccountDto> accountDto = new ArrayList<>();

        for (Account account : accounts) {
            accountDto.add(AccountMapper.mapToAccountDto(account));
        }

        return accountDto;
    }


}