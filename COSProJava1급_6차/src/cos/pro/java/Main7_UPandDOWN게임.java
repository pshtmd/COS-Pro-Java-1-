package cos.pro.java;

public class Main7_UPandDOWN게임 {

}
class Main {// 자연수 범위 K, 게임 참가자가 말한 숫자가 순서대로 담긴 배열 numbers, 답한 내용이 순서대로 담긴 배열 up_down
    public int solution(int K, int[] numbers, String[] UpDown) {
        int left = 1;
        int right = K;
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];//참가가자 말한 숫자 : num
            if(UpDown[i].equals("UP"))
                left = Math.max(left,num+1);
            else if(UpDown[i].equals("DOWN"))
                right = Math.min(right,num-1);
            else if(UpDown[i].equals("RIGHT"))
                return 1;////정답을 맞춘 것이므로 1을 
        }
        return right-left+1;//, 현재 정답이 될 수 있는 숫자는 몇 개인지 return
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int K1 = 10;
        int[] numbers1 = {4, 9, 6};
        String[] UpDown1 = {new String("UP"), new String("DOWN"), new String("UP")};
        int ret1 = sol.solution(K1, numbers1, UpDown1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int K2 = 10;
        int[] numbers2 = {2, 1, 6};
        String[] UpDown2 = {new String("UP"), new String("UP"), new String("DOWN")};
        int ret2 = sol.solution(K2, numbers2, UpDown2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int K3 = 100;
        int[] numbers3 = {97, 98};
        String[] UpDown3 = {new String("UP"), new String("RIGHT")};
        int ret3 = sol.solution(K3, numbers3, UpDown3);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");
    }
}