package chapter12;

// Chapter12 - Test34 포유류(Mammal)와 어류(Fish)의
// 두 가지 슈퍼 클래스가 필요한 고래(Whale) 클래스를 만들어보자.
    
// "포유류" 인터페이스를 정의하고 추상 메소드 bear()를 선언
interface Mammal {
    abstract void bear();    // 새끼를 낳음
}

// "어류" 추상 클래스를 정의하고 swim() 메소드를 정의
abstract class Fish {
    void swim() {
        System.out.println("물고기는 헤엄치며 움직입니다.");
    }
}

// 다중 상속을 받는 고래 클래스를 정의
class Whale extends Fish implements Mammal {
    // bear() 메소드를 오버라이딩 한다.
    public void bear() {
        System.out.println("고래는 새끼를 낳습니다.");
    }
}


// Chapter12 - Test34 포유류(Mammal)와 어류(Fish)의
//             두 가지 슈퍼 클래스가 필요한 고래(Whale) 클래스를 만들어보자.
public class Test34 {
    public static void main(String[] args) {
        // 고래 인스턴스를 선언
        Whale whale1 = new Whale();
        
        // 고래 인스턴스의 메소드를 호출한다.
        whale1.swim();
        whale1.bear();
        
    }
}
