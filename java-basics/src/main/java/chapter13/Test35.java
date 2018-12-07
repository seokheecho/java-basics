package chapter13;

// Chapter12 - Test32 애완동물(Pet) 클래스를 상속받는
//             강아지(Dog) 클래스와 새(Bird) 클래스를 만들어보자.
  
//애완동물 클래스(슈퍼 클래스)를 정의
class PetTest32 {
    int age;    // 애완동물 개월 수
    
    // 애완동물의 움직임을 설정하는 메소드를 정의(공통적인 메시지 출력).
    public void move() {
        System.out.println("애완동물이 움직입니다.");
    }
}

// 애완동물 클래스를 상속받는 강아지 클래스(서브 클래스)를 정의
class DogTest32 extends PetTest32{
    // 강아지 클래스에 강아지 이름, 무게의 인스턴스 변수를 선언
    String name;    // 강아지 이름
    int weight;    // 강아지 무게
    
    //강아지 클래스에 인스턴스 메소드를 정의
    int getWeight() {
        return weight;
    }
}

// 애완동물 클래스를 상속받는 새 클래스(서브 클래스)를 정의
class BirdTest32 extends PetTest32 {
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
public class Test35 {
    public static void main(String[] args) {
        // 강아지 인스턴스 1을 생성하고 인스턴스 변수에 값을 대입
        DogTest32 dog1 = new DogTest32();
        dog1.age = 25;
        dog1.name = "누렁이";
        dog1.weight = 10;
        
        // 새 인스턴스 1을 생성하고 인스턴스 변수에 값을 대입
        BirdTest32 bird1 = new BirdTest32();
        bird1.age = 5;
        bird1.type = "앵무새";
        bird1.flightYN = true;
        
        // 메소드를 호출한다.
        // 이때 상속 받은 애완동물 클래스의 메소드가 호출된다.
        dog1.move();
        bird1.move();
        
        // 강아지의 이름과 몸무게를 출력한다.
        System.out.println("강아지의 이름은 " + dog1.name + "고, 몸무게는 " + dog1.getWeight() + "Kg입니다.");
        
        // 새의 종류와 날 수 있는지 여부를 출력한다.
        // 3항 연산자를 사용하여 getFlight() 메소드의 반환 값에 따라서 다른 값을 출력한다.
        System.out.println("새의 종류는 " + bird1.type + "고, 날 수 " + (bird1.getFlight() ? "있" : "없") + "습니다.");
        
        // ** 3항 연산자
        // (bird1.getFlight() ? "있" : "없")
        // bird1.getFlight() 의 리턴 값이 true 면 "있", false 면 "없"
        
    }
}
