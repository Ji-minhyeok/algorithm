
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken()); // 데이터의 수
        int l = Integer.parseInt(st.nextToken()); // 슬라이딩 범위
        Deque<Node> deque = new LinkedList<>(); // 데이터를 담을 덱

        input = br.readLine();
        st = new StringTokenizer(input);
        for(int i = 1; i <= n; i++) { // n만큼 반복
            Node nodeN = new Node(i, Integer.parseInt(st.nextToken())); // N번째 값 노드 생성

            // 데이터의 N번째 값과 덱의 마지막 위치에서부터 비교하여 더 크다면 삭제
            while(!deque.isEmpty() && deque.getLast().value > nodeN.value){
                deque.removeLast();
            }

            // N번째 값 추가
            deque.add(nodeN);

            // 덱의 처음 위치에서부터 L 범위를 넘어간다면 삭제 (index <= N - L)
            if(deque.getFirst().index <= nodeN.index - l) deque.removeFirst();

            // 결과값 넣기
            bw.write(String.valueOf(deque.getFirst().value));
            // 공백 조건
            if(deque.getLast().index != n) bw.write(" ");
        }
        // 출력
        bw.flush();
        bw.close();
        br.close();
    }
    public static class Node{
        int index; // 인덱스
        int value; // 값

        public Node(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}

/**
 N : 데이터의 수 / L : 최솟값의 범위
 Deque<Node> deque : 데이터를 담을 덱

 for (N 만큼 반복){
    데이터의 N번째 값과 덱의 마지막 위치에서부터 비교하여 더 크다면 삭제
    덱에 N번째 값 추가
    덱의 처음 위치에서부터 L 범위를 넘어간다면 삭제 (index <= N - L)
    덱의 첫번째 값 출력 (범위 내의 최솟값)
 }
 class Node{
    index : 현재 인덱스
    value : 값
 }
 **/
