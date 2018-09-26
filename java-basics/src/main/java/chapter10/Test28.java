package chapter10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//** 지정한 경로에 파일 생성 확인 완료
//** 입력된 내용 파일에 출력 안됨.. 재확인...
// 미리 만들어둔 in.txt 파일의 내용을 읽어와 out.txt 파일에 쓰되
// 각 행의 문자를 거꾸로 저장해 보자.
public class Test28 {
    // 파일 관련 클래스는 예외처리가 필요하다.
    public static void main(String[] args) throws Exception {
        // 파일을 행 단위로 읽기 위해 Scanner 인스턴스를 준비한다.
        Scanner sc = new Scanner(new File("src/main/java/chapter10/temp/in.txt"));
        
        // 파일에 행 단위로 쓰기 위해 PrintWriter 인스턴스를 준비한다.
        PrintWriter pw = new PrintWriter("src/main/java/chapter10/temp/out.txt");
        
        // 읽어온 문자열은 str1에 저장하고, 순서를 바꾼 문자열은 str2에 저장한다.
        String str1, str2 = "";
        
        // in.txt의 행만큼 반복한다.
        while (sc.hasNextLine()) {
            str1 = sc.nextLine();
            int size = str1.length();
            
            // str1의 글자를 반대 순서로 str2에 저장한다.
            for (int i = size - 1; i >= 0; i--)
                str2 += str1.charAt(i);
            
            // 반대 순서로 저장한 str2를 파일에 쓰고 초기화 한다.
            pw.println(str2);
            str2 = "";
        }
        sc.close();
        pw.close();
        
    }
}
