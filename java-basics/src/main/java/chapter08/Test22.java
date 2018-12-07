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
        
        // 사용자의 선택이 3이 아니면 while 문을 반복한다.
        while (select != 3) {
            System.out.printf("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
            // 사용자가 선택하는 값
            select = s.nextInt();
            
            switch (select) {
                // 사용자가 1(자동차 넣기)를 선택하면 실행한다.
                case 1 :
                    // 터널에 자동차가 5대 있으면 더 이상 못 들어간다.
                    if (rear >= 5) {
                        System.out.println("터널이 꽉 차서 차가 못 들어감");
                        
                    // 빈 곳이 있으면(5대 미만이면) 자동차를 넣고 rear를 1 증가시킨다.
                    } else {
                        // 자동차 이름 초기값 A부터 시작
                        // 자동차가 들어갈 때마다 A, B, C, ... 들어간다.
                        queue[rear] = carName++;
                        System.out.printf("%c 자동차가 터널에 들어감 \n", queue[rear]);
                        rear++;
                    }
                    // switch 문을 벗어난다.
                    break;
                    
                // 사용자가 2(자동차 빼기)를 선택하면 실행한다.
                case 2 : 
                    // 터널에 자동차가 1대도 없다면 뺴낼 자동차가 없다.
                    if (rear <= 0) {
                        System.out.printf("빠져나갈 자동차가 없음 \n");
                    // 빼낼 자동차가 있으면(1대 이상이면) 맨 앞의 자동차를 뺴낸다.
                    // 그리고 자동차를 한 칸씩 앞으로 이동시킨다.
                    } else {
                        System.out.printf("%c 자동차가 터널에서 빠짐 \n", queue[0]);
                        for (int i = 0; i < 4; i++)
                            queue[i] = queue[i + 1];
                        rear--;
                    }
                    break;
                
                // 사용자가 3(끝)을 선택하면 현재의 자동차 대수를 출력하고 종료한다.
                case 3 : 
                    System.out.printf("현재 터널에 %d대가 있음. \n", rear);
                    System.out.printf("프로그램을 종료합니다. \n");
                    break;
                
                // 사용자가 1, 2, 3 외의 값을 입력하면 처리한다.
                default :
                    System.out.printf("잘 못 입력했습니다. 다시입력하세요. \n");
            
            }
        }
        
        
    }
}
