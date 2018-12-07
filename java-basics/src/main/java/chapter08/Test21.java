package chapter08;

// 10x10x10 크기의 3차원 배열에서 1부터 1000까지 저장하고
// 다음 그 합계를 구해보자.
public class Test21 {
    public static void main(String[] args) {
        // **3차원 배열 선언
        // int[][][] aaa = new int[면][행][열];
        // 3차원 배열을 선언
        int[][][] array = new int[10][10][10];
        // 첨자를 3개 선언
        int i, j, k;
        // 1부터 1000까지 증가할 index, 합계를 누적할 hap 변수 선언
        int index = 1, hap = 0;
        
        // 3차원 배열 array에 1부터 1000까지
        // 1000개(=10x10x10)의 데이터를 채운다.
        for (i = 0; i < 10; i++)
            for (j = 0; j < 10; j++)
                for (k = 0; k < 10; k++)
                    array[i][j][k] = index++;
        
        // 3차원 배열의 값을 모두 더한다.
        for (i = 0; i < 10; i++)
            for (j = 0; j < 10; j++)
                for (k = 0; k < 10; k++)
                    hap += array[i][j][k];
                
        System.out.printf("1~1000 까지 합계 : %d", hap);
                
                
    }
}
