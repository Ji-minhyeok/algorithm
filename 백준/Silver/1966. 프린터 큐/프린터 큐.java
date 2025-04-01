import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int caseNum = Integer.parseInt(st.nextToken()); // 테스트 케이스 수

        for(int i = 0; i < caseNum; i++){
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken()); // 문서의 개수
            int pick = Integer.parseInt(st.nextToken()); // 현재 Queue에서 몇 번째에 놓여 있는지 나타내는 정수

            // 중요도 리스트
            Queue<Document> queue = new ArrayDeque<>();
            PriorityQueue<Document> priorityQueue = new PriorityQueue<>((m1, m2)->m2.priority-m1.priority);

            st = new StringTokenizer(br.readLine());
            // 문서
            for(int j = 0; j < size; j++){

                Document doc = new Document(j, Integer.parseInt(st.nextToken()));
                priorityQueue.add(doc);
                queue.add(doc);
            }
            bw.write(printQueue(pick, queue, priorityQueue)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }

    private static int printQueue(int pick, Queue<Document> queue, PriorityQueue<Document> pQueue){
        int count = 0;

        // 우선순위 높은 문서부터 검사
        while(true){

            // 일반 큐의 현재 문서 꺼내기
            Document temp = queue.poll();

            // 일반 큐의 현재 문서의 중요도와 우선 순위 큐의 현재 문서의 중요도 비교
            if ( temp.priority == pQueue.peek().priority ){

                // 일치하면 우선 순위 큐 poll 후 count 증가
                pQueue.poll();
                count++;

                // 일반 큐의 첫 문서가 찾고자 하는 문서라면 count 리턴
                if( temp.num == pick)
                    return count;
            }else{
                // 중요도가 낮다면 맨 뒤로 보내기
                queue.add(temp);
            }
        }

    }
    public static class Document{
        public int num;
        public int priority;

        public Document(int num, int priority){
            this.num = num;
            this.priority = priority;
        }
    }
}
