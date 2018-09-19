package chapter03;

import java.util.Scanner;

// 문자열을 입력받고, 입력받은 문자열의 순서를 꺼꾸로 출력해보자.
public class Test07 {
    public static void main(String[] args) {
        int i;
        String str;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("문자열을 입력 ==> ");
        str = s.nextLine();
        
        // str 배열에 들어 있는 문자열을 맨 뒤부터 맨 앞까지 출력
        // 결국 입력한 순서의 반대로 출력된다.
        // str.length()는 문자열의 길이를 반환
        // str.charAt(위치)는 위치의 한 글자를 반환한다.
        
        // ex) 입력값 - HELLO
        // str 배열에 HELLO 들어간다.
        // 0번째 H, 1번째 E, 2번째 L, 3번째 L, 4번째 O
        // 반복문을 통해 i = str.length() -1 "문자열의 길이를 -1 만큼 반환"
        // str.chart(i) "i 위치의 한글자를 반환"
        // OLLEH
        // **문자열의 길이는 5, 배열에 들어가면 0번째 부터 들어간다. 따라서 -1**
        // 들어간 문자열의 길이 확인
        // System.out.println(str.length());
        for (i = str.length() -1; i >= 0; i--) {
            System.out.printf("%c", str.charAt(i));
        }
        
        // 반복문은 chapter06, 07 에서 더 많이 다뤄보자!
        
        System.out.printf("\n");
        
/*
 * 자바 스캐너(Scanner) - 입력을 받을 수 있도록 돕는 기능(메소드)
    byte : nextByte()
    short : nextShort()
    int : nextInt()
    long : nextLong()
    float : nextFloat()
    double : nextDouble()
    String : next(), nextLine()
    boolean : nextBoolean()
    
        next() : 공백을 만나면 종료(공백 단위)
        nextLine() : /n(개행-엔터)를 만나면 종료, next()와 달리 띄어쓰기 가능(엔터 단위)
        nextInt() : Int 형 반환함수 즉 공백을 만나면 종료(공백 단위)
        nextDouble() : double 형 반환함수 즉 공백을 만나면 종료(공백 단위)
    
[출처] 자바입력값next(),nextInt(),nextLine() 메소드|작성자 알로베나
*/

    }
}
