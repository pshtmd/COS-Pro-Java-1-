package cos.pro.java;

import java.util.LinkedList;
import java.util.Queue;

class Flower {
	int x, y, day;
	Flower(int x, int y, int day) {
		this.x = x;
		this.y = y;
		this.day = day;
	}
}
/*      1
 *   -1 0 1
       -1
 */
class Solution {
    public int solution(int n, int[][] garden) {//3, {000}{010}{000}
        int answer = 0;

		int[] dx = { -1, 1, 0, 0 };//x축
		int[] dy = { 0, 0, -1, 1 };//y축

		Queue <Flower> q = new LinkedList <Flower>();

		for(int i = 0; i < n; i++) {//x
			for(int j = 0; j < n; j++) {//y
				if(garden[i][j] == 1)
					q.offer(new Flower(i, j, 0));//그 위치에 꽃이 피는데 0일 걸림//offer:객체를 저장 // 성공t/실패f
					//핀꽃 위치만 queue에 저장=> 1,1,0
			}
		}
		
		while(!q.isEmpty()) {//큐가 비어있지 않으면 
			Flower flower = q.peek();//큐에 저장되어있는 객체 꺼내지않고 flower에 반환만
			q.poll();//저장되어 있는 객체를 꺼내서 반환 /비어있으면 null

			for(int i = 0; i < 4; i++) {//0~3
				int nextX = flower.x + dx[i];//1 /0  2  1  1  //0 /-1 1 0 0 //1// //2/ 1 3 2 2 
				int nextY = flower.y + dy[i];//1 /1  1  0  2  //1 /1  1 0 2 //1// //1/ 1 1 0 2
				int nextDay = flower.day + 1;//0 /1  1  1  1  //1 /   2 2 2 //2// //1/ 2   2 2

				if((0 <= nextX && nextX < n && 0 <= nextY && nextY < n) && garden[nextX][nextY] == 0) {
					garden[nextX][nextY] = 1;
					answer = nextDay;
					q.offer(new Flower(nextX, nextY, nextDay));//객체 저장 / 실패f/성공t
				}
			}
		}

		return answer;
    }
    
    public static void main(String[] args) {
	     Solution sol = new Solution();
	     int n1 = 3;
	     int[][] garden1 = {{0, 0, 0}, 
	    		 			{0, 1, 0}, 
	    		 			{0, 0, 0}};
	     int ret1 = sol.solution(n1, garden1);
	     
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
	     
	     int n2 = 2;
	     int[][] garden2 = {{1, 1}, 
	    		 			{1, 1}};
	     int ret2 = sol.solution(n2, garden2);
	     
	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	     
	 }
}