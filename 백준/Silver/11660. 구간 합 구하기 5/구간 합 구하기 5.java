
import java.io.*;
import java.util.StringTokenizer;
// 1-based index 적용해 가독성 향상
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1]; // n * n 배열 생성
        for (int i = 1; i <= n; i++) { // n번 반복
            input = br.readLine();  // 한 줄씩 입력받음
            st = new StringTokenizer(input);

            for (int j = 1; j <= n; j++) { // i 번째 줄 내용 차례대로 배열에 저장
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArr = new int[n+1][n+1]; // 배열의 2차원 구간 합배열 n * n 생성
        for (int x = 1; x <= n; x++) { // 나머지 구간 채우기
            for (int y = 1; y <= n; y++) { // n번 반복
                sumArr[x][y] = sumArr[x-1][y] + sumArr[x][y-1] - sumArr[x-1][y-1] + arr[x][y];
            }
        }

        for (int i = 0; i < m; i++) { // m번 반복 (합을 구하는 횟수)
            input = br.readLine();  // 한 줄씩 입력받음
            st = new StringTokenizer(input);
            //x, y좌표 받기
            int x1 = Integer.parseInt(st.nextToken()); // 행
            int y1 = Integer.parseInt(st.nextToken()); // 열
            int x2 = Integer.parseInt(st.nextToken()); // 행
            int y2 = Integer.parseInt(st.nextToken()); // 열
            int result = 0;


            result += sumArr[x2][y2] - sumArr[x2][y1 - 1] - sumArr[x1 - 1][y2] + sumArr[x1 - 1][y1 - 1];

            if (i == m - 1) { // 마지막 문자열 처리
                bw.write(String.valueOf(result));
            } else bw.write(String.valueOf(result) + '\n');
        }
        bw.flush();
        bw.close();
        br.close();
    }
}