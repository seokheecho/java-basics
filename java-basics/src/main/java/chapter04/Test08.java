package chapter04;

import java.util.Scanner;

// 실수 2개를 입력받아 다양한 연산을 출력해보자.
public class Test08 {
    public static void main(String[] args) {
        float a, b;
        float result;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = s.nextFloat();
        
        System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
        b = s.nextFloat();
        
        result = a + b;
        System.out.printf("%5.2f + %5.2f = %5.2f \n", a, b, result);
        
        result = a - b;
        System.out.printf("%5.2f - %5.2f = %5.2f \n", a, b, result);
        
        result = a * b;
        System.out.printf("%5.2f * %5.2f = %5.2f \n", a, b, result);
        
        result = a / b;
        System.out.printf("%5.2f / %5.2f = %5.2f \n", a, b, result);
        
        // 나머지 연산을 위해 실수를 정수로 강제 형 변환
        result = (int) a % (int) b;
        System.out.printf("%d %% %d = %d \n", (int) a, (int) b, (int) result);
        

        // %5.2f
        // 5 -> 정수형 자리수가 5임을 의미한다.
        // . -> 소수점을 의미
        // 2 -> 소수점 아래 2째자리까지 라는 것을 의미한다.
        // f -> 실수라는 것을 의미한다.
        // 즉, 출력할 숫자는 실수이며 소수점 아래 둘쨰자리까지의 자리수를 갖고,
        // 소수점 이상 5자리수를 갖는 실수형 숫자라는 의미
        // (%5.2f의 5는 width에 해당, %5.2f는 소수점 이하 2자리를 표시한다는 데 전체 자리는 5칸을 차지한다.)
        
        // **참고
        // %3d -> 정수형 3자리를 의미한다.
        
    }
}
