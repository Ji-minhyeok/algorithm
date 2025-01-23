import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄의 명령을 입력받음
        int n = parseInt(st.nextToken()); // 첫번째 int 추출
        int k = parseInt(st.nextToken()); // 두번째 int 추출

        bw.write(JosephusCalculation(n, k));
        bw.flush(); // 결과 출력
        bw.close();
        br.close();
    }

    public static String JosephusCalculation(int n, int k) {
        ArrayDeque<Integer> que = new ArrayDeque<>(); // 큐 생성
        StringBuilder result = new StringBuilder("<");

        for (int i = 1; i < n + 1; i++) { // 큐에 1~n 명 삽입
            que.add(i);
        }

        while (!que.isEmpty()) {
            for (int i = 0; i < k - 1; i++) { // k - 1만큼 순환
                que.offer(que.poll());
            }
            result.append(que.poll()); // k번 째 일 때 추출
            if (!que.isEmpty()) {
                result.append(", "); // 쉼표와 공백 추가
            }
        }
        result.append(">"); // 마지막 '>' 추가
        return result.toString();
    }
}
