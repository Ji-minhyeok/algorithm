import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 처리
        int n = Integer.parseInt(br.readLine());
        int[] source = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            source[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(source); // 정렬

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int findNum = Integer.parseInt(st.nextToken());
            int count = findUpperBound(source, findNum) - findLowerBound(source, findNum);
            result.append(count).append(" ");
        }

        // 결과 출력
        bw.write(result.toString().trim());
        bw.flush();
    }

    public static int findLowerBound(int[] source, int findNum) {
        int low = 0, high = source.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (source[mid] >= findNum) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int findUpperBound(int[] source, int findNum) {
        int low = 0, high = source.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (source[mid] > findNum) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}