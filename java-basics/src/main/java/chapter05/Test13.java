package chapter05;

import java.util.Scanner;

// 수식을 띄어쓰기로 한 줄에 입력하고
// switch~case문을 활용하여 두 수의 +, -, *, /, % 연산을 수행해보자.
public class Test13 {
    public static void main(String[] args) {
        int a, b;
        char ch;
        // 문자열 배열을 준비한다.
        // 입력된 수식을 str[0], str[1], str[2]에 분리해서 넣기 위한 것이다.
        String[] str;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("수식을 한줄로 띄어쓰기로 입력하세요 : ");
        // nextLine()은 문자열을 한 줄로 입력받는다.
        // split(" ")은 입력 받은 문자열을 공백으로 분리한다.
        // 결국 첫번쨰 숫자는 str[0], 연산자는 str[1]에, 두 번째 숫자는 str[2]에 저장된다.
        str = s.nextLine().split(" ");
        
        // 첫번째 숫자에 해당하는 문자열(str[0])을 정수로 변환하여 a에 저장
        a = Integer.parseInt(str[0]);
        
        // 연산자에 해당하는 문자열(str[1])의 첫번째 글자만 추출하여 ch에 저장
        ch = str[1].charAt(0);
        
        b = Integer.parseInt(str[2]);
        
        switch (ch) {
        case '+' :
            System.out.printf("%d + %d = %d 입니다. \n", a, b, a + b);
            break;
        case '-' :
            System.out.printf("%d - %d = %d 입니다 \n", a, b, a - b);
            break;
        case '*' :
            System.out.printf("%d * %d = %d 입니다. \n", a, b, a * b);
            break;
        case '/' :
            // 나눈값을 정수로 출력
            System.out.printf("%d / %d = %d 입니다. \n", a, b, a / b);
            
            // System.out.printf("%d / %d = %f 입니다. \n", a, b, a / (float) b);
            // 결과값은 소수점도 나와야한다. ex) 10/3 = 3.333333
            // flaot으로 추출
            break;
        case '%' :
            System.out.printf("%d %% %d = %d 입니다. \n", a, b, a % b);
            break;
        default :
            System.out.printf("연산자를 잘 못 입력했습니다. \n");
        }
        
    }
}
