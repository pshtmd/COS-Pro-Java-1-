package cos.pro.java;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

public class Main2_단어순서대로 {
//##############   구현문제   ###################

}

class Main {
 public int solution(int K, String[] words) {
     // 여기에 코드를 작성해주세요.
			 int answer = 0;
			int word_len=0;
			int row=1;
			for(int i=0;i<words.length;i++){
				if( K > word_len + words[i].length() )//10자 이하인 경우
					word_len=words[i].length()+1;
				else{
					row++;
					word_len=0;
				}
			}
			answer=row;
			
   return answer;
 }    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Main sol = new Main();
     int K = 10;
     String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
     int ret = sol.solution(K, words);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}