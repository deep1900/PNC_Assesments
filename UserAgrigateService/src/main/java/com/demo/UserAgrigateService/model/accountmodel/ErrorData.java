package com.demo.UserAgrigateService.model.accountmodel;

public class ErrorData
{
        private String errorCode;
        private String errorData;

    public ErrorData() {
    }

    public ErrorData(String errorCode, String errorData) {
        this.errorCode = errorCode;
        this.errorData = errorData;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorData() {
        return errorData;
    }

    public void setErrorData(String errorData) {
        this.errorData = errorData;
    }

    @Override
    public String toString() {
        return "ErrorData{" +
                "errorCode='" + errorCode + '\'' +
                ", errorData='" + errorData + '\'' +
                '}';
    }
}
