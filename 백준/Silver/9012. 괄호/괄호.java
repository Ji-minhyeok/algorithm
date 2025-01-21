import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String input = scanner.next();
            if(isBalanced(input)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i); // input 문자열에서 i번째 문자 추출
                if(c == '(') stack.push(c); // 열린 괄호라면 스택에 추가
                else{ // 닫힌 괄호일 때
                    if(stack.isEmpty()) // 스택이 비어있다면 false
                        return false;
                    else{ // 스택이 비어있지않다면
                        stack.pop(); // 스택의 값 하나 삭제
                    }
                }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
