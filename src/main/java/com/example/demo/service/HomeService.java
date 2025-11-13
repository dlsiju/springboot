package com.example.demo.service;

import com.example.demo.abs.Custom;
import com.example.demo.controller.HomeController;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

  public String add(String num1, String num2) {
    return String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
  }

  /**/
  public String mull(String first, String second) {
    return String.valueOf(Integer.parseInt(first) * Integer.parseInt(second));
  }

  public void executeCustom() {
    System.out.println("execute Custom");
     Custom cust=new Custom() {
       @Override
       public void test() {
         System.out.println("Test method");

       }

       @Override
       public void display(int x) {
         System.out.println("Value of x="+x);

       }

       @Override
       public int sum(int num1, int num2) {
         return num1+num2;
       }
     };
    cust.display(6);
    cust.test();
  }
}
