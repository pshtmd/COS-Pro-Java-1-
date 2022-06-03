package cos.pro.psh;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

//정답에 구현돼있음
class Flower {
	int x, y, day;
	Flower(int x, int y, int day){
		this.x=x;
		this.y=y;
		this.day=day;		
	}
}

class Solution_psh {
	 public int solution_psh(int n, int[][] garden) {
	     // 여기에 코드를 작성해주세요.
	     int answer = 0;
	     
	     int[] dx= {-1,1,0,0};
	     int[] dy= {0,0,-1,1};
	     
	     Queue<Flower> q=new LinkedList<Flower>();//핀 꽃 저장공간
	     //핀 꽃 저장
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<n;j++) {
	    		 if(garden[i][j]==1)
	    			 q.offer(new Flower(i,j,0));
	    	 }
	     }
	     //해당 꽃 상하좌우 꽃 피우기
	     while(!q.isEmpty()) {
	    	 Flower flower=q.peek();//반환
	    	 q.poll();//제거
	    	 
	    	 for(int i=0;i<4;i++) {
	    		 int nextX=flower.x+dx[i];
	    		 int nextY=flower.y+dy[i];
	    		 int nextDay=flower.day+1;
	    		 
	    		 if((0<=nextX && nextX<n && 0<=nextY && nextY < n ) && garden[nextX][nextY]==0) {
	    			 garden[nextX][nextY]=1;
	    			 answer=nextDay;
	    			 q.offer(new Flower(nextX,nextY,nextDay));
	    		 }
	    	 }
	     }
	     
	     return answer;
	 }
 
	 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	 public static void main(String[] args) {
	     Solution_psh sol = new Solution_psh();
	     int n1 = 3;
	     int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
	     int ret1 = sol.solution_psh(n1, garden1);
	     
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution_psh 메소드의 반환 값은 " + ret1 + " 입니다.");
	     
	     int n2 = 2;
	     int[][] garden2 = {{1, 1}, {1, 1}};
	     int ret2 = sol.solution_psh(n2, garden2);
	     
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution_psh 메소드의 반환 값은 " + ret2 + " 입니다.");
	     
	 }    
}