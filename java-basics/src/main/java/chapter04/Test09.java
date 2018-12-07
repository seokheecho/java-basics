package chapter04;

import java.util.Scanner;

// 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해주는 "동전 교환 프로그램"을 작성해보자.
// 1) 동전의 총개수는 최소화한다.
// 2) 고액의 동전을 우선적으로 교환해준다.
public class Test09 {
    public static void main(String[] args) {
        int money, c500, c100, c50, c10;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("## 교환할 돈은 ? ");
        money = s.nextInt();
        
        // 500원짜리 동전의 개수를 계산
        c500 = money / 500;
        // 500원짜리로 바꾼 후 나머지 금액을 계산한다.
        money = money % 500;
        
        c100 = money / 100;
        money = money % 100;
        
        c50 = money / 50;
        money = money % 50;
        
        c10 = money /10;
        money = money % 10;
        
        System.out.println();
        System.out.printf("500원짜리 ==> %d 개 \n", c500);
        System.out.printf("100원짜리 ==> %d 개 \n", c100);
        System.out.printf("50원짜리 ==> %d 개 \n", c50);
        System.out.printf("10원짜리 ==> %d 개 \n", c10);
        
        // 바꾸지 못한 나머지 돈은 money에 들어 있다.
        System.out.printf("바꾸지 못한 잔돈 ==> %d 개 \n", money);
        
        
        
        
        
        
        
        
        
        
        
    }
}
