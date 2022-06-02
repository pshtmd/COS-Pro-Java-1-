package cos.pro.java;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
//#한줄 수정
//계단 제일 아래 칸은 0번째 칸
//recordA와 recordB의 원소는 0, 1, 2중 하나이고// 순서대로 가위, 바위, 보를 의미
class Main_09{
	 public int func(int record){
	     if(record == 0) return 1;
	     else if(record == 1) return 2;
	     return 0;
	 }
	 public int solution(int[] recordA, int[] recordB){//게임을 마친 후의 A의 위치를 return
		//#한줄 수정
	     int cnt = 0;
	     for(int i = 0; i < recordA.length; i++){
	         if(recordA[i] == recordB[i])
	             continue;// 비기면 제자리에 있습니다.
	         else if( recordA[i]==func(recordB[i]))
	             cnt = cnt + 3;//이기면 계단 세 칸을 올라가고
	         else
	             cnt =(cnt==0?0:cnt-1);//지면 한 칸을 내려가고//계단 제일 아래에서 지면 제자리에 있습니다.
	     }
	     return cnt;//A의 위치
	 }
	 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	 public static void main(String[] args) {
		 Main_09 sol = new Main_09();
	     int[] recordA = {2,0,0,0,0,0,1,1,0,0};
	     int[] recordB = {0,0,0,0,2,2,0,2,2,2};
	     int ret = sol.solution(recordA, recordB);
	
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	
	 }
}