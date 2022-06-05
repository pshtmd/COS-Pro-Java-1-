package cos.pro.java4;

public class Main05_규칙에맞는숫자생성 {

}
class Main {
    public String reverse(String number) {
        String reverseNumber = "";
        for(int i = number.length()-1; i >= 0; i--)
            reverseNumber += number.substring(i, i+1);//###########
        return reverseNumber;
    }

    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer += Integer.toString(i+1);//#######
            answer = reverse(answer);
        }
        return answer;//n번째 생성할 숫자를 구하려
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.    
    public static void main(String[] args) {
        Main sol = new Main();
        int n = 5;
        String ret = sol.solution(n);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}