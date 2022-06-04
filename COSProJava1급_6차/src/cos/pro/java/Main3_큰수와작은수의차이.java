package cos.pro.java;
import java.util.*;

public class Main3_큰수와작은수의차이 {

}
//다음과 같이 import를 사용할 수 있습니다.
class Main {
 public int solution(int[] arr, int K) {
 	// 여기에 코드를 작성해주세요.
   int answer = 0;
			Arrays.sort(arr);//오름차순 정렬 4 6 9 9 11 19 
			int imsi=arr[arr.length-1]-arr[0];//초기값: 최대차이// 15
			for(int i=0;i<arr.length-K;i++){
				if(arr[K-1+i]-arr[0]<imsi)
					imsi=arr[K-1+i]-arr[0];
			}
			answer=imsi;

     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
 	Main sol = new Main();
 	int[] arr = {9, 11, 9, 6, 4, 19};
 	int K = 4;
 	int ret = sol.solution(arr, K);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}