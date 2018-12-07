package chapter07;

import java.util.Scanner;

// 입력한 두 수 사이의 합계를 구하되 원하는 배수를 선택하여 합계를 구해보자.
// ex) 100 ~ 200 중에서 4의 배수의 합계를 구할 수 있다.
public class Test17 {
    public static void main(String[] args) {
        int  start, end;
        int basu, i;
        int hap = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("합계의 시작 값 ==> ");
        start = s.nextInt();
        System.out.printf("합계의 끝 값 ==> ");
        end = s.nextInt();
        System.out.printf("배수 ==> ");
        basu = s.nextInt();
        
        // i의 값을 시작 값으로 초기화 한다.
        i = start;
        // i의 값이 끝 값보다 작은 동안 반복
        while (i <= end) {
            //i의 값이 입력한 배수라면 합계에 누적한다.
            if (i % basu == 0) {
                hap = hap + i;
            }
            i++;
        }
        
        System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d \n", start, end, basu, hap);
        
    }

}
