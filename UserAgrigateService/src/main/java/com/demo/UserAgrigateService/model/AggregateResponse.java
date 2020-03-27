package com.demo.UserAgrigateService.model;

public class AggregateResponse
{
    private long account_Number;
    private boolean checking;
    private boolean savings;
    private int checkingAmount;
    private int savingAmount;
    private String first_Name;
    private String last_name;

    public AggregateResponse() {
    }

    public AggregateResponse(long account_Number, boolean checking, boolean savings, int checkingAmount, int savingAmount, String first_Name, String last_name) {
        this.account_Number = account_Number;
        this.checking = checking;
        this.savings = savings;
        this.checkingAmount = checkingAmount;
        this.savingAmount = savingAmount;
        this.first_Name = first_Name;
        this.last_name = last_name;
    }

    public long getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(long account_Number) {
        this.account_Number = account_Number;
    }

    public boolean isChecking() {
        return checking;
    }

    public void setChecking(boolean checking) {
        this.checking = checking;
    }

    public boolean isSavings() {
        return savings;
    }

    public void setSavings(boolean savings) {
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

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "AggregateResponse{" +
                "account_Number=" + account_Number +
                ", checking=" + checking +
                ", savings=" + savings +
                ", checkingAmount=" + checkingAmount +
                ", savingAmount=" + savingAmount +
                ", first_Name='" + first_Name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
