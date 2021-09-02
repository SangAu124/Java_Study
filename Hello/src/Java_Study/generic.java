package Java_Study;

public class generic {
}
class Person<T>{
    public T info; // info = String, StringBuilder
}

class main {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>(); // p1 = String
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
}

/*
우리는 왜 제네릭을 사용하나?
-가장 늦게 도입된 최근에 기능

타입이 안전하지 않게 되는것을 해결하기 위해 도입된 기능이다.
*/
