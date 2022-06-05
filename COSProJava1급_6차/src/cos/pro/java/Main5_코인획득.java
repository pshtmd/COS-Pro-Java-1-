package cos.pro.java;
//##################   한줄 수정   #####################
public class Main5_코인획득 {

}
//, 말은 오른쪽 또는 아래쪽으로만 이동할 수 있습니다
class Main {// 한 줄만 변경
  public int solution(int[][] board) {
      int answer = 0;

      int[][] coins = new int[4][4];
      for(int i = 0; i < 4; i++) {//열:아래(++)만
          for(int j = 0; j < 4; j++) {//행:(오른쪽)++만
              if(i == 0 && j == 0)
                  coins[i][j] = board[i][j];
              else if(i == 0 && j != 0)//행
                  coins[i][j] = board[i][j] + coins[i][j-1];
              else if(i != 0 && j == 0)
                  coins[i][j] = board[i][j] + coins[i-1][j];
              else									//##############################[i+1][j+1]:대각선이동
                  coins[i][j] = board[i][j] + Math.max(coins[i][j-1], coins[i-1][j]);
          }											//############################## 아래[i+1] / 오른쪽[j+1] 으로만 이동가능 규칙!
      }

      answer = coins[3][3];
      return answer;//최대로 획득할 수 있는 코인의 양을 return 
  }
//구역에서 획득할 수 있는 코인 양을 담은 2차원 배열 board
  // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
  public static void main(String[] args) {
      Main sol = new Main();
      int[][] board = {{6, 7, 1, 2}, {3, 5, 3, 9}, {6, 4, 5, 2}, {7, 3, 2, 6}};
      int ret = sol.solution(board);

      // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
      System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
  }
}