import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스

        ArrayDeque<Integer> queue = new ArrayDeque<>(); // 큐 생성

        for(int i = 0; i < t; i++){ // 테스트 케이스 만큼 반복
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄의 명령을 입력받음
            String command = st.nextToken(); // 첫 번째 토큰(명령어)을 추출

            switch(command){
                case "push":
                    int param = Integer.parseInt(st.nextToken()); // push 명령의 두 번째 값(정수)을 추출
                    queue.add(param);
                    break;
                case "pop":
                    if(queue.isEmpty()){ // 비어있는지 확인
                        bw.write("-1\n");
                        break;
                    }else bw.write(queue.poll()+"\n"); break;
                case "front":
                    if(queue.isEmpty()) { // 비어있는지 확인
                        bw.write("-1\n");
                        break;
                    }else bw.write(queue.peek()+"\n");
                    break;
                case "back":
                    if(queue.isEmpty()) { // 비어있는지 확인
                        bw.write("-1\n");
                        break;
                    }else bw.write(queue.peekLast()+"\n");
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){ // 비어있는지 확인
                        bw.write("1\n");
                        break;
                    }else bw.write("0\n"); break;
            }
        }
        bw.flush(); // 결과 출력
        bw.close();
        br.close();
    }
}
