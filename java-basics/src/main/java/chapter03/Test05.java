package chapter03;

import java.util.Scanner;

// 10진수, 16진수, 8진수 중 어떤 진수의 값을 입력할지 결정
// 해당 숫자를 입력 후 10진수, 16진수, 8진수로 출력해 보자.
public class Test05 {
    public static void main(String[] args) {
        int type, data = 0;
        String str;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("입력 진수 결정 <1>10 <2>16 <3>8 : ");
        type = s.nextInt();
        
        System.out.printf("값 입력 : ");
        
        
        if (type == 1) {
            // 문자열을 입력받는다.
            str = s.next(); 
            // 문자열을 10진수로 변환한다.
            data = Integer.parseInt(str, 10);
        }
        
        if (type == 2) {
            // 문자열을 입력받는다.
            str = s.next();
            // 문자열을 16진수로 변환한다.
            data = Integer.parseInt(str, 16);
        }
        
        if (type == 3) {
            // 문자열을 입력받는다.
            str = s.next();
            // 문자열을 8진수로 변환한다.
            data = Integer.parseInt(str, 8);
        }
        
        System.out.printf("10진수 ==> %d \n", data);
        System.out.printf("16진수 ==> %X \n", data);
        System.out.printf("8진수 ==> %o \n", data);
        
        
        // 변수 선언시 type, data는 int 로 선언, str은 String 으로 선언
        // type = s.nextInt(); ==> 입력값이 int
        // str = s.next(); ==> 입력값이 String
        
        // 입력값 str은 String => data 값을 int 로 변환해 줘야한다!
        // 이 때 쓰이는 메소드 Integer.parseInt();
        // data = Integer.parseInt(str, 16);

/*
 * parseInt와 valueOf의 차이, int와 Integer의 차이
         
             이 둘의 차이점을 알아보기 전에 먼저 자바에서 Integer와 int의 차이를 알아야 한다.
    1. int와 Integer의 차이
        1) int
            int는 long, double와 같은 원시형 변수로서 
                          산술연산이 가능하고 null 값이 들어갈 수 없는 데이터 타입이다. 
            Integer를 unboxing하면 int가 된다고 표현한다. 

        2) Integer
            Integer는 Wrapper클래스로서 
                           산술연산이 불가능하지만 null 값이 들어갈 수 있다.(SQL 연동 가능) 
            int를 boxing하면 Integer가 된다고 표현한다.

        3) 서로 변환
            int i = integer.intValue(); 
            Integer integer = new Integer(i);

    2. parseInt와 valueOf 차이
            둘 모두 Integer의 메소드인데,
    parseInt는 int형을 리턴하여 산술연산이 가능하고
    valueOf는 Integer형을 리턴하여 산술연산이 불가능하다.

        단, valueOf("10") + valueOf("20") 하면 30이 되는데,
        그 이유는 "+" 연산자 때문에 Integer 타입의 값들이 모두 오토언박싱되어 int형으로 변환되기 때문이다.
        오토박싱과 오토언박싱에 대해서는 다음에 더 자세히 알아보도록 하겠다.
    
[출처] parseInt와 valueOf의 차이 / int와 Integer의 차이|작성자 뉴먼
*/

    }
}
