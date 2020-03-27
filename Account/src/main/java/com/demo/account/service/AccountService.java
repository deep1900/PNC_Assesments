package com.demo.account.service;

import com.demo.account.model.Account;
import com.demo.account.model.Data;
import com.demo.account.model.ErrorData;
import com.demo.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class AccountService
{
    @Autowired
    AccountRepository repository;

    public Data findAllAccounts() {
        Data data = new Data();
        Optional<List<Account>> accounts = Optional.of(repository.findAll());
        if (accounts.isPresent()){
            data.setAccountList(accounts.get());
            data.setStatus("Success");
            return data;
        }
        else{
            ErrorData errorData = new ErrorData();
            List<ErrorData> list = new ArrayList<>();
            errorData.setErrorCode("500");
            errorData.setErrorData("Internal Server Error");
            list.add(errorData);
            data.setErrorData(list);
            return data;
        }
    }
}
