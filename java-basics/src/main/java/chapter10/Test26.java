package chapter10;

import java.util.Scanner;

// 사칙연사을 처리하는 계산기를 작성해보자.
// 단, 0으로 나누거나 0을 곱하는 것은 오류로 처리하고,
// 처리 결과가 음수로 나와도 오류를 발생시키도록 한다.
public class Test26 {
    public static void main(String[] args) {
        int a, b, result = 0;
        char ch;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("첫번째 수를 입력하세요 : ");
        a = s.nextInt();
        
        System.out.printf("계산할 연산자를 입력하세요 : ");
        ch = s.next().charAt(0);
        
        System.out.printf("두번째 수를 입력하세요 : ");
        b = s.nextInt();
        
        // 오류가 발생했을 때 try ~ catch로 처리한다.
        try {
            switch(ch) {
                case '+' : result = a + b; break;
                case '-' : result = a - b; break;
                case '*' : 
                    if (a == 0 || b == 0)
                        throw new Exception("0으로 곱하면 어차피 0입니다.");
                    result = a * b; break;
                case '/' : 
                    if (b == 0)
                        throw new Exception("0으로 나누면 안됩니다.");
                    result = a / b; break;
            }
            if (result < 0) {
                throw new Exception("결과가 음수네요. ㅠㅠ");
            }
            
            System.out.printf("결과 값 ==> %d", result);
        // 오류가 발생하면 이 부분이 실행된다.
        // 이 경우에는 오류 발생 시에 보내온 메세지를 출력한다.
        } catch (Exception e) {
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
        
        
    }
}
