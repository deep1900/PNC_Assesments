package com.demo.UserAgrigateService.controller;

import com.demo.UserAgrigateService.model.AggregateModel;
import com.demo.UserAgrigateService.model.AggregateResponse;
import com.demo.UserAgrigateService.service.AggregateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aggregate")
public class AggregateController
{
    @Autowired
    AggregateService service;

    @GetMapping("/test")
    public String test(){
        return "Test";
    }

    @GetMapping("/test2")
    public List<AggregateResponse> getData(){
        return service.getData();
    }

}
