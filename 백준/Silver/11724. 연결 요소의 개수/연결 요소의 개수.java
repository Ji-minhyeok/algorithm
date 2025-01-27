
import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int node = Integer.parseInt(st.nextToken()); // 노드
        int edge = Integer.parseInt(st.nextToken()); // 엣지

        A = new ArrayList[node + 1]; // 인접리스트
        visited = new boolean[node + 1]; // 방문기록 초기화

        for(int i = 1; i < node + 1; i++){
            A[i] = new ArrayList<Integer>(); // 인접리스트 초기화
        }
        for(int i = 0; i < edge; i++){ // 인접리스트 저장
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); // 양방향
            A[e].add(s); // 양방향
        }
        int count = 0;

        for(int i = 1; i < node + 1; i++){ // 노드 전체 순회
            if(visited[i] != true){ // 방문하지 않은 모든 노드를 탐색
                count ++; // 탐색 횟수 증가
                DFS(i);
            }
        }
        System.out.print(count);
    }
    public static void DFS(int node){ // 재귀 형태
        if(visited[node]){ // 해당 노드를 방문했었다면 탐색하지 않음
            return;
        }
        visited[node] = true; // 탐색 시작
        for(int i : A[node]){ // node의 엣지들 순회
            if(visited[i] != true){ // 연결 노드에 방문하지 않았으면 노드 탐색
                DFS(i);
            }
        }
    }
}
