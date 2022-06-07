package cos.pro.java3;

public class Main09_팝업스토어를열최적의날짜 {

}
//팝업스토어란 한정 기간 문을 여는 매장
// k일 동안 연속해서 열 예정
// n일 동안의 추정 매출액
// n일 간의 추정 매출액이 담긴 배열 revenue

class Main {
	  public int solution(int[] revenue, int k) {
	      int answer = 0;
	      int n = revenue.length;
	      int sum = 0;
	      for (int i = 0; i < k; i++) {
	          sum += revenue[i];
	      }
	      answer = sum;
	      for (int i = k; i < n; i++) {
	          sum = sum - revenue[i - k] + revenue[i];
	          if (answer < sum)
	              answer = sum;
	      }
	      return answer;//최대 매출액 합을 return
	  }
	  
	  // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
	  public static void main(String[] args) {
	      Main sol = new Main();
	      int[] revenue1 = {1, 1, 9, 3, 7, 6, 5, 10};
	      int k1 = 4;
	      int ret1 = sol.solution(revenue1, k1);
	
	      // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	      System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
	
	      int[] revenue2 = {1, 1, 5, 1, 1};
	      int k2 = 1;
	      int ret2 = sol.solution(revenue2, k2);
	
	      // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	      System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");        
	  }
}