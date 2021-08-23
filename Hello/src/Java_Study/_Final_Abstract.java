package Java_Study;

public class _Final_Abstract {
}

// final 제어자
// java에서 final 제어자는 '변경할 수 없다' 는 의미로 사용된다.

final class Car{                        // 이 클래스는 상속을 통해 서브 클래스를 생성할 수 없음.
    final int VAR = 0;                      // 이 필드는 상수화되어 값을 변경할 수 없음.
    final void brake(){                 // 이 메소드는 오버라이딩을 통해 재정의 할 수 없음.
        final double MAX_NUM = 10.2;    // 이 지역 변수는 상수화되어 값을 변경할 수 없음.
    }
}


// static 제어자
// java에서 static 제어자는 '공통적인; 이라는 의미로 사용됩니다.

class Car1 {
    static int var;         // 클래스 필드(static 변수)
    static {                // static 초기화 블록
        // 보통 클래스의 필드의 초기화를 진행함.
    }
    static void brake1(){ // 클래스 메소드(static 메소드)

    }
}


// abstract 제어자
// java에서 abstract 제어자는 '추상적인' 이라는 의미로 사용됩니다.

abstract class Car2{        // 추상 클래스
    abstract  void brake(); // 추상 메소드드
}
