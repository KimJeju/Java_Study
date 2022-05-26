package teststatus;

import java.util.Stack;

public class stackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //스택 선언 Stack<타입> 참조변수명 = new 생성자<>();


        //스택 자료구조 정책 FILO(First in Last Out) or LIFO( Last in first Out )
        //선입후출
        stack.push(1); //스택에 데이터 넣기 .push 사용
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //------------------------------------------

        System.out.println(stack.pop()); //스택 출력 및 빼기
        System.out.println(stack.pop()); //3
        System.out.println(stack.pop()); //2
        System.out.println(stack.pop()); //1
    }
}
