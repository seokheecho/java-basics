package chapter07;

import java.util.Scanner;

// 0 ~ 9 중에서 입력한 숫자만큼 별표를 출력하는 프로그램을 작성해 보자.
// 예를 들어 5914를 입력하면 각 죽에 별을 5개, 9개, 1개, 4개 출력한다.
public class Test19 {
    public static void main(String[] args) {
        String str;
        char ch;
        // i, k는 반복문에서 사용
        int i, k;
        // star는 별의 개수를 추출
        int star;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("숫자를 여러 개 입력 : ");
        str = s.nextLine();
        
        i = 0;
        ch = str.charAt(i);
        while (true) { // 문자가 있는 동안 반복 하는데 여기서는 4회 반복한다.(ex) 입력값 - 5914)
            // 문자를 숫자로 변환 (예를들어 5는 아스키 값이 53이므로 숫자 5로 만들려면 48을 뺀다.)
            star = (int) ch - 48;
            
            // 별의 개수만큼 *를 화면에 출력한다.
            for (k = 0; k < star; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
            
            // 먼저 i를 증가시킨 후 문자열 길이 -1 보다 크면 while 문을 종료한다.
            if (++i > str.length() -1) 
                break;
            // 문자열에서 한 글자(숫자)를 추출
            // 처음 while 반복문 밖에서 한번, 그 다음 문자열에 대한 부분이다.
            ch = str.charAt(i);
        }
      
    }
}
