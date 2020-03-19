package com.example.userapplication.controller;


import com.example.userapplication.Exception.AccountErrorException;
import com.example.userapplication.model.Data;
import com.example.userapplication.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    Service service;

    @GetMapping("/getUsers")
    public ResponseEntity<Data> getUsers() throws AccountErrorException {

        return ResponseEntity.status(200).body(service.getDataService());
    }
}
