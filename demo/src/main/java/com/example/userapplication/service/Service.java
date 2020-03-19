package com.example.userapplication.service;

import com.example.userapplication.Exception.AccountErrorException;
import com.example.userapplication.model.Data;
import com.example.userapplication.model.User;
import com.example.userapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    UserRepository userRepository;

    public Data getDataService() {
           Data data = new Data();
          List<User> userList = userRepository.findAll();
          data.setUser(userList);
          data.setStatus("Success");
        return data;
    }
}
