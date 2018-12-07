package chapter02;

import java.util.Scanner;

// 덧셈, 뺄셈, 곱셈, 나눗셈 중 하나를 선택하여 계산, if 문 사용해서 작성
public class Test02 {
    public static void main(String[] args) {
        
        int a, b;
        int result;
        // 계산 방식을 선택할 변수 선언
        int k;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
        a = s.nextInt();
        System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눌셈 ==> ");
        k = s.nextInt();
        System.out.print("두번째 계산할 값을 입력하세요 ==> ");
        b = s.nextInt();
        
        // 입력한 k가 1이면 덧셈 수행
        if (k == 1) {
            result = a + b;
            System.out.printf("%d + %d = %d", a, b, result);
        }
        
        if (k == 2) {
            result = a - b;
            System.out.printf("%d - %d = %d \n", a, b, result);
        }
        
        if (k == 3) {
            result = a * b;
            System.out.printf("%d * %d = %d \n", a, b, result);
        }
        
        if (k == 4) {
            result = a / b;
            System.out.printf("%d / %d = %d \n", a, b, result);
        }
        
        
    }
}
