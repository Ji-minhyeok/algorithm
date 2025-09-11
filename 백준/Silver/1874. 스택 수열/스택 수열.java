import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 정답 비교 배열 초기화
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int currentNum = 1;
        Stack<Integer> stack = new Stack<>();

        // 정답 배열 순회
        for(int i = 0; i < n; i++){
            int target = arr[i];
            // 타겟 도달까지 push
            while(target >= currentNum){
                stack.push(currentNum);
                sb.append("+\n");
                currentNum ++;
            }
            // 타겟과 같으면 pop
            if(stack.peek() == target){
                stack.pop();
                sb.append("-\n");
            }// 타겟과 다르다면 불가 조건
            else{
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }

        // 출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}