package chapter05;

import java.util.Scanner;

// 단순 if문을 활용하여 두 수의 +, -, *, /, % 연산을 수행해보자.
public class Test11 {
    public static void main(String[] args) {
        int a, b;
        char ch;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("첫번째 수를 입력하세요 : ");
        a = s.nextInt();
        
        System.out.printf("계산할 연산자를 입력하세요 : ");
        // 연산자를 입력받는다. s.next()는 문자열을 입력받고
        // charAt(0)은 그중 첫 번째 글자를 추출한다.
        // 즉, 맨 먼저 입력한 글자를 연산자로 사용한다.
        ch = s.next().charAt(0);
        
        System.out.printf("두번째 수를 입력하세요 : ");
        b = s.nextInt();
        
        if (ch == '+') {
            System.out.printf("%d + %d = %d 입니다. \n", a, b, a + b);
        }
        
        if (ch == '-') {
            System.out.printf("%d - %d = %d 입니다. \n", a, b, a - b);
        }
        
        if (ch == '*') {
            System.out.printf("%d * %d = %d 입니다. \n", a, b, a * b);
        }
        
        if (ch == '/') {
            // 결과값은 소수점도 나와야한다. ex) 10/3 = 3.333333
            // flaot으로 추출
            System.out.printf("%d / %d = %f 입니다. \n", a, b, a / (float) b);
        }
        
        if (ch == '%') {
            System.out.printf("%d %% %d = %d 입니다. \n", a, b, a % b);
        }
        
    }
}
