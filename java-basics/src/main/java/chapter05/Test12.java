package chapter05;

import java.util.Scanner;

// 중복 if문을 활용하여 두 수의 +, -, *, /, % 연산을 수행해보자.
public class Test12 {
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
        
        // 문장이 하나일 때는 중괄호로 묶지 않아도 된다.
        // 추후 문장이 삽입이 될 수 있으니 중괄호를 넣어주자.
        // 또한 어디서부터 어디까지 인지 알 수 있으니깐 중괄호를 사용하자.
        if (ch == '+') {
            System.out.printf("%d + %d = %d 입니다. \n", a, b, a + b);
        } else if (ch == '-') {
            System.out.printf("%d - %d = %d 입니다. \n", a, b, a - b);
        } else if (ch == '*') {
            System.out.printf("%d * %d = %d 입니다. \n", a, b, a * b);
        } else if (ch == '/') {
            // 결과값은 소수점도 나와야한다. ex) 10/3 = 3.333333
            // flaot으로 추출
            System.out.printf("%d / %d = %f 입니다. \n", a, b, a / (float) b);
        } else if(ch == '%') {
            System.out.printf("%d %% %d = %d 입니다. \n", a, b, a % b);
        } else {
            System.out.println("연산자를 잘 못 입력했습니다.");
        }
        
    }
}
