package com.company;

public class OverloadingMain {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        overloading.display(15);
        overloading.display(15, 15.3);
        overloading.display(15, 15);
    }
}
