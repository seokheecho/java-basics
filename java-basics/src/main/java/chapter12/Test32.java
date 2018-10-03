package chapter12;

// Chapter12 - Test32 애완동물(Pet) 클래스를 상속받는
//             강아지(Dog) 클래스와 새(Bird) 클래스를 만들어보자.
  
//애완동물 클래스(슈퍼 클래스)를 정의
class Pet {
    int age;    // 애완동물 개월 수
    
    // 애완동물의 움직임을 설정하는 메소드를 정의(공통적인 메시지 출력).
    public void move() {
        System.out.println("애완동물이 움직입니다.");
    }
}

// 애완동물 클래스를 상속받는 강아지 클래스(서브 클래스)를 정의
class Dog extends Pet{
    // 강아지 클래스에 강아지 이름, 무게의 인스턴스 변수를 선언
    String name;    // 강아지 이름
    int weight;    // 강아지 무게
    
    //강아지 클래스에 인스턴스 메소드를 정의
    int getWeight() {
        return weight;
    }
}

// 애완동물 클래스를 상속받는 새 클래스(서브 클래스)를 정의
class Bird extends Pet {
    // 새 클래스에 새 종류, 날 수 있는지 여부의 인스턴스 변수를 선언
    String type;    // 새 종류
    boolean flightYN;    // 날 수 있는지 여부
    
    // 새 클래스에 인스턴스 메소드를 정의
    boolean getFlight() {
        return flightYN;
    }
}


// Chapter12 - Test32 애완동물(Pet) 클래스를 상속받는
// 강아지(Dog) 클래스와 새(Bird) 클래스를 만들어보자.
public class Test32 {
    public static void main(String[] args) {

    }
}
