package com.bankingsystem.bankingapp.repository;

import com.bankingsystem.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long >{

}
