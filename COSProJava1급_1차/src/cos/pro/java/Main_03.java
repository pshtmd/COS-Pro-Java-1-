package cos.pro.java;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main_03 {
	 class Pair{
	     public int firstNum;
	     public int secondNum;
	 }
	 //3 주어진 연산자에 맞게 연산을 수행합니다.
	 public int func_a(int numA, int numB, char exp){
	     if (exp == '+')
	         return numA + numB;
	     else if (exp == '-')
	         return numA - numB;
	     else
	         return numA * numB;
	 }
	 //1 주어진 식에서 연산자의 위치를 찾습니다.
	 public int func_b(String exp){//연산자 위치값 반환
	     for(int i = 0; i < exp.length(); i++){
	         char e = exp.charAt(i);
	         if(e == '+' || e == '-' || e == '*')
	             return i;
	     }
	     return -1;
	 }
		//2 연산자의 앞과 뒤에 있는 문자열을 각각 숫자로 변환
	 public Pair func_c(String exp, int idx){//idx : 연산자 => 구분자
	     Pair ret = new Pair();
	     ret.firstNum = Integer.parseInt(exp.substring(0, idx));
	     ret.secondNum = Integer.parseInt(exp.substring(idx + 1));
	     return ret;
	 }
	 //식을 계산한 결과를 return
	 public int solution(String expression) {//빈칸 아래 메서드들
	     int expIndex = func_b(expression);
					//System.out.println("expIndex: "+expIndex);
	     Pair numbers = func_c(expression,expIndex);
					// System.out.println("numbers.firstNum: "+numbers.firstNum
					// 									 +"numbers.secondNum: "+numbers.secondNum);
					// System.out.println(expression.charAt(expIndex));
	     int result = func_a(numbers.firstNum,numbers.secondNum,expression.charAt(expIndex));
	     return result;
	 }
	
	 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	 public static void main(String[] args) {
		 Main_03 sol = new Main_03();
	     String expression = "123+12";
	     int ret = sol.solution(expression);
	
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	 }
}