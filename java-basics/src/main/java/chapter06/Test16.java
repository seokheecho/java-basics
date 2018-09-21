package chapter06;

import java.util.Scanner;

// for문을 사용하여 입력된 문자를 다시 거꾸로 출력해보자.
public class Test16 {
    public static void main(String[] args) {
        // 입력받을 문자열 변수를 선언
        String str;
        // 입력한 문자의 개수를 저장할 변수를 선언
        int str_cnt;
        int i;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("글자를 입력 : ");
        // 문자열을 입력받는다.
        str = s.nextLine();
        
        System.out.printf("\n");
        // 입력한 문자열을 출력한다.
        System.out.printf("입력한 문자열 ==> %s\n", str);
        System.out.printf("변환된 문자열 ==> ");
        // 입력한 문자의 개수를 계산한다.
        str_cnt = str.length();
        
        // 입력된 개수만큼 거꾸로 한 글자씩 출력한다.
        for (i = str_cnt-1; i >= 0; i--) {
            System.out.printf("%c", str.charAt(i));
        }
        
        // int str_cnt; 변수 선언 없이 바로 반복문에 넣어서해도 된다.
//        for (i = str.length()-1; i >= 0; i--) {
//            System.out.printf("%c", str.charAt(i));
//        }
        
        
    }
}
