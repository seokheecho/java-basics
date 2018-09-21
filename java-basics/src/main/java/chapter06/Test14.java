package chapter06;

// 중첩 for문을 사용하여 제목과 구구단을 출력해보자.
public class Test14 {
    public static void main(String[] args) {
        int i, k;
        
        for(i = 2; i <= 9; i++)
            // 맨 위에 단의 제목 출력
            System.out.printf(" #제%d단# ", i);
        // 두 줄 띄운다.
        System.out.printf("\n\n");
        
        // 중첩 for문으로 구구단 출력
        for (i = 1; i <= 9; i++) {
            for (k = 2; k <= 9; k++) {
                // %nd : n칸을 확보하여 오른쪽 정렬하여 출력
                // %2d - 2칸을 확보하고 오른쪽 정렬하여 정수로 출력
                System.out.printf("%2dX%2d=%2d", k, i, k * i);
            }
            System.out.printf("\n");
        }
        
/* 출력
   1) System.out.print("출력 대상 문자열");
           출력 대상 문자열을 출력후 커서는 내리지 못함
   2) System.out.println("출력 대상 문자열");
           출력 대상 문자열을 출력후 커서는 내림(Enter Key를 누름 효과)
   3) "\n" : Enter Key
       "\t" : 일정한 위치에 커서를 둠
   4) System.out.printf("출력 제어 문자열", 출력대상1, 출력대상2);
       i) 정수출력 : %d
       ii) 실수 : %f, %e
       iii) 문자 : %c
       iiii) 문자열 : %s
       iv) %nd : n칸을 확보하여 오른쪽 정렬하여 출력
            %-nd : n칸을 확보하여 왼쪽 정렬하여 출력
            ex) %3d, %-12s, %3c
       v) %f : 소수이하 6자리까지 출력
           %.mf : 소수이하 m자리까지 출력
           %n.mf : 전체 n자리를 확보후 소수이하 m자리까지 출력
[출처] Java 2018년 8월 9일|작성자 cib0306
 */
        
    }
}
