import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 인덱스값으로 배열 초기화
        int[] arr = new int[N + 1];
        for(int i = 2; i <= N; i++){
            arr[i] = i;
        }

        // 배수는 모두 소수가 아니다.
        for(int i = 2; i <= Math.sqrt(N); i++){
            if( arr[i] == i){
                for(int j = i + i; j <= N; j += i){
                    arr[j] = 0;
                }
            }
        }

        for(int i = M; i <= N; i++){
            if( arr[i] == i){
                System.out.println(i);
            }
        }

    }
}
