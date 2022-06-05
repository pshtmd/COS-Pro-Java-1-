package cos.pro.java;
//############   빈칸 채우기   #############
public class Main1_계단오르기 {

}
class Main {
	//계단 n칸을 올라가는 방법의 수
public int solution(int n) {//계단 수 n
    int answer = 0;

    int[] steps = new int[n+1];
    steps[1] = 1;
    steps[2] = 2;
    steps[3] = 4;
    for(int i = 4; i <= n; i++)
    			   //##############################
    	steps[i] = steps[i-1]+steps[i-2]+steps[i-3];
    			   //##############################
    answer = steps[n];

    return answer;//계단을 오르는 경우의 수
}

// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
public static void main(String[] args) {
	Main sol = new Main();
	int n1 = 3;
	int ret1 = sol.solution(n1);

	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

	int n2 = 4;
	int ret2 = sol.solution(n2);

	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
}
}