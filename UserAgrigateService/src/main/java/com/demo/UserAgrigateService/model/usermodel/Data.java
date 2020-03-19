package com.demo.UserAgrigateService.model.usermodel;

import java.util.List;

public class Data
{
    private List<User> user;
    private String status;
    private List<ErrorData> errorList;

    public Data() {
    }

    public Data(List<User> user, String status, List<ErrorData> errorList) {
        this.user = user;
        this.status = status;
        this.errorList = errorList;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ErrorData> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<ErrorData> errorList) {
        this.errorList = errorList;
    }

    @Override
    public String toString() {
        return "Data{" +
                "user=" + user +
                ", status='" + status + '\'' +
                ", errorList=" + errorList +
                '}';
    }
}
