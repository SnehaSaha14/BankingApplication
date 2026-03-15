package com.bankingsystem.bankingapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Table(name = "accounts")
@Entity
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_holder")
    private String accountHolder;

    private double balance;

    @Column(name = "account_type", length = 20)
    private String accountType;

    @Column(name = "is_active")
    private boolean isActive;


}