package com.demo.UserAgrigateService.service;

import com.demo.UserAgrigateService.model.AggregateModel;
import com.demo.UserAgrigateService.model.AggregateResponse;
import com.demo.UserAgrigateService.model.accountmodel.Account;
import com.demo.UserAgrigateService.model.accountmodel.Data;
import com.demo.UserAgrigateService.model.usermodel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AggregateService
{
   public static final String Account_Url = "http://localhost:8080/accounts/getAccounts";
  public static final  String User_Url = "http://localhost:8085/user/getUsers";

    @Autowired
    RestTemplate restTemplate;


    public List<AggregateResponse> getData()
    {
        AggregateModel model = new AggregateModel();
         com.demo.UserAgrigateService.model.usermodel.Data userData = getUserData(User_Url);
         Data accountData = getAccountData(Account_Url);
//         model.setAccountData(accountData);
//         model.setUserData(userData);
         return getResponse(accountData,userData);


    }

    private com.demo.UserAgrigateService.model.usermodel.Data getUserData(String User_Url){
        ResponseEntity<com.demo.UserAgrigateService.model.usermodel.Data> userResponseEntity = restTemplate.getForEntity(User_Url, com.demo.UserAgrigateService.model.usermodel.Data.class);
        com.demo.UserAgrigateService.model.usermodel.Data user_data =userResponseEntity.getBody();
        return user_data;
    }

    private Data getAccountData(String Account_Url){
        ResponseEntity<Data> accountResponseEntity = restTemplate.getForEntity(Account_Url,Data.class);
        Data account_data = accountResponseEntity.getBody();
       // List<Account>  accountList = account_data.getAccountList();
        return account_data;
    }

    private List<AggregateResponse> getResponse(Data accountData, com.demo.UserAgrigateService.model.usermodel.Data userData){
        List<User> users = userData.getUser();
        List<Account> accountList = accountData.getAccountList();

        List<AggregateResponse> aggregateResponseList = new ArrayList<>();
        for(User user: users){
            long account_number = user.getAccount_number();
            for(Account account: accountList){
                long acnumber = account.getAccount_number();
                if(acnumber == account_number){
                    AggregateResponse response = new AggregateResponse();
                    response.setAccount_Number(account_number);
                    response.setChecking(account.getChecking());
                    response.setCheckingAmount(account.getCheckingAmount());
                    response.setSavings(account.getSavings());
                    response.setSavingAmount(account.getSavingAmount());
                    response.setFirst_Name(user.getFirst_name());
                    response.setLast_name(user.getLast_name());
                    aggregateResponseList.add(response);

                }
            }
        }
        return aggregateResponseList;
    }
}
