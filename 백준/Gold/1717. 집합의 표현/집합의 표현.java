
import java.util.*;
import java.io.*;

public class Main {
    static int[] set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 노드 배열 초기화
        set = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            set[i] = i;
        }

        StringBuilder sb = new StringBuilder();

        // m번 반복
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            // 합집합 (union)
            if (Integer.parseInt(st.nextToken()) == 0) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                Union(a, b); // Union 실행
            }
            // find
            else {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(Find(a, b)); // 결과값 저장
            }
        }
        // 출력
        bw.write(sb.toString().trim());
        bw.flush();
        br.close();
        bw.close();
    }

    static void Union(int a, int b) {
        // 대표 노드 찾기
        int repA = FindRepNode(a);
        int repB = FindRepNode(b);
        // 대표 노드값으로 Union
        set[repB] = set[repA];
    }

    static String Find(int a, int b) {
        // 대표 노드 찾기
        int repA = FindRepNode(a);
        int repB = FindRepNode(b);
        // 대표 노드값 비교
        if(repA == repB){
            return "YES\n";
        }else return "NO\n";
    }

    static int FindRepNode(int num) { // 대표 노드 Finder
        if (set[num] != num) {
            while (set[num] != num) {
                num = set[num];
            }
        }
        return num;
    }
}
