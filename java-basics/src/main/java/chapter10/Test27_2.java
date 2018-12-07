package chapter10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test27_2 {
    
    public static void main(String[] args) {
        
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        
        // data.txt라는 파일명을 지정한다.
        String filename = "src/main/java/chapter10/temp/data.txt";
        
        try {
//          파일로 출력하는 객체를 만든다.
//          PrintWriter 클래스 객체는 작업이 완료되면 반드시 닫아줘야 한다.
            pw = new PrintWriter(filename);             // 출력 파일 open
            
//          "quit"가 입력되면 기록을 중지한다.
            while(true) {
                System.out.print("> ");     // 입력을 받는 것을 표시하기위함
                String str = sc.nextLine().trim();
                // **trim() : 문자열의 앞과 끝에 있는 공백을 잘라내는 메소드
                // **toLowerCase() : 대상 문자열을 모두 소문자로 변환
                // **toUpperCase() : 대상 문자열을 모두 대문자로 변환
                if(str.toLowerCase().equals("quit")) {      // 문자열 비교는 equals()
                    break;
                }
//              입력받은 내용을 파일에 저장한다,  "quit"은 저장하지 않는다.
//              write() 괄호 안에는 문자열만 올 수 있다.
                pw.write(str + "\r\n");     // 엔터를 치면 파일에도 줄바꿈이 되도록한다.

            }
        } catch (FileNotFoundException e) {
//          파일이 없으면 스스로 파일을 만들기 때문에 아래의 출력을 실제로 볼 수는 없다.
            System.out.println("파일이 없습니다.");            
        } finally {
//          PrintWriter 클래스 객체가 생성되었으면 닫아준다.
            // null이면 close할 필요없다.
            if(pw != null) {
                // 가장 정석적인 표현 
                try {
                    pw.close();
                // PrintWriter에서는 문제가 생기지 않지만 DB에서 사용시 예외가 생길 수 있으므로 예외를 넣어준다.
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }       
        
    }

}

/*
    1. 키보드로 입력한 내용을 파일에 저장하기
    - 키보드로 내용을 입력받을 Scanner 필요
    - 파일의 경로를 지정 (절대 경로 / 상대 경로)
    - 파일로 출력하는 객체를 만듦
    - "quit"이 입력되면 기록을 중지
    - 입력받은 내용을 파일에 저장 / "quit"은 저장하지 않는다.
    - 저장이 완료되면 PrintWriter 클래스 객체를 닫음
    tip) 
    - \r : carriage return, 커서를 줄의 맨 앞으로 보낸다.
    - \n : new line, 줄을 바꾼다.
    - PrintWriter 객체에 write() 메소드로 내용을 넣을 때 '\n'을 쓰면 파일 안에는 띄어쓰기만 되지만 실제로 출력하면 줄바꿈이 된다.
      -> 메모장에서 파일을 열고 돋움체로 바꾸면 검정 배경 동그라미가 들어있는데 읽을 때 그 부분이 줄바꿈이 된다.
    - '\r\n'을 쓰면 파일 안에도 줄바꿈이 보인다. * 순서 바뀌면 안 됨
    
    2. PrintWriter 클래스
    - PrintWrite("파일경로") 생성자는 주어진 파일 경로에 파일을 연다.
    - 이때 파일이 없다면 스스로 파일을 만들어낸다. -> 오류 발생하지 않음
    
    3. 경로 지정 방법
    3-1) 절대 경로
     :파일이 위치한 디스크 드라이브의 root 데렉토리부터 파일이 위치한 디렉토리까지의 경로
    - ex) C:\\kookgiWHJ\\JAVA\\0523\\src\\kr\\koreait\\fileio
     * '\' 자체를 출력하려면 앞에 '\'을 붙여줘야 한다. -> '\\'로 써야 '\'가 출력됨
     * '\\' 대신 '/'로 쓸 수 있다.
    
    3-2) 상대 경로
     : 현재 프로젝트 이름의 디렉토리부터 파일이 위치한 디렉토리까지의 경로
    - ex)  ./src/kr/koreai/fileio 
     * root 디렉토리에서 현재 프로젝트 이름의 디렉토리까지를 "."로 한다.
[출처] 키보드로 입력한 내용을 파일에 저장하기 / PrintWriter 클래스 / 경로 지정 방법|작성자 whj6973m

*/
