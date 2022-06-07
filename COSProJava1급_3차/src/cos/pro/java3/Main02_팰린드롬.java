package cos.pro.java3;
import java.util.*;


//앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)
//사전 순으로 나열했을 때 k번째에 위치하는 팰린드롬
class Main {
	  public boolean func_a(ArrayList<String> list, String s) {
			for (int i = 0; i < list.size(); i++)
				if (s.equals(list.get(i)))
					return true;
			return false;
		}
	
	  public boolean func_b(String s) {
			int length = s.length();
			for (int i = 0; i < length / 2; i++)
				if (s.charAt(i) != s.charAt(length - i - 1))
					return false;
			return true;
		}
	  
	  public String func_c(ArrayList<String> palindromes, int k) {
	      Collections.sort(palindromes);//palindromes를 정렬
	      if (palindromes.size() < k)//배열 길이가 k보다 작다면 "NULL"을 리턴
	      	return "\"NULL\"";
	      else
	      	return palindromes.get(k-1);
	  }
	
	  public String solution(String s, int k) {
	      ArrayList<String> palindromes = new ArrayList<String>();//1. 팰린드롬 문자열을 저장할 배열 palindromes를 선언합니다.
	      int length = s.length();
	      for (int startIdx = 0; startIdx < length; startIdx++) {//주어진 문자열의 모든 부분 문자열을 찾아
	          for (int cnt = 1; cnt < length - startIdx + 1; cnt++) {
	              String subStr = s.substring(startIdx, startIdx + cnt);
	              if (func_b(subStr)) {//부분 문자열이 팰린드롬 문자열인지 확인
	              	if (func_a(palindromes,subStr) == false)//palindromes에 같은 문자열이 이미 들어있는지 확인 
	              		palindromes.add(subStr);//. palindromes에 같은 문자열이 없으면, 현재 팰린드롬 문자열을 추가
	              }
	          }
	      }
	
	      String answer = func_c(palindromes,k);
	      return answer;
	  }
	  // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	  public static void main(String[] args) {
	  	Main sol = new Main();
	      String s1 = new String("abcba");
	      int k1 = 4;
	      String ret1 = sol.solution(s1, k1);
	      
	      // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
	      System.out.println("solution 메소드의 반환 값은 \"" + ret1 + "\" 입니다.");
	      
	      String s2 = new String("ccddcc");
	      int k2 = 7;
	      String ret2 = sol.solution(s2, k2);
	      
	      // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
	      System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	  }
}
