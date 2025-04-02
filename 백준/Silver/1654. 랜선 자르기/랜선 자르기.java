
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수
        
        int[] cables = new int[K]; // 가지고 있는 랜선들의 길이
        long max = 0; // 가장 긴 랜선의 길이
        for(int i = 0; i < K; i++){
            cables[i] = Integer.parseInt(br.readLine());
            if( max < cables[i]) max = cables[i];
        }
        max++;
        bw.write(String.valueOf(calculate(max, N, cables)));
        bw.flush();
    }

    private static long calculate(long max, int n, int[] cables) {

        long min = 0; // 이분탐색 최솟값
        long mid = 0; // 이분탐색 중간값

        while (min < max) {
            mid = (min + max) / 2;
            long count = 0; // 나뉘어진 케이블 갯수
            for (long cable : cables) {
                count += cable / mid;
            }
            // 개수가 부족하면 중간값을 낮춘다.
            if (count < n) {
                max = mid;
            }// 개수가 많다면 중간값을 올린다.
            else {
                min = mid + 1;
            }

        }
        return min -1 ;
    }
}
