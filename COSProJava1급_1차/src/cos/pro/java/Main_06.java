package cos.pro.java;

//다음과 같이 import를 사용할 수 있습니다.
//체스에서 나이트(knight)는 아래 그림과 같이 동그라미로 표시된 8개의 방향중 한 곳으로 이동 가능
//단, 나이트는 체스판 밖으로는 이동할 수 없습니다.
import java.util.*;

class Main_06 {
    public int solution(String pos) {
			int[][] pan=new int[8][8];
			String[] x={"A","B","C","D","E","F","G","H"};
			int[] y={8,7,6,5,4,3,2,1};
			int i =0,j=0;
			String a=pos.substring(0, 1);//"A"
			int b=Integer.parseInt(pos.substring(1));//7
			for(int k=0;k<8;k++){
				if(x[k]==a) i=k;//x위치 =>0
				if(y[k]==b) j=k;//y위치 =>1 ==>pan[i][j]
			}
			int cnt=0;
			if((j-2)>=0){
				if(i-1>=0) cnt++;
				if(i+1<8) cnt++;
			}
			if((j+2)<8){
				if(i-1>=0) cnt++;
				if(i+1<8) cnt++;
			}
			if((i-2)>=0){
				if(j-1>=0) cnt++;
				if(j+1<8) cnt++;
			}
			if((i+2)<8){
				if(j-1>=0) cnt++;
				if(j+1<8) cnt++;
			}
			
        int answer = 0;
			answer=cnt;
        return answer;//나이트를 한 번 움직여서 이동할 수 있는 칸은 몇개인지
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Main_06 sol = new Main_06();
        String pos = "A7";
        int ret = sol.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}