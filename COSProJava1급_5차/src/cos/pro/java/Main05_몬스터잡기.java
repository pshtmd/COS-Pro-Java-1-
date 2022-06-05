package cos.pro.java;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
public class Main05_몬스터잡기 {
}
//같거나 작은 몬스터에게 이깁니다. 
class Main {
	//내가 가진 캐릭터가 최대 몬스터 몇 마리
 public int solution(int[] enemies, int[] armies) {//몬스터 enemies //나 armies
     // 여기에 코드를 작성해주세요.
			int answer = 0;
			int cnt=0;
			
			for(int i=0;i<enemies.length;i++){
				for(int j=0;j<armies.length;j++){
					if(enemies[i]<=armies[j]){
						j=armies.length;
						cnt++;
					}
				}
			}
     
			answer=cnt;
 	return answer;//내가 가진 캐릭터가 최대 몬스터 몇 마리를 이길 수 있는지
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
 	Main sol = new Main();
 	int[] enemies1 = {1, 4, 3};
 	int[] armies1 = {1, 3};
 	int ret1 = sol.solution(enemies1, armies1);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

 	int[] enemies2 = {1, 1, 1};
 	int[] armies2 = {1, 2, 3, 4};
 	int ret2 = sol.solution(enemies2, armies2);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }
}