package com.demo.UserAgrigateService.model.accountmodel;

import java.util.List;

public class Data
{
    private String status;
    private List<Account> accountList;
    private List<ErrorData> errorData;

    public Data() {
    }

    public Data(String status, List<Account> accountList, List<ErrorData> errorData) {
        this.status = status;
        this.accountList = accountList;
        this.errorData = errorData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<ErrorData> getErrorData() {
        return errorData;
    }

    public void setErrorData(List<ErrorData> errorData) {
        this.errorData = errorData;
    }

    @Override
    public String toString() {
        return "Data{" +
                "status='" + status + '\'' +
                ", accountList=" + accountList +
                ", errorData=" + errorData +
                '}';
    }
}
