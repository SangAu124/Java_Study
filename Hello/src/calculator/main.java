package calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        calculator calculator = new calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 계산기 입니다. 정수 하나를 입력하세요");
        int a = scanner.nextInt();
        System.out.print("사용할 수식을 입력하세요");
        String s = scanner.nextLine();
        System.out.print("정수 하나를 입력하세요");
        int b = scanner.nextInt();

        if (s == "+"){
            System.out.println(calculator.add(a, b));
        }
        else if (s == "-"){
            System.out.println(calculator.min(a, b));
        }
        else if ( s == "*"){
            System.out.println(calculator.mul(a, b));
        }
        else {
            System.out.println(calculator.div(a, b));
        }


    }
}
