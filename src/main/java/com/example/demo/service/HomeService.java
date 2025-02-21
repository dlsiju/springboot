package com.example.demo.service;

import com.example.demo.controller.HomeController;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String add(String num1,String num2){
        return String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
    }

}
