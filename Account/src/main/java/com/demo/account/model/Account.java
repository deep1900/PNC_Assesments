package com.demo.account.model;

import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account
{
    @Id
    @Column
    private int id;
    @Column
    private Boolean checking;
    @Column
    private long account_number;
    @Column
    private Boolean savings;
    @Column
    private int checkingAmount;
    @Column
    private int savingAmount;

    public Account() {
    }

    public Account(int id, Boolean checking, Boolean savings, int checkingAmount, int savingAmount, long account_number) {
        this.id = id;
        this.checking = checking;
        this.savings = savings;
        this.checkingAmount = checkingAmount;
        this.savingAmount = savingAmount;
        this.account_number=account_number;
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

    public int getSavingAmount() {
        return savingAmount;
    }

    public void setSavingAmount(int savingAmount) {
        this.savingAmount = savingAmount;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", checking=" + checking +
                ", account_number=" + account_number +
                ", savings=" + savings +
                ", checkingAmount=" + checkingAmount +
                ", savingAmount=" + savingAmount +
                '}';
    }
}
