import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        // 고유 번호 배열 초기화
        int[] arr = new int[n];
        for( int i = 0; i < n; i++ ){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        Arrays.sort(arr);

        // 투 포인터 선언
        int startIndex = 0;
        int endIndex = n - 1;
        // 결과 저장 변수
        int result = 0;

        while(endIndex != startIndex){
            // m값과 같으면 결과 증가, 시작 인덱스 증가하여 재탐색
            if(arr[startIndex] + arr[endIndex] == m){
                result ++;
                startIndex ++;
            // M값보다 작으면 시작 인덱스 증가
            }else if(arr[startIndex] + arr[endIndex] < m){
                startIndex ++;
            // M값보다 크면 끝 인덱스 감소
            }else{
                endIndex --;
            }
        }

        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
