package chapter17;

// Chapter12 - Test34 포유류(Mammal)와 어류(Fish)의
// 두 가지 슈퍼 클래스가 필요한 고래(Whale) 클래스를 만들어보자.
    
// "포유류" 인터페이스를 정의하고 추상 메소드 bear()를 선언
interface Mammal {
    abstract void bear();    // 새끼를 낳음
}

// "어류" 추상 클래스를 정의하고 swim() 메소드를 정의
abstract class Fish {
    void swim() {
        System.out.println("추상클래스-Fish : 물고기는 헤엄치며 움직입니다.");
    }
    final void test() {
        System.out.println("메소드 오버라이딩 제한 : final 테스트입니다.");
    }
}

// 다중 상속을 받는 고래 클래스를 정의
class Whale extends Fish implements Mammal {
    
/*
 * // 추상클래스 Fish 를 인터페이스(interface Fish{})로 만들고 
 * class Whale implements Mammal, Fish {} 로 다중 상속을 받을 수 있다.
 */
    
    // bear() 메소드를 오버라이딩 한다.
    public void bear() {
        System.out.println("고래는 새끼를 낳습니다.");
    }
    
    // **오류! 상위 클래스의 오버라이딩 제한(final)으로 메소드를 재정의 할 수 없다.
//    public void test() {
//        
//    }
    
    /*메소드 오버라이딩
     *  swim() 메소드를 오버라이딩 가능하다.
     *  public void swim() {
     *      System.out.println("다중상속 받은 클래스-Whale : 고래는 헤엄치며 움직입니다.");
     *  }
     *  
     ***메소드 오버라이딩 : 상위 클래스의 메소드를 하위 클래스에서 재정의 하는 것.
     ***메소드 오버라이딩의 제한 : final
     *  - 슈퍼클래스에서 메소드의 오버라이딩을 막으려면 메소드 앞에 'final' 키워드를 붙인다.
     *  - 필드 앞에 final을 붙이면 그 필드의 내용도 변경할 수 없다.
     *  - 일반적으로 final을 붙이는 필드는 상수처럼 고정된 형태이며,
     *  - 주로 static과 함께 클래스 변수를 상수처럼 지정하는데 사용된다.
     *  ex) class Sedan extends Car {
     *          // 클래스 변수 CAR_TYPE을 final로 지정하여 변경하지 못하도록 한다.
     *          final static Stirng CAR_TYPE="승용차";
     *      }
     *      public class Test {
     *          public static void main(String[] args) {
     *              // 별도의 인스턴스 없이 Sedan.CAR_TYPE으로 클래스 변수를 사용한다.
     *              System.out.println("Sedan 클래스 타입 ->" + Sedan.CAR_TYPE");
     *          }
     *      }
     */
}


// Chapter12 - Test34 포유류(Mammal)와 어류(Fish)의
//             두 가지 슈퍼 클래스가 필요한 고래(Whale) 클래스를 만들어보자.
public class Test49 {
    public static void main(String[] args) {
        // 고래 인스턴스를 선언
        Whale whale1 = new Whale();
        
        // 고래 인스턴스의 메소드를 호출한다.
        whale1.swim();
        whale1.bear();
    }
}
