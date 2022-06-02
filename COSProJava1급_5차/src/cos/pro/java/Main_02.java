package cos.pro.java;


//벽 2개를 제외한 나머지 벽을 제거하여 물을 최대한 담으려 합니다
//벽 사이의 거리 x 두 벽 중 낮은 벽의 높이리터 만큼 담을 수 있으며
//두 벽의 거리는 두 벽의 위치 차이
class Main_02 {
	 public int solution(int[][] walls) {//모든 벽의 위치와 높이를 담은 2차원 배열 walls
	     int answer = 0;
	
	     for(int i = 0; i < walls.length; i++) {
	     	for(int j = i+1; j < walls.length; j++) {
	     		int area = 0;
	     		if(walls[i][1] < walls[j][1])//4 / 6
	     			area = walls[i][1] * (walls[j][0] - walls[i][0]);//4 * (2-1)
	     		else
	     			area = walls[j][1] * (walls[j][0] - walls[i][0]);
	
	     		if(answer < area)
	     			answer = area;
	     	}
	     }
	
	     return answer;//물을 최대 몇 리터나 담을 수 있는지 return
	 }
	 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
	 public static void main(String[] args) {
		 Main_02 sol = new Main_02();
	 	int[][] walls = {{1, 4}, {2, 6}, {3, 5}, {5, 3}, {6, 2}};
	 	int ret = sol.solution(walls);
	
	 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	 	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	 }
}

