package cos.pro.java;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
public class Main06_P진법ToQ진법 {

}

//p진법: 자리를 0부터 p-1의 숫자로만 나타낸 수
class Main {	
	//p진법으로 표현된 두 수를 더한 결과를// q 진법으로 나타낸 값을 return
		public int pTo8(String s, int p){
			int result=0;
			int asc=0;//지수
			
			for(int i=s.length()-1;0<=i;i--){
				result +=Integer.parseInt(s.substring(i,i+1))*Math.pow(p,asc);
				asc++;
			}
			return result;
		}
 public String solution(String s1, String s2, int p, int q) {
     // 여기에 코드를 작성해주세요.
     String answer = "";
			int asc=0;//지수
			int a=0;
			int b=0;
			/****  p진법 to 10진법  ****/
			//s1
			a=pTo8(s1,p);
			// for(int i=s1.length()-1;0<=i;i--){
			// 	a+=Integer.parseInt(s1.substring(i, i+1))*Math.pow(p,asc);
			// 	asc++;
			// }
			// asc = 0;
			//s2
			b=pTo8(s2,p);
			// for(int i=s2.length()-1;0<=i;i--){
			// 	b+=Integer.parseInt(s2.substring(i, i+1))*Math.pow(p,asc);
			// 	asc++;
			// }
			/**** s1+s2 ****/
			int hab=a+b;
			/***  8 to q ***/
			while(hab>0){
				answer=(hab%q)+answer;
				hab/=q;
			}
     return answer;
 }
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.	
 public static void main(String[] args) {
 	Main sol = new Main();
 	String s1 = new String("112001");
     String s2 = new String("12010");
     int p = 3;
     int q = 8;
 	String ret = sol.solution(s1, s2, p, q);
 	
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
}
}
