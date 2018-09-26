package chapter09;

import java.util.Scanner;

// 입력된 문자열을 문자열을 이용해서 거꾸로 출력해보자.
public class Test23 {
    public static void main(String[] args) {
        // 문자열 ss, tt 를 선언하고 tt는 ""로 초기화한다.
        String ss;
        String tt = "";
        int count, i;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("문자열을 입력하세요 : ");
        // 문자열을 입력받는다.
        ss = s.nextLine();
        
        // 입력받은 문자의 개수를 구한다.
        count = ss.length();
        
        // 문자열의 개수만큼 반복해서 tt에 입력받은 문자열을 거꾸로 저장한다.
        for (i = 0; i < count; i++) {
            tt += ss.charAt(count - (i + 1));
            // tt = tt + ss.charAt(count-(i+1));
        }
        System.out.printf("내용을 거꾸로 출력 ==> %s \n", tt);
        
        
    }
}
