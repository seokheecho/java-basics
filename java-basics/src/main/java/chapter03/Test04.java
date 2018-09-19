package chapter03;

import java.util.Scanner;

// 정수형 숫자 하나를 입력받고 10진수, 16진수, 8진수로 출력해보자.
public class Test04 {
    public static void main(String[] args) {
        int data;
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하세요 ==> ");
        data = s.nextInt();
        
        System.out.printf("10진수 ==> %d \n", data);
        System.out.printf("16진수 ==> %X \n", data);
        System.out.printf("8진수 ==> %o \n", data);
        
        // 10진수 %d, 16진수 %X, 8진수 %o
        // 정수 %d, 실수 %f, 문자 %c, 문자열 %s 서식을 사용
        
    }
    
}
