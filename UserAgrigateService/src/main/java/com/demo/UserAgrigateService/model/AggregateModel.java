package com.demo.UserAgrigateService.model;

import com.demo.UserAgrigateService.model.usermodel.Data;

public class AggregateModel
{
    private Data userData;
    private com.demo.UserAgrigateService.model.accountmodel.Data accountData;

    public AggregateModel() {
    }

    public AggregateModel(Data userData, com.demo.UserAgrigateService.model.accountmodel.Data accountData) {
        this.userData = userData;
        this.accountData = accountData;
    }

    public Data getUserData() {
        return userData;
    }

    public void setUserData(Data userData) {
        this.userData = userData;
    }

    public com.demo.UserAgrigateService.model.accountmodel.Data getAccountData() {
        return accountData;
    }

    public void setAccountData(com.demo.UserAgrigateService.model.accountmodel.Data accountData) {
        this.accountData = accountData;
    }

    @Override
    public String toString() {
        return "AggregateModel{" +
                "userData=" + userData +
                ", accountData=" + accountData +
                '}';
    }
}
