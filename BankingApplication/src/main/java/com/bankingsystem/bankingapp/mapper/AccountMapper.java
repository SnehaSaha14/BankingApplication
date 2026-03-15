package com.bankingsystem.bankingapp.mapper;

import com.bankingsystem.bankingapp.dto.AccountDto;
import com.bankingsystem.bankingapp.entity.Account;

public class AccountMapper {

    // DTO -> Entity
    public static Account mapToAccount(AccountDto accountDto){
        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolder(),
                accountDto.getBalance(),
                accountDto.getAccountType(),
                accountDto.isActive()
        );
    }

    // Entity -> DTO
    public static AccountDto mapToAccountDto(Account account){
        return new AccountDto(
                account.getId(),
                account.getAccountHolder(),
                account.getBalance(),
                account.getAccountType(),
                account.isActive()
        );
    }
}