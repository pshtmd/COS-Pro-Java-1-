package cos.pro.java4;

public class Main08_n번째작은수구하기2 {

}
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
	//무작위
	public Integer[] shuffle(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) list.add(arr[i]);
		Collections.shuffle(list);
		
		return list.toArray(new Integer[list.size()]);
	}
	//size구하는 용도
	public int factorial(int n) {
		if(n > 1) return n * factorial(n-1); 
		else return 1;
	}
	
	public int solution(int[] card, int n){
     // 여기에 코드를 작성해주세요.
		int answer = 0;
		Arrays.sort(card);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//for문을 돌면서 map에 key: 카드숫자 //개수:Value로 넣어줍니다.
		for (int i = 0; i < card.length; i++) {
			if(!map.containsKey(card[i])) map.put(card[i], 1);
			else map.replace(card[i], map.get(card[i]) + 1);
		}
		
		int cnt = factorial(card.length);
		//
		switch (map.size()) {//map.size:카드종류
			case 1://카드 종류 1가지
				cnt /= cnt;
				break;
			case 2://2가지
				if(map.containsValue(3)) cnt /= 6; // 3개(value:개수)가 동일한 경우
				else if(map.containsValue(2)) cnt /= 4;// 2개(value:개수)가 동일한 경우
				break;
			case 3 ://3가지
				cnt /= 2;//1종류만 2개
				break;
			default:
				break;
		}
		
		Map<String, Integer> caseMap = new HashMap<String, Integer>();
		int k = 0;
		while(k < cnt) {
			String str = "";
			Integer[] temp = shuffle(card);
			
			for (int i = 0; i < temp.length; i++) str += String.valueOf(temp[i]);
			
			if(!caseMap.containsKey(str)) {
				caseMap.put(str, 1);
				k++;
			}
		}
		
		int[] arr = new int[caseMap.size()];
		int i = 0;
		Iterator<String> ir = caseMap.keySet().iterator();
		while(ir.hasNext()) arr[i++] = Integer.parseInt(ir.next());
		
		Arrays.sort(arr);
		
		for (i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				answer = i+1; 
				break;
			}
			if(i == arr.length -1 && answer == 0) 
				answer = -1;
		}
		
		return answer;
 }
 
		// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	 public static void main(String[] args) {
	     Main sol = new Main();
	     int card1[] = {1, 2, 1, 3};
	     int n1 = 1312;
	     int ret1 = sol.solution(card1, n1);
	
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
	
	     int card2[] = {1, 1, 1, 2};
	     int n2 = 1122;
	     int ret2 = sol.solution(card2, n2);
	     
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	 }    
}