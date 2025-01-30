
import java.util.*;
import java.io.*;

public class Main {
    static int[] isVisited; // 방문 저장
    static ArrayList<Integer>[] adList; // 인접 리스트
    static ArrayList<Integer> answer; // 정답 도시 저장 배열
    static int node, edge, distance, start; // 노드 개수, 엣지 개수, 목표 거리, 출발 도시

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        distance = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        answer = new ArrayList<>();
        adList = new ArrayList[node+1];

        // 노드 개수만큼 인접 리스트 배열 생성
        for(int i = 1; i <= node; i++){
            adList[i] = new ArrayList<>();
        }

        // 엣지 개수만큼 해당 노드에 인접 리스트 저장
        for(int i = 0; i < edge; i++){
            input = br.readLine();
            st = new StringTokenizer(input);
            adList[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }

        // 방문 배열 초기화
        isVisited = new int[node + 1];
        for(int i = 0; i <= node; i++){
            isVisited[i] = -1;
        }

        // BFS 탐색
        BFS(start);

        // 방문배열의 거리를 비교하여 정답에 추가
        for(int i = 1; i <= node; i++){
            if (isVisited[i] == distance){
                answer.add(i);
            }
        }

        // 정답 출력
        if(answer.isEmpty()){
            bw.write("-1");
        }else{
            Collections.sort(answer);
            for(int i =0; i < answer.size(); i++){
                bw.write(String.valueOf(answer.get(i)));
                if(i != answer.size() - 1) bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static void BFS(int start){
        // 큐 선언
        Queue<Integer> que = new LinkedList<>();

        // 출발 노드 더하기
        que.add(start);

        // 방문 표시
        isVisited[start]++;
        
        
        while(!que.isEmpty()){ // 큐가 빌 때까지
            int nowNode = que.poll(); // 현재 노드 가져오기
            for (int i : adList[nowNode]){ // 연결 노드 탐색
                if(isVisited[i] == -1){ // 방문한 적이 없으면
                    isVisited[i] = isVisited[nowNode] + 1; // 방문 거리 기록 (현재 거리 + 1)
                    que.add(i);
                }
            }
        }



    }
}
