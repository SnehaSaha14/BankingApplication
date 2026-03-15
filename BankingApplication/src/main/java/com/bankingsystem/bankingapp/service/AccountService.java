package com.bankingsystem.bankingapp.service;

import com.bankingsystem.bankingapp.dto.AccountDto;

import java.util.List;


public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(long id);


    AccountDto deposit(long id, double amount);

    AccountDto moneyWithdrawal(long id, double amount);


    void  deleteById(long id);

    List<AccountDto> getAllAccounts();


}
