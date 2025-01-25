import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 수열의 길이
        Stack<Integer> stack = new Stack<Integer>(); // 검증용 스택
        int num = 1; // 현재 스택 push 값 (오름차순)

        for(int i = 0; i < n; i++){ // n 만큼 반복
            //입력받은 수열의 N번째 값
            int inputNum = Integer.parseInt(br.readLine());

            if(inputNum == num){ // N번째 값이 현재 스택 push 값이면
                // num을 push, pop
                stack.push(num);
                sb.append("+\n");
                stack.pop();
                sb.append("-\n");
                //num에 +1 연산 (다음 스택 push 값)
                num++;
            }else if(inputNum > num){ // N번째 값이 현재 스택 push 값보다 크다면

                // num이 inputNum과 같아지기 전까지 push
                while(inputNum > num){
                    stack.push(num);
                    sb.append("+\n");
                    //num에 +1 연산 (다음 스택 push 값)
                    num++;
                } // inputNum과 num 값이 같아지면
                // num을 push, pop
                stack.push(num);
                sb.append("+\n");
                stack.pop();
                sb.append("-\n");
                //num에 +1 연산 (다음 스택 push 값)
                num++;
            }else{ //N번째 값이 현재 스택 push 값보다 작다면
                // top값이 inputNum과 다르다면 스택으로 구현 불가
                if(inputNum != stack.peek()){
                    sb.setLength(0);
                    sb.append("NO");
                    bw.write(sb.toString());
                    bw.flush();
                    bw.close();
                    br.close();
                    return; // 강제 종료
                }else{
                    stack.pop();
                    sb.append("-\n");
                }
            }
        }
        // 출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}