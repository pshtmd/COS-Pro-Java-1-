package cos.pro.java;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main_02 {
 public String func_a(String str, int len){
     String padZero = "";
     int padSize = len-str.length();
     for(int i = 0; i < padSize; i++)
         padZero += "0";
     return padZero + str;
 }
 //두 2진수 문자열 binaryA, binaryB의 해밍 거리
 public int solution(String binaryA, String binaryB) {
	//길이가 더 긴 2진수 문자열의 길이를 구합니다
     int maxLength = Math.max(binaryA.length(), binaryB.length());
	//첫 번째 2진수 문자열의 길이가 더 짧다면 
     if(maxLength > binaryA.length())
         binaryA = func_a(binaryA, maxLength);//문자열의 앞에 0을 채워넣어 길이를 맞춰줍니다
	//두 번째 2진수 문자열의 길이가 더 짧다면 
     if(maxLength > binaryB.length())
         binaryB = func_a(binaryB, maxLength);//문자열의 앞에 0을 채워넣어 길이를 맞춰줍니다.
     //길이가 같은 두 2진수 문자열의 해밍 거리를 구합니다.
     int hammingDistance = 0;
     for(int i = 0; i < maxLength; i++)
         if(!binaryA.substring(i, i+1).equals(binaryB.substring(i, i+1))){//문자가 서로 다르므로
        	 //System.out.println(binaryA.substring(i, i+1)+" ## "+binaryB.substring(i, i+1));
        	 //System.out.println(!binaryA.substring(i, i+1).equals(binaryB.substring(i, i+1)));
        	 //System.out.println(binaryA.substring(i, i+1).compareTo(binaryB.substring(i, i+1)));
        	 hammingDistance += 1;
         }
     return hammingDistance;
 }
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 Main_02 sol = new Main_02();
     String binaryA = "10010";
     String binaryB = "110";
     int ret = sol.solution(binaryA, binaryB);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}