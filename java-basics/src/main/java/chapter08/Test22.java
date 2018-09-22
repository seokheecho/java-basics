package chapter08;

import java.util.Scanner;

// 양쪽이 모두 열려 있는 큐를 배열로 구현해보자.
// 한쪽은 입구, 다른쪽은 출구로 사용하고
// 자동차가 나가면 한 칸씩 앞으로 당긴다.
public class Test22 {
    public static void main(String[] args) {
        // 터널과 rear의 초깃값을 선언
        // 즉, 터널이 비어 있다.
        char[] queue = new char[5];
        int rear = 0;
        
        // 자동차 이름을 A부터 시작한다.
        char carName = 'A';
        // 사용자가 선택한 작업을 입력할 변수를 선언한다.
        int select = '9';
        
        Scanner s = new Scanner(System.in);
        
        while (select != 3) {
            System.out.printf("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
            select = s.nextInt();
            
            switch (select) {
            case 1 :
                if (rear > 5) {
                    System.out.println("터널이 꽉 차서 차가 못 들어감");
                } else {
                    queue[rear] = carName++;
                    System.out.printf("%c 자동차가 터널에 들어감 \n", queue[rear]);
                    rear++;
                }
                break;
                
            case 2 : 
                if (rear <= 0) {
                    System.out.println("빠져나갈 자동차가 없음");
                } else {
                    System.out.printf("");
                }
            case 3 : 
            
            
            
            
            
            
            
            
            }
        }
        
        
    }
}
