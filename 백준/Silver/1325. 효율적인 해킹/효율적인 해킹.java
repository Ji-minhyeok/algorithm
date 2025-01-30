
import java.io.*;
import java.util.*;

public class Main {
    static int node; // 노드
    static int edge; // 엣지
    static ArrayList<Integer>[] adjList; // 인접 리스트
    static boolean[] visited; // 방문 확인
    static int[] answer; // 정답 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        answer = new int[node + 1];

        // 인접리스트 초기화
        adjList = new ArrayList[node+1];
        for(int i = 1; i <= node; i++){
            adjList[i] = new ArrayList<>();
        }

        // 인접리스트 값 저장
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            adjList[A].add(B);
        }

        // 각각 노드를 출발노드로 BFS 탐색
        for(int i = 1; i <= node; i++){
            visited = new boolean[node + 1]; // 초기값은 false 이다.
            BFS(i);
        }

        // 최대값 계산
        int maxValue = Arrays.stream(answer).max().getAsInt();

        // 최대값에 해당되는 answer 값 필터링
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= node; i++) {
            if (maxValue == answer[i]) {
                sb.append(i).append(" ");
            }
        }

        // 마지막 공백 제거 후 출력
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
    static void BFS(int node){
        // 큐 선언
        Queue<Integer> que = new ArrayDeque();

        // 출발 노드 큐에 추가
        que.add(node);

        // 방문 기록
        visited[node] = true;

        while(!que.isEmpty()){
            int nowNode = que.poll();
            for(int nextNode : adjList[nowNode]){
                if(!visited[nextNode]){
                    visited[nextNode] = true;
                    answer[nextNode]++; // 방문시 (신뢰하는 컴퓨터 일 때) answer 값 증가
                    que.add(nextNode);
                }
            }
        }
    }
}
