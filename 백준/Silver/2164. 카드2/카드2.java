
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 카드의 갯수

        Queue<Integer> card = new ArrayDeque<>(); // 카드 큐
        for(int i = 1; i < n + 1; i++){
            card.add(i);
        }
        // 남은 카드가 1장이 되기 전까지 버리기
        while(card.size() != 1){
            card.poll();
            // 버린 이후에 1장이 아니면 1번째 카드를 큐 제일 뒤로 붙이기
            if(card.size() != 1){
                int attach = card.poll();
                card.add(attach);
            }
        }
        // 마지막 남은 1장의 카드 출력
        bw.write(String.valueOf(card.poll()));
        bw.flush();
        bw.close();
        br.close();
    }
}