package cos.pro.java;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
public class Main09_연산최소횟수 {

}


class Main {
	/****  연산  ****/
		//덧셈
		public int func_plus(int number1){
			return number1+1;
		}
		//뺄셈
		public int func_minus(int number1){
			return number1-1;
		}
		//곱셈
		public int func_gob(int number1){
			return number1*2;
		}
		/**************/
	 // number로 target으로 만들려면 연산을 최소 몇 번 해야 하는지 return
	public int solution(int number, int target) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		int cnt=0;
	
		while(!(number==target)){
			if((Math.abs(target-func_gob(number)))<=(target-func_plus(number))){//더하거나/곱하거나
				number=func_gob(number);
				cnt++;
			}else if(number<target){
				number=func_plus(number);
				cnt++;
			}else{//빼기만
				number=func_minus(number);
				cnt++;
			}
		}
		answer=cnt;
		return answer;//연산을 최소 몇 번
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Main sol = new Main();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}