package cos.pro.psh;
/*
 * 한줄에 최대 k자
 * 영어 : 정해진 순서대로 // 구분자: 공백
 * 단어 넘치면 다음줄
 */

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution2 {//줄당 max: K , [적을단어,..]:words
	public int insert(int k,int length) {
		return k+length;
	}
	
	public int solution(int K, String[] words) {
	   // 여기에 코드를 작성해주세요.
		int answer = 0;
		int row=1;//줄 수 
		int k=0;//한 줄당 현재 글자 수
		
		for(int i=0;i<words.length;i++) { 
			int wordLength=words[i].length();
			
			if(k+wordLength>K) {
				k=0;//초기화
				row++;
				k=insert(k,wordLength);
			}else if(k+wordLength==K) {
				k=insert(k,wordLength);//4 
			}else {
				k=insert(k,wordLength);
				k+=1;//띄어쓰기
			}
			answer=row;
		}
		
		
	   
	   return answer;//단어를 모두 적으면 몇 줄이 되는지 return
	}
	
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int K = 10;
	   String[] words = {new String("nice"),//5
			   			new String("happy"), //
			   			new String("hello"), 
			   			new String("world"), 
			   			new String("hi")};
	   
	   int ret = sol.solution(K, words);
	
	   // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	   System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
	}
}