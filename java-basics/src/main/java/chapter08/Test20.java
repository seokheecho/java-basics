package chapter08;

// 구구단의 결과를 2차원 배열에 저장한 다음 출력해보자.
public class Test20 {
    public static void main(String[] args) {
        // 문자형 2차원 배열 gugu 선언
        int[][] gugu = new int[9][9];
        // 첨자 변수 i, k 선언
        int i, k;
        
        // 구구단을 곱한 결과를 2차원 배열에 저장한다.
        // i, k가 0부터 시작되므로 1을 더해서 곱했다.(배열 0번쨰부터 시작)
        for (i = 0; i < 9; i++) {
            for (k = 0; k < 9; k++) {
                gugu[i][k] = (i + 1) * (k + 1);
            }
        }
        
        // 구구단의 결과를 출력한다.
        for (i = 0; i < 9; i++) {
            for (k = 0; k < 9; k++) {
                System.out.printf("%dX%d=%2d ", k + 1, i + 1, gugu[i][k]);
            }
            // 한 줄을 출력한 다음 줄을 넘긴다.
            System.out.printf("\n");
        }
                
    }
}
