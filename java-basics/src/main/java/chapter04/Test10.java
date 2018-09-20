package chapter04;

import java.util.Scanner;

// 입력된 연도가 윤년인지 계산하는 "윤년 계산 프로그램"을 작성해보자.
// 1) 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년이다.
// 2) 400으로 나누어 떨어지는 해도 윤년에 포함된다.
public class Test10 {
    public static void main(String[] args) {
        int year;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("연도를 입력하세요 : ");
        year = s.nextInt();
        
        // 윤년은 연도가 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않아야한다.
        // 또는 400으로 니누어 떨어진다.
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.printf("%d 년은 윤년입니다. \n", year);
        else
            System.out.printf("%d 년은 윤년이 아닙니다. \n", year);
        
        // 논리 연산자
        // && - ~이고, 그리고(AND) / 둘다 참이어야 참이다.
        // || - ~이거나, 또는(OR) / 둘 중 하나만 참이어도 참이다.
        // ! - ~아니다, 부정(NOT) / 참이면 거짓이고, 거짓이면 참이다.
    }
}
