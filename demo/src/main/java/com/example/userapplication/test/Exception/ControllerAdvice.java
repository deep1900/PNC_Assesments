package com.example.userapplication.test.Exception;

import com.example.userapplication.test.model.Data;
import com.example.userapplication.test.model.ErrorData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(AccountErrorException.class)
    public ResponseEntity<Data> ExceptionExample(AccountErrorException e){
        Data data = new Data();
        data.setStatus("Failure");
        ErrorData error = new ErrorData();
        error.setErrorCode("400");
        error.setErrorMessage("Please Enter Valid Account Number");
        List<ErrorData> errorList = new
                ArrayList<>();
        errorList.add(error);
        data.setErrorList(errorList);
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);

    }
}
