package com.demo.UserAgrigateService.controller;

import com.demo.UserAgrigateService.model.AggregateModel;
import com.demo.UserAgrigateService.service.AggregateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aggregate")
public class AggregateController
{
    @Autowired
    AggregateService service;

    public String test(){
        return "Test";
    }

    public List<AggregateModel> getData(){
        return service.getData();
    }

}
