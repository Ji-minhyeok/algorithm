import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals(".")) {
                break;
            }
            if(isBalanced(input)) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
    }
    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>(); // 괄호를 담을 스택 선언
        for(int i = 0; i < input.length(); i++){ // 입력받은 문자열 확인
            char c = input.charAt(i); // i번째 문자열 추출

            if(c == '(' || c == '[') {// 열린 소괄호, 대괄호라면 스택 저장.
                stack.push(c);
            }else if(c == ')' || c == ']') { // 닫힌 소괄호, 대괄호라면
                if(stack.isEmpty()) { // 열린 소괄호, 대괄호가 없다면 false 리턴
                    return false;
                }
                char pop = stack.pop();
                if((pop == '(' && c != ')') || (pop == '[' && c != ']')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
