package cos.pro.java;
// 다음과 같이 import를 사용할 수 있습니다.
//n x n 크기의 격자
//1부터 n x n까지의 수
//n-소용돌이 수
// 1행 1열부터 n 행 n 열까지 대각선상에 존재하는 수들의 합
import java.util.*;

class MainCheck_05 {
		public boolean inRange(int i,int j, int n){
			return 0<=i && i<n && 0<=j && j<n;
		}
    public int solution(int n) {
			
			int[][] pan=new int[n][n];
			int i=0 , j=0;
			//방향조정
			int k=0;
			//for [i][i] => 0:-> //1:V  //2:<- //3:ㅅ  // 소용돌이
			// int[] dx={0,1,0,-1};
			// int[] dy={1,0,-1,0};
			//대입할 자연수
			int num=1;//1~n*n 자연수
			
		
				while(true){
						pan[i][j]=num;
						//방향조정 0우/1하/2좌/3상/0우...
						if(k==0 && (j==n-1||(j<n-1&& pan[i][j+1]!=0))) k++;
						else if(k==1 && (i==n-1||(i<n-1&&pan[i+1][j]!=0))) k++;
						else if(k==2 && (j==0 ||(j>0 && pan[i][j-1]!=0)))k++;
						else if(k==3 &&(i==0 ||(i>0 && pan[i-1][j]!=0)))k=0;
						//직진
						if(k==0)j++;
						else if(k==1)i++;
						else if(k==2)j--;
						else if(k==3)i--;
						
						if(num==n*n)break;
						num++;
					}
			
			 int answer = 0;
			for(int m=0;m<n;m++) answer+=pan[m][m];
			
			return answer;//대각선상에 존재하는 수들의 합
    }
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	MainCheck_05 sol = new MainCheck_05();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}