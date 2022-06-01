package cos.pro.java;
//##################  solution 메서드 구현 문제  #########################
/*
다음과 같이 import를 사용할 수 있습니다.
0이란 숫자가 사라졌습니다.
0을 포함하지 않은 자연수 num에 1을 더한 수를 return
*/

import java.util.*;

class Main_04 {
    public long solution(long num) {
      	long answer = 0;
		//###########################################
		long hapLong=num+1;
		String hapStr=Long.toString(hapLong);
		//모든 0 => 1로 대체
		String hap=hapStr.replaceAll("0","1");
			
		answer=Long.parseLong(hap);
		//###########################################
        return answer;//num에 1을 더한 수
    }
 
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Main_04 sol = new Main_04();
        long num = 9949999;
        long ret = sol.solution(num);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}