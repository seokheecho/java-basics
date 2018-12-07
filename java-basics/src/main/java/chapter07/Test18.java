package chapter07;

import java.util.Scanner;

// 입력한 문자열의 대문자와 소문자, 숫자가 각각 몇 개인지 세어보는 걸 작성해보자.
// 그외 특수 기호 등의 문자는 무시한다.
public class Test18 {
    public static void main(String[] args) {
        String str;
        char ch;
        // 대문자, 소문자, 숫자의 개수를 초기화 한다.
        int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0;
        int i;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("문자열을 입력 : ");
        str = s.nextLine();
        
        // 추출할 문자의 위치를 나타낼 변수 i
        i = 0;

        do {
            // 문자열에서 한 글자를 추출(문자열의 개수만큼 반복 - do ~ while 반복문).
            ch = str.charAt(i);
            
            // 추출한 한 글자가 A ~ Z 이면 대문자의 개수가 1개 증가한다.
            if (ch >= 'A' && ch <= 'Z') {
                upper_cnt++;
            }
            // 추출한 한 글자가 a ~ z 이면 소문자의 개수가 1개 증가한다.
            if (ch >= 'a' && ch <= 'z') {
                lower_cnt++;
            }
            // 추출한 한 숫자가 0 ~ 9 이면 숫자의 개수가 1개 증가한다.
            if (ch >= '0' && ch <= '9') {
                digit_cnt++;
            }
            
            // 1씩증가
            // ex) abcABC123
            // a 다음 b, b 다음 c,  ...
            // for문으로 다시 작성해보자. => for (i = 0; i < str.length(); i++)
            i++;
          
        } while (i < str.length()); // 문자열의 길이 만큼 반복
        
        System.out.printf("대문자 %d개, 소문자  %d개, 숫자 %d개 \n", upper_cnt, lower_cnt, digit_cnt);
        
        
        // **ch = str.charAt(i);
        // 문자열에서 한글자만 추출해서 들어간다.
        // 반복문을 돌려서 한라인씩 출력
//        for (i = 0; i < str.length(); i++) {
//        ch = str.charAt(i);
//        System.out.println(ch);
//        }
        
    }
}
