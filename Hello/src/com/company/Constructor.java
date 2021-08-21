package com.company;

public class Constructor {
    private String delimeter = "";

    public Constructor(String delimeter){
        this.delimeter = delimeter;
    }
    public void A(){
        System.out.println(delimeter);
        System.out.println("A");
        System.out.println("A");
    }
}
