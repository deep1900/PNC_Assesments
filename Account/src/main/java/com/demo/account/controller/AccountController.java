package com.demo.account.controller;

import com.demo.account.model.Account;
import com.demo.account.model.Data;
import com.demo.account.model.ErrorData;
import com.demo.account.repository.AccountRepository;
import com.demo.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    AccountService service;

    @GetMapping("/test")
    public String test() {
        return "Test";
    }

    @GetMapping("/getAccounts")
    public Data getAllAccounts() {

        return service.findAllAccounts();
    }
}