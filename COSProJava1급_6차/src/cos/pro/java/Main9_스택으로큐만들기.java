package cos.pro.java;

import java.util.*;
import java.util.ArrayList;
//스택2가 비었다면 
//스택1에 아무것도 남지 않을때까지 스택1을 pop한 값
//스택2에 push
//
//스택2를 pop한 값을 리턴
//
//배열 index가 0인 부분을 스택의 bottom으로 생각
class Main {
    Integer func_a(ArrayList<Integer> stack) {//pop
        Integer item = stack.remove(stack.size() - 1);
        return item;
    }
    
    void func_b(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {
        while(!func_c(stack1)) {//0이 아니면
            Integer item = func_a(stack1);
            stack2.add(item);
        }
    }
    
    boolean func_c(ArrayList<Integer> stack) {//다 꺼냈으면
        return (stack.size() == 0);
    }
    
    public int solution(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {
        if(func_c(stack2)) {
            func_b(stack1,stack2);
        }
        Integer answer = (int)func_a(stack2);
        return answer;//큐를 pop(또는 dequeue)한 값을 return 
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.    
    public static void main(String[] args) {
        Main sol = new Main();
        
        ArrayList<Integer> stack1_1 = new ArrayList<Integer>();
        ArrayList<Integer> stack2_1 = new ArrayList<Integer>();
        stack1_1.add(1);
        stack1_1.add(2);
        stack2_1.add(3);
        stack2_1.add(4);
        int ret1 = sol.solution(stack1_1, stack2_1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    
        ArrayList<Integer> stack1_2 = new ArrayList<Integer>();
        ArrayList<Integer> stack2_2 = new ArrayList<Integer>();
        stack1_2.add(1);
        stack1_2.add(2);
        stack1_2.add(3);
        int ret2 = sol.solution(stack1_2, stack2_2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
    
