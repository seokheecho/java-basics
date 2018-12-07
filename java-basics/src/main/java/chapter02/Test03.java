package chapter02;

import java.io.IOException;
import java.util.Scanner;

// Test02 에서 "0" 으로 나누면 오류가 발생한다.
// 이러한 오류를 없도록 하고 연산자(+, -, *, /)로 입력, 나머지 값 연산자인 %도 계산되게 만들자.
public class Test03 {
    // throws IOException : 입력 오류 방지를 위한 문법
    // "오류 - 예외처리" 는 뒤에서 다시 다뤄보기로 하자.
    public static void main(String[] args) throws IOException{
        
        int a, b;
        int result;
        char k;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
        a = s.nextInt();
        
        System.out.print("+ - * / % ==> ");
        // 연산자 입력
        k = (char) System.in.read();
        
        System.out.print("두번째 계산할 값을 입력하세요 ==> ");
        b = s.nextInt();
        
        if (k == '+') {
            result = a + b;
            System.out.printf("%d + %d = %d", a, b, result);
        }
        
        if (k == '-') {
            result = a - b;
            System.out.printf("%d - %d = %d", a, b, result);
        }
        
        if (k == '*') {
            result = a * b;
            System.out.printf("%d * %d = %d", a, b, result);
        }
        
        if (k == '/') {
            if (b != 0) {
            result = a / b;
            System.out.printf("%d / %d = %d", a, b, result);
            } else {
                System.out.println("0으로 나눌 수 없습니다. - 나눌셈 오류");
            }
        }
        
        if (k == '%') {
            if (b != 0) {
            result = a % b;
            System.out.printf("%d %% %d = %d", a, b, result);
            // System.out.println(a + "%" + b + "=" + result); 
            } else {
                System.out.println("0으로 나눌 수 없습니다. - 나머지 값 오류");
            }
            
        }
        
        
    }
}
