package com.example.userapplication.test;

import com.example.userapplication.test.model.User;
import com.example.userapplication.test.repository.UserRepository;
import com.example.userapplication.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest
{
    @Autowired
    UserService service;

    @MockBean
    UserRepository repository;

    @Test
    public void test1(){
        List<User> userList = Stream.of(new User(1,"Deep","Patel","405 Manning",1374928374)).collect(Collectors.toList());
        Mockito.when(repository.findAll()).thenReturn(userList);
        assertEquals(1,service.getDataService().getUser().size());
    }


}
