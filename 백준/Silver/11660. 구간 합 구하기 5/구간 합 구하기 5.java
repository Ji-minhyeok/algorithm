
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n]; // n * n 배열 생성
        for (int i = 0; i < n; i++) { // n번 반복
            input = br.readLine();  // 한 줄씩 입력받음
            st = new StringTokenizer(input);

            for (int j = 0; j < n; j++) { // i 번째 줄 내용 차례대로 배열에 저장
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArr = new int[n][n]; // 배열의 합배열 n * n 생성
        for (int i = 0; i < n; i++) { // n번 반복
            for (int j = 0; j < n; j++) { // n번 반복
                if (j == 0) { // 더한 값이 없는 배열의 각 행의 0번째 값 지정
                    sumArr[i][j] = arr[i][j];
                } else sumArr[i][j] = sumArr[i][j - 1] + arr[i][j]; // 배열의 각 행의 j번 까지의 합 저장
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

            for (int x = x1 - 1; x <= x2 - 1; x++) { // 행 조건
                if (y1 == 1) { // 시작 열이 1인 경우 끝 열의 구간 합과 같다.
                    result += sumArr[x][y2 - 1];
                } else result += sumArr[x][y2 - 1] - sumArr[x][y1 - 2];
            }
            if (i == m - 1) {
                bw.write(String.valueOf(result));
            } else bw.write(String.valueOf(result) + '\n');
        }
        bw.flush();
        bw.close();
        br.close();
    }
}