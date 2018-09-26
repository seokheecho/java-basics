package chapter09;

import java.util.Scanner;

// 입력된 문자열이 대문자이면 소문자로 변환하고, 소문자이면 대문자로 변환하며,
// 그 외의 문자는 그대로 출력해보자.
// 문자형 변수x
public class Test24 {
    public static void main(String[] args) {
        //입력 문자열 in과 출력 문자열 out
        String in, out = "";
        char ch;
        int count, i;
        // 대문자와 소문자의 값 차이를 diff에 저장한다.
        int diff = 'a' - 'A';
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("문자열을 입력하세요 : ");
        // 문자열을 입력받는다.
        in = s.nextLine();
        
        // 입력한 문자열의 길이를 구한다.
        count = in.length();
        
        // 문자열의 길이만큼 반복한다.
        for (i = 0; i < count; i++) {
            // 문자열에서 문자 하나를 추출한다.
            ch = in.charAt(i);
            // 문자가 대문자이면 대문자와 소문자의 값 차이를 더한다.
            if (('A') <= ch && (ch <= 'Z')) {
                out += (char) (ch + diff);
            // 문자가 소문자이면 대무낮와 소문자의 값 차이를 뺀다.
            } else if (('a' <= ch) && (ch <= 'z')) {
                out += (char) (ch - diff);
            // 영문이 아닌 기호, 숫자, 한글 등은 그대로 둔다.
            } else {
                out += (char) ch;
            }
            
        }
        
        System.out.printf("변환된 문자열 ==> %s \n", out);
        
        
    }
}
