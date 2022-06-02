package cos.pro.java;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
//두 배열 arrA, arrB를 오름차순으로 정렬된 하나의 배열로 합쳐서 return 해주세요.

class Main_07 {
    public int[] solution(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
			//비교
        while(arrA_idx<arrA_len && arrB_idx<arrB_len){
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
			//비교 후 그 외 나머지(arrA) 그대로 대입
        while(arrA_idx<arrA_len)
            answer[answer_idx++] = arrA[arrA_idx++];
        while(arrB_idx<arrB_len)
            answer[answer_idx++] = arrB[arrB_idx++];
        return answer;
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Main_07 sol = new Main_07();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.solution(arrA, arrB);
 
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}