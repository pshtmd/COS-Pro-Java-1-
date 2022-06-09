package cos.pro.java4;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
public class Main09_분침과시침의각도구하기 {

}

//시침과 분침이 이루는 각도//를 소숫점 첫번째 자리까지 //표현한 문자열을 return
class Main {
	 public String solution(int hour, int minute) {
	     // 여기에 코드를 작성해주세요.
	   	String answer ="";
					// 시간,분 당 각도 = 360도/분할개수
					int perHour=360/12;
					int perMinute=360/60;
					answer= String.valueOf((double) Math.abs(hour * perHour - minute * perMinute));//기본 소수점 이하 첫째자리까지
	     return answer;
	 }
	
	 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	 public static void main(String[] args) {
	     Main sol = new Main();
	     int hour = 3;
	     int minute = 0;
	     String ret = sol.solution(hour, minute);
	
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
	 }
}