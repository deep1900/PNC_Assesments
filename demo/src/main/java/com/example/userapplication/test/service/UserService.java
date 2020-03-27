package com.example.userapplication.test.service;

import com.example.userapplication.test.model.Data;
import com.example.userapplication.test.model.User;
import com.example.userapplication.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

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
