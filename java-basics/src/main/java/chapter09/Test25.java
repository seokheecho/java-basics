package chapter09;

// 메소드를 활용하여 1~45 중에서 6개를 자동으로 뽑는 "로또 숫자 자동 추첨"을 작성해보자.
public class Test25 {
    
    // 1~45 중에서 하나를 추출하는 메소드
    static short getNumber() {
        // Math.random() 메소드는 0.0부터 1.0 미만의 실수 중 하나를 임의로 반환한다.
        // 이 숫자에 45를 곱하면 0.0부터 45.0미만이므로 1을 더하여 1~45 중에서 하나가 나오도록 했다.
        return (short) (Math.random() * 45 + 1);
    }
    
    public static void main(String[] args) {
        // 추첨된 숫자를 담을 배열
        short[] lotto = {0, 0, 0, 0, 0, 0};
        // 반복 변수 i, k와 뽑힌 숫자를 담을 변수 num
        short i, k, num;
        // 이미 뽑힌 숫자인지 체크하기 위한 변수
        char dupl = 'N';
        
        
        System.out.println("** 로또 추첨을 시작 합니다. ** \n\n");
        
        // 6개의 다른 숫자가 뽑힐 때까지 무한 반복한다.
        // 다른 숫자가 뽑히면 lotto[i++] = num; i를 1증가 시킨다.
        for (i = 0; i <6;) {
            num = getNumber();
            
            // 뽑은 숫자가 기존에 뽑은 숫자와 동일한지 확인하고,
            // 동일하면 중복 확인 변수에 'Y'를 대입한다.
            for (k = 0; k < 6; k++) {
                if (lotto[k] == num) {
                    dupl = 'Y';
                }
            }
            
            // 뽑은 숫자가 처음 뽑은 것이라면 로또 배열에 넣고
            // i(뽑힌 개수)를 증가시킨다.
            // 아니면 중복 확인 변수에 'N'을 대입한다.
            if (dupl == 'N')
                lotto[i++] = num;
            else 
                dupl = 'N';
        }
        
        /*
         * num에 랜덤 값을 얻는다. ex) 8
                num = getNumber();
          
         * lotto 배열에 k 번째가 num 이면 dupl = 'Y'
         * (lotto 배열 0~5번째까지 num가 8이 있는지 확인하고 있으면 dupl을 'Y'라 한다.) 
                for (k = 0; k < 6; k++) {
                    if (lotto[k] == num) {
                        dupl = 'Y';
                    }
                }
         
         * dupl == 'N' 이면 lotto 배열 i를 증가 시키고 num 을 넣는다.
         * dupl == 'N' 이 아니면 dupl = 'N' 으로 하고 다시 반복문으로 간다.
         * (예를들어 num가 8이 중복이 되어 있으면 dupl = 'Y' 로 되어있으므로 
         * dupl = 'N' 으로 바꾸고 반복문으로 돌아가   num에 랜덤 값을 다시 얻는다. (num = getNumber();))
                if (dupl == 'N')
                    lotto[i++] = num;
                else 
                    dupl = 'N';
        */
        
        System.out.printf("추첨된 로또 번호 ==> ");
        // 뽑힌 6개의 로또 숫자를 출력한다.
        for (i = 0; i < 6; i++) {
            System.out.printf("%d ", lotto[i]);
        }
        
    }
}
