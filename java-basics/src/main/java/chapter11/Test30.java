package chapter11;

// Chapter11 - Test30 애완동물(Pet) 클래스를 만들어보자.
// 접근 제어 수식어를 활용하여 속성은 외부에서 접근할 수 없도록 하고
// 메소드에서만 속성에 접근하게 한다.
    
// 애완동물 클래스를 정의한다.
class PetTest30 {
    // 인스턴스 변수로 애완동물의 종류와 개월 수를 선언
    private String type;
    private int age;
    
    // 애완동물의 움직임을 설정하는 메소드를 정의
    public void move() {
        System.out.println(this.type + "가 움직입니다.");
    }
    
    // 애완동물의 종류를 설정하는 메소드를 정의
    public void setType(String type) {
        this.type = type;
    }
    
    // 애완동물의 개월 수를 설정하는 메소드를 정의
    public void setAge(int age) {
        this.age = age;
    }
    
    // 애완동물의 종류를 반환하는 메소드를 정의
    public String getType() {
        return this.type;
    }
    
    // 애완동물의 개월 수를 반환하는 메소드를 정의
    public int getAge() {
        return this.age;
    }
    
}

// Chapter11 - Test30 애완동물(Pet) 클래스를 만들어보자.
// 접근 제어 수식어를 활용하여 속성은 외부에서 접근할 수 없도록 하고
// 메소드에서만 속성에 접근하게 한다.
public class Test30 {
    public static void main(String[] args) {
        // 애완동물 인스턴스 1을 생성하고
        // 종류에 '강아지', 개월 수에 '10'을 대입한다.
        PetTest30 pet1 = new PetTest30();
        pet1.setType("강아지");
        pet1.setAge(10);
        
        // 애완동물 인스턴스 2을 생성하고
        // 종류에 '고양이', 개월 수에 '15'을 대입한다.
        PetTest30 pet2 = new PetTest30();
        pet2.setType("고양이");
        pet2.setAge(15);
        
        // 애완동물의 움직임을 설정하는 메소드를 호출한다.
        pet1.move();
        pet2.move();
        
        System.out.println(pet1.getType() + "는 " + pet1.getAge() + "개월입니다.");
        System.out.println(pet2.getType() + "는 " + pet2.getAge() + "개월입니다.");
    }
}
