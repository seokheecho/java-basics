package chapter02;

import java.util.Scanner;

// 숫자 4개를 입력받아 "합" 구하기
public class Test01 {

    public static void main(String[] args) {
        int a, b, c, d;
        int result;
        
        //입력받는 데이터를 가져오기 위해 입력을 스캔해주는 나만의 스캔기를 제작한다.
        //설계도인 스캐너 클래스가 필요하다.
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
        // nextInt() 함수를 이용하여 입력 값을 바이트 단위로 정수를 입력받도록 한다.
        a = s.nextInt();
        
        System.out.print("두번째 계산할 값을 입력하세요 ==> ");
        b = s.nextInt();
        System.out.print("세번쨰 계산할 값을 입력하세요 ==> ");
        c = s.nextInt();
        System.out.print("네번쨰 계산할 값을 입력하세요 ==> ");
        d = s.nextInt();
        
        result = a + b + c + d;
        
        System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
        
        // println, printf 비교
        System.out.printf("println, printf 비교 \n");
        System.out.printf("%d + %d + %d + %d = %d", a, b, c, d, result);
        
        
    }
    
}
