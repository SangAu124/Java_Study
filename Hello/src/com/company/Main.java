package com.company;

class Car1 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car1(String modelName, int modelYear, String color, int maxSpeed){
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public String  getModel(){
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class Main {
    public static void main(String[] args) {
        Car1 mycar = new Car1("쏘나타", 2018, "검은색", 250); // 생성자의 호출
        System.out.println(mycar.getModel());// 생성자에 의해 초기화 되었는지를 확인함. 
    }
}