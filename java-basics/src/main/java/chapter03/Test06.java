package chapter03;

// 각 데이터형의 크기(bit)를 확인해보자.
public class Test06 {
    public static void main(String[] args) {
        
        // \t - Tab 크기 만큼 띄우기, \n - 한줄 내리기
        System.out.printf("byte 형의 크기 \t\t ==> %d \n", Byte.SIZE);
        System.out.printf("short 형의 크기 \t\t ==> %d \n", Short.SIZE);
        System.out.printf("int 형의 크기 \t\t ==> %d \n", Integer.SIZE);
        System.out.printf("long 형의 크기 \t\t ==> %d \n", Long.SIZE);
        System.out.printf("float 형의 크기 \t\t ==> %d \n", Float.SIZE);
        System.out.printf("double 형의 크기 \t\t ==> %d \n", Double.SIZE);
        System.out.printf("char 형의 크기 \t\t ==> %d \n", Character.SIZE);
        
        // 각 데이터 형식 Wrapper 클래스의 size 필드를 통해 데이터형의 크기를
        // 비트 단위로 출력한다. (Wrapper 클래스는 chapter14에서 다시 다뤄본다.)
    }
}
