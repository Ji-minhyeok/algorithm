import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 큐 초기화
        Queue<Integer> que = new ArrayDeque<>();
        for(int i = 1; i < n+1; i++){
            que.offer(i);
        }

        while(que.size() > 1){
            que.poll(); // 윗장 버림
            que.offer(que.poll()); // 다음 윗장 뽑아 맨 뒤에 넣기
        }

        // 출력
        bw.write(String.valueOf(que.peek()));
        bw.flush();
        bw.close();
        br.close();
    }
}