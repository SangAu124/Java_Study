package com.company;

public class Overloading {
    public  void display(int num1){
        System.out.println(num1);
    }
    public  void display(int num1, double num2){
        System.out.println(num1 + num2);
    }
    public  void display(int num1, int num2){
        System.out.println(num1 * num2);
    }
}
