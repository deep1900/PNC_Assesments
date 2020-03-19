package com.demo.account.controller;

import com.demo.account.model.Account;
import com.demo.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController
{
    @Autowired
    AccountRepository repository;
    @GetMapping("/test")
    public String test(){
        return "Test";
    }

    @GetMapping("/getAccounts")
    public List<Account> getAllAccounts(){
        return repository.findAll();
    }
}
