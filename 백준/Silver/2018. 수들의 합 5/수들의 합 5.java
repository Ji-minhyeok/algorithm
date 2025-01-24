
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        // 투 인덱스
        int startIndex = 0;
        int endIndex = 0;
        // 투 인덱스 구간의 합
        int sum = 1;
        // 만족하는 자연수의 합 개수 ( endIndex = n 인 경우 미리 고려)
        int result = 1;

        while (endIndex != n - 1) {
            if (sum == n) { // 값이 같으면 결과 +1, end 범위를 1 늘려 탐색
                result++;
                endIndex++;
                sum += arr[endIndex];
            } else if (sum > n) { // 합이 더 크면 start 범위 축소
                sum -= arr[startIndex];
                startIndex++;
            } else {
                endIndex++; // 합이 더 작으면 end 범위 증가
                sum += arr[endIndex];
            }
        }
        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}