import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            if(n == 0) stack.pop();
            else stack.push(n);
        }
        for(int i = 0; i < stack.size(); i++){
            result += stack.get(i);
        }
        System.out.println(result);
    }
}
