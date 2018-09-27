package chapter11;

// Chapter11 - Test29 애완동물(Pet) 클래스를 만들어보자.
    
// 애완동물 클래스를 정의한다.
class PetTest29 {
    // 인스턴스 변수로 애완동물의 종류와 개월 수를 선언한다.
    String type;    // 애완동물 종류
    int age;    // 애완동물 개월 수
    
    // 애완동물의 움직임을 설정하는 메소드를 정의한다.
    void move() {
        System.out.println(this.type + "가 움직입니다.");
    }
    
    // 애완동물의 개월 수를 반환하는 메소드를 정의한다.
    int getAge() {
        return this.age;
    }
}

//Chapter11 - Test29 애완동물(Pet) 클래스를 만들어보자.
public class Test29 {
    public static void main(String[] args) {
        // 애완동물 인스턴스 1을 생성하고 종류에
        // '강아지', 개월 수에 '8'을 대입한다.
        PetTest29 pet1 = new PetTest29();
        pet1.type = "강아지";
        pet1.age = 8;
        
        //애완동물 인스턴스 2를 생성하고 종류에
        // '고양이', 개월 수에 '13'을 대입한다.
        PetTest29 pet2 = new PetTest29();
        pet2.type = "고양이";
        pet2.age = 13;
        
        // 메소드를 호출한다.
        pet1.move();
        pet2.move();
        
        // 인스턴스 변수와 내용을 출력한다.
        System.out.println(pet1.type + "는 " + pet1.age + "개월입니다.");
        System.out.println(pet2.type + "는 " + pet2.age + "개월입니다.");
        
    }
    
}
