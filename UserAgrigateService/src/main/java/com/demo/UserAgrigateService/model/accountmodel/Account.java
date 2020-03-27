package com.demo.UserAgrigateService.model.accountmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Account
{

    private int id;
    private Boolean checking;
    private Boolean savings;
    private int checkingAmount;
    private long account_number;
    private int savingAmount;

    public Account() {
    }

    public Account(int id, Boolean checking, Boolean savings, int checkingAmount, long account_number, int savingAmount) {
        this.id = id;
        this.checking = checking;
        this.savings = savings;
        this.checkingAmount = checkingAmount;
        this.account_number = account_number;
        this.savingAmount = savingAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getChecking() {
        return checking;
    }

    public void setChecking(Boolean checking) {
        this.checking = checking;
    }

    public Boolean getSavings() {
        return savings;
    }

    public void setSavings(Boolean savings) {
        this.savings = savings;
    }

    public int getCheckingAmount() {
        return checkingAmount;
    }

    public void setCheckingAmount(int checkingAmount) {
        this.checkingAmount = checkingAmount;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public int getSavingAmount() {
        return savingAmount;
    }

    public void setSavingAmount(int savingAmount) {
        this.savingAmount = savingAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", checking=" + checking +
                ", savings=" + savings +
                ", checkingAmount=" + checkingAmount +
                ", account_number=" + account_number +
                ", savingAmount=" + savingAmount +
                '}';
    }
}
