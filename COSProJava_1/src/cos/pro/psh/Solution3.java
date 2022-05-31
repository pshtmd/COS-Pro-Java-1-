package cos.pro.psh;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

/*
 * arr: 자연수 배열
 * K : 선택 수 
 * 
 */

class Solution3 {
 public int solution3(int[] arr, int K) {// max-min
 	// 여기에 코드를 작성해주세요.
     int answer = 0;
     int max=10000;
     int min=1;
     for(int i=0;i<K-1;i++) {
    	 //최소
    	 if(arr[i]>arr[i+1]) {
    		min=arr[i+1];
    	 }
    	 //최대
    	 if(arr[i]<arr[i+1]) {
    		 max=arr[i+1];
    	 }
     }
     answer=max-min;
     
     
     return answer;//가장 큰 수와 가장 작은 수의 차이를 return
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 Solution3 sol = new Solution3();
 	int[] arr = {9, 11, 9, 6, 4, 19};
 	int K = 4;
 	int ret = sol.solution3(arr, K);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
 }
}