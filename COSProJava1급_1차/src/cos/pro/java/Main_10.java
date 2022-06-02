package cos.pro.java;
//###############   한줄 바꾸기   ##################
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
//한 번만 사고팔았을 때 얻을 수 있는 최대 수익을 return
//최대 수익은 양수가 아닐 수도
//n일 동안 주식을 단 한 번 살 수 있습니다.
//n일 동안 주식을 단 한 번 팔 수 있습니다.
//주식을 산 날에 바로 팔 수는 없으며, 최소 하루가 지나야 팔 수 있습니다.
//적어도 한 번은 주식을 사야하며, 한 번은 팔아야 합니다.

class Main_10{
    int solution(int[] prices){//연속된 n 일 동안의 주식 가격이 순서대로 들어있는 배열 prices
			  
        int inf = 1000000001;
        int tmp = inf;
        int answer = -inf;
        for(int price : prices){
            if(tmp != inf)
            	//#####################################
                answer = Math.max(answer, price-tmp);//한줄 수정 tmp - price =>
            	//#####################################
            tmp = Math.min(tmp, price);
        }
        return answer;//최대수익
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Main_10 sol = new Main_10();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}