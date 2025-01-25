
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int[] arr = new int[n]; // 입력받은 수열
        int[] resultArr = new int[n]; // arr 수열의 오큰수 저장 배열
        // 수열 입력
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>(); // 수열의 index를 가지는 stack
        stack.push(0); // 인덱스 0으로 초기화

        // 수열의 길이만큼
        for(int i = 1; i < n; i++){
            // 스택이 비어있지 않고 스택의 top 값을 인덱스로 갖는 수열의 요소 값이 수열의 i번째 요소보다 작은 동안
            // (= i번째 요소가 오큰수이면)
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                // 해당 인덱스의 오큰수를 저장
                resultArr[stack.pop()] = arr[i];
            } // 다음 인덱스 push
            stack.push(i);
        }
        // 수열 끝까지 오큰수를 찾지 못한 경우
        if(!stack.isEmpty()){
            while(!stack.isEmpty()) {
                // 해당 인덱스의 결과는 -1로 저장됨.
                resultArr[stack.pop()] = -1;
            }
        }
        // 결과 문자열 조합
        for(int i = 0; i < n; i++){
            bw.write(String.valueOf(resultArr[i]));
            if(i != n - 1){
                bw.write(" ");
            }
        }
        // 출력
        bw.flush();
        bw.close();
        br.close();
    }
}
