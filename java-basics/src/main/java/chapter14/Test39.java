package chapter14;

// Chapter12 - Test33 슈퍼 클래스인 애완동물(Pet) 클래스를 상속받는
// 강아지(Dog) 클래스와 새(Bird) 클래스를 만들어보자.

//애완동물 클래스(슈퍼 클래스)를 정의
class PetTest33 {
    int age;
    
    public void move() {
        System.out.println("슈퍼클래스 move() : 애완동물이 움직입니다.");
    }
}

// 애완동물 클래스를 상속받는 강아지 클래스(서브 클래스)를 정의
class DogTest33 extends PetTest33 {
}

//애완동물 클래스를 상속받는 새 클래스(서브 클래스)를 정의
class BirdTest33 extends PetTest33 {
    // move() 메소드를 오버라이딩 한다.
    public void move() {
        System.out.println("서브클래스 move() : 새가 날아갑니다.");
    }
}

// Chapter12 - Test33 애완동물(Pet) 클래스를 상속받는
// 강아지(Dog) 클래스와 새(Bird) 클래스를 만들어보자.
public class Test39 {
    public static void main(String[] args) {
        // 강아지 인스턴스와 새 인스턴스를 생성한다.
        DogTest33 dog1 = new DogTest33();
        BirdTest33 bird1 = new BirdTest33();
        
        // 강아지 인스턴스의 move() 메소드를 호출한다.
        // 상속 받은 Pet 클래스의 move() 메소드가 호출된다.
        dog1.move();
        
        //새 인스턴스의 move() 메소드를 호출한다.
        // 오버라이딩한 move() 메소드가 호출된다.
        bird1.move();
    }
}
