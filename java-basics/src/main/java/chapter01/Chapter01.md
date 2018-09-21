## Chapter01 요약

01. 프로그래밍의 개요
- 계산기, 메모장, 엑셀 등의 프로그램은 프로그래밍 언어를 사용하여 만들며,
  가장 대표적인 JAVA언어를 주로 사용한다.

02. JAVA 언어의 개요
- JAVA 언어는 1991년에 선마이크로시스템스 사에서 제임스 고슬링이 주도하여
  냉장고, TV 등의 가전제품에서 사용될 운영체제를 개발 하는 것을 목표로 시작되었다.
  
03. JAVA의 프로그래밍 방식
- JAVA는 하나의 JAVA 코드만 만들면 모든 운영체제에서 동일하게 실행할 수 있다.

- 하나의 JAVA 소스코드 -(컴파일)-> 바이트코드 -(실행)-> Windows
                                         -(실행)-> Unix/Linux
                                         -(실행)-> Mac OS X

04. JAVA 언어의 특징 
- 1) 간결한 프로그래밍 문법을 제공한다.
- 2) 이식성이 매우 좋다.
- 3) 완전한 객체지향 언어이다.
- 4) 멀티스레드 프로그래밍을 지원한다.
- 5) 다양한 응용 프로그램을 작성할 수 있다.
- 6) 많은 오픈 소스 라이브러리가 있다.

05. JAVA 개발환경
- JDK에는 JRE가 포함되어 있다.

06. Windows 환경변수
- JAVA와 관련된 Windows 환경 변수는 JAVA_HOME과 Path이다.

07. JAVA 프로그램의 코딩, 컴파일, 실행순서
- JAVA 프로그램의 코딩, 컴파일, 실행 순서는 다음과 같다.

  1) JAVA 프로그래밍 코딩 - *.java (메모장, IDE(Integrated Development Environment - 통합개발환경)에서 코딩)
  2) 컴파일 - *.class (javac.exe를 이용해서 컴파일)
  3) 실행 - java.exe를 이용해서 실행

08. 화면에 "Hello! JAVA~~" 를 출력해보자.
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello! JAVA~~");
    }
}








