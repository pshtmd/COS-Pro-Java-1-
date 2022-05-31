package cos.pro.psh;
/*

1부터 n까지 숫자가 적힌 카드 뭉치
카드 뭉치 가장 아래에는 1 
위로 갈수록 숫자가 커집니다. 
 * 
 * 
 1. 카드 뭉치를 정확히 반으로 나눕니다.
 2. 두 개로 나뉜 카드 뭉치를 교차로 섞어서 카드 뭉치 하나를 만듭니다. 
    이때, 항상 1이 적힌 카드가 있는 뭉치를 아래로 놓고 섞습니다.
 * 
 */
class Solution4 {
    public int solution(int n, int mix, int k) {
        int answer = 0;
        //카드뭉치
        int[] card=new int[n];
        for(int i=0;i<n;i++) {
        	card[i]=i+1;
        }
        //mix만큼 섞기
        while((mix--)!=0) {
        	int[] cardA=new int[n/2];
        	int[] cardB=new int[n/2];
        	
        	//반으로 나누기
        	for(int i=0;i<n;i++) {
        		if(i<n/2)
        			cardA[i]=card[i];
        		else 
        			cardB[i]=card[i];
        	}
        	
        	//교차로 석어서 한뭉치로
        	for(int i=0;i<n;i++) {
        		if(i % 2 == 0)
        			card[i]=cardA[i/2];
        		else
        			card[i]=cardB[i/2];
        	}
        }
        answer=card[k-1];
        //아래에서 k번째에 있는 카드에 적힌 숫자를 return
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution4 sol = new Solution4();
    	int n = 6;//10 이상 50 이하인 짝수
    	int mix = 3;//0회 이상 10회 이하
    	int k = 3;//1 이상 n 이하인 자연수
    	int ret = sol.solution(n, mix, k);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
}