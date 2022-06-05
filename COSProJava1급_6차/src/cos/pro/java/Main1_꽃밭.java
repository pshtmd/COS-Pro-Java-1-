package cos.pro.java;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

//정원 크기 n // 현재 정원의 상태 garden[][]
class Flower1{
	int y, x,day;
	Flower1(int y, int x, int day){
		this.y=y;
		this.x=x;
		this.day=day;
	}
}
class Main{
	
		public boolean inRange(int y,int x,int n){
			return 0<=y && y<n && 0<=x && x<n;
		}
		
	 public int solution(int n, int[][] garden) {
	     // 여기에 코드를 작성해주세요.
	     int answer = 0;
				int nextX,nextY,nextDay;
				int[] dir_y={1,-1,0,0};
				int[] dir_x={0,0,1,-1};
				int day=0;
				
				Queue <Flower1> q=new LinkedList<Flower1>();
				
				//핀 꽃 위치 확인
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
						if(garden[i][j]==1)
							q.offer(new Flower1(i,j,0));//큐에 저장
					}
				}
				while(!q.isEmpty()){
					Flower1 flower=q.peek();//꺼내서 반환;
					q.poll();
					for(int d=0;d<4;d++){
						nextX=flower.x+dir_x[d];
						nextY=flower.y+dir_y[d];
						nextDay=flower.day+1;
						if(inRange(nextY,nextX,n) && garden[nextY][nextX]==0){
							garden[nextY][nextX]=1;
							day=nextDay;
							q.offer(new Flower1(nextY,nextX,day));
						}
					}
				}
			
					answer=day;
	     return answer;
	 }
	 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	 public static void main(String[] args) {
	     Main sol = new Main();
	     int n1 = 3;
	     int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
	     int ret1 = sol.solution(n1, garden1);
	     
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
	     
	     int n2 = 2;
	     int[][] garden2 = {{1, 1}, {1, 1}};
	     int ret2 = sol.solution(n2, garden2);
	     
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	     
	 }    
}
