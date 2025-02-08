import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        String result = "";
        // 스택 선언 및 배열 값 저장
        Stack<Integer> stack = new Stack<>();

        // 스택 중복 검사
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        // 정답 int배열 생성
        int[] answer = new int[stack.size()];
        for(int i = stack.size()-1 ; i >= 0 ; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}