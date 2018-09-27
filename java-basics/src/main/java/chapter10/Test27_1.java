package chapter10;

import java.io.PrintWriter;

// ** 지정한 경로에 파일 생성 확인 완료
// ** 입력된 내용 파일에 출력 안됨.. 재확인...
// chapter06 - Test14 의 내용을 gugu.txt 파일에 쓰도록 수정해보자.
public class Test27_1 {
    public static void main(String[] args) throws Exception {
        int i, k;
        
        // 파일에 쓰기 위해 PrintWriter 인스턴스를 준비한다.
        PrintWriter pw = new PrintWriter("src/main/java/chapter10/temp/gugu.txt");
        String str = "";
        
        // 맨 위에 단의 제목을 출력하기 위해 str 변수에 누적한다.
        for (i = 2; i <= 9; i++) 
            str += " #제" + i + "단#";
        
        // str의 내용을 파일에 쓴다.
        pw.println(str);
        // pw.write(str);
        // 빈칸을 출력한다.
        pw.println();
        // pw.write("\n");
        str = "";
        
        
        for (i = 1; i <= 9; i++) {
            for(k = 2; i <= 9; k++) {
                str += String.format("%2dX%2d=%2d", k, i, k * i);
            }
            pw.println(str);
            // pw.write(str);
            str = "";
        }
        pw.close();
        
    }
    
}
