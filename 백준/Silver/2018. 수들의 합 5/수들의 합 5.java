import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 구간합 저장을 위한 배열 초기화
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = arr[i-1] + i;
        }

        // 투 포인터
        int startIndex = 0;
        int endIndex = 1;

        // 'n = n'의 경우 고려
        int result = 1;

        // 종료 인덱스가 n에 도래하기 전까지
        while(endIndex != n){
            if(arr[endIndex] - arr[startIndex] == n){
                result ++;
                endIndex++;
            // 연산 결과가 더 크다면 시작 인덱스 +1
            }else if(arr[endIndex] - arr[startIndex] > n){
                startIndex++;
            // 연산 결과가 더 크다면 종료 인덱스 +1
            }else if(arr[endIndex] - arr[startIndex] < n){
                endIndex++;
            }
        }

        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}