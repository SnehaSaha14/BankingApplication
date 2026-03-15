package com.bankingsystem.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class AccountDto {

    private Long id;
    private String accountHolder;
    private double balance;
    private String accountType;
    private boolean active;

}