package com.company;
// this 참조변수는 인스턴스가 바로 자기 자신을 참조하는데 사용하는 변수 입니다.
// "생성자의 호출" 예제 처럼 매개변수의 이름과 인스턴스 변수의 이름이 같을 경우에는 인스턴스 변수 앞에 this 키워드를 붙여 구분해야만 한다.



public class ThisReference {
    public static void main(String[] args) {
        Car2 tcpCar = new Car2();
        System.out.println(tcpCar.getModel());
        tcpCar.setColor("asdasd");
        System.out.println(tcpCar.getColor());
    }
}
