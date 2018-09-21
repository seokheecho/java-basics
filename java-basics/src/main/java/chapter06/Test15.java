package chapter06;

// for문과 if문을 사용하여 0~127번 아스키코드의 10진수, 16진수, 문자를 출력해보자.
public class Test15 {
    public static void main(String[] args) {
        int i;
        
        // 0부터 127번까지 처리한다.
        for (i = 0; i < 128; i++) {
            // 16행마다 제목 줄을 출력한다.
            if(i % 16 == 0) {
                System.out.printf("------------------\n");
                System.out.printf("10진수     16진수     문자  \n");
                System.out.printf("------------------\n");
            }
            // i 값을 10진수, 16진수, 문자로 출력한다.
            System.out.printf("%5d %5x %5c\n", i, i, i);
        }
    }
}
