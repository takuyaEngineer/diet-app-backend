package com.example.dietApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dietApp.domain.Test;
import com.example.dietApp.repository.TestRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping()
public class TestController {

    @Autowired
    private TestRepository testRepository;
    
    @GetMapping("/a")
    public String getMethodName() {
        List<Test> aaa = testRepository.getName();
        System.out.println(aaa.get(0).getName());
        System.out.println(aaa.get(0).getName());
        return "sssss";
    }
    
}
