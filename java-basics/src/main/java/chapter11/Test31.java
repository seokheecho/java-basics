package chapter11;

//Chapter11 - Test31 애완동물(Pet) 클래스를 만들어보자.
//초기에 생성자에서 속성 값을 설정하는 방법을 사용한다.
    
// 애완동물 클래스를 정의한다.
class PetTest31 {
    // 인스턴스 변수로 애완동물의 종류와 개월 수를 선언
    private String type;
    private int age;
    // 클래스 변수로 애완동물의 수를 선언
    static int count = 0;
    
    // 애완동물의 종류와 개월 수를 설정하는 생성자를 정의
    PetTest31(String type, int age) {
        this.type = type;
        this.age = age;
    }
    
    // 애완동물의 수를 출력하는 클래스 메소드를 정의
    static int getCount() {
        return count;
    }
    
    // 애완동물의 움직임을 설정하는 인스턴스 메소드를 정의
    public void move() {
        System.out.println(this.type + "가 움직입니다.");
    }
    
    // 애완동물의 종류를 반환하는 인스턴스 메소드를 정의
    public String getType() {
        return this.type;
    }
    
    // 애완동물의 개월 수를 반환하는 메소드를 정의
    public int getAge() {
        return this.age;
    }
    
}

// Chapter11 - Test31 애완동물(Pet) 클래스를 만들어보자.
// 초기에 생성자에서 속성 값을 설정하는 방법을 사용한다.
public class Test31 {
    public static void main(String[] args) {
        // 애완동물 인스턴스 1을 생성하고 종류에 '강아지', 개월 수에 '5'을 대입
        PetTest31 pet1 = new PetTest31("강아지", 5);
        // 애완동물의 수(클래스 변수)를 증가시킨다.
        PetTest31.count++;
        
        // 애완동물 인스턴스 2을 생성하고 종류에 '고양이', 개월 수에 '7'을 대입
        PetTest31 pet2 = new PetTest31("고양이", 7);
        // 애완동물의 수(클래스 변수)를 증가시킨다.
        PetTest31.count++;
        
        // 애완동물의 움직임을 설정하는 메소드를 호출한다.
        pet1.move();
        pet2.move();
        
        // 인스턴스 변수의 내용을 출력한다.(인스턴스 메소드를 통해 접근)
        System.out.println(pet1.getType() + "는 " + pet1.getAge() + "개월입니다.");
        System.out.println(pet2.getType() + "는 " + pet2.getAge() + "개월입니다.");
        
        // 클래스 변수의 내용을 출력한다.(클래스 메소드를 통해 접근)
        System.out.println("현재 우리집 애완동물 수는 " + PetTest31.getCount() + "마리 입니다.");
        
    }
}
