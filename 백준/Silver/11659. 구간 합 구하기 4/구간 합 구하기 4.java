import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] sumArr = new int[n+1];

        // 합배열 생성
        for(int i = 1; i <= n; i++){
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int startNum = Integer.parseInt(st.nextToken());
            int endNum = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(sumArr[endNum]-sumArr[startNum-1])+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
