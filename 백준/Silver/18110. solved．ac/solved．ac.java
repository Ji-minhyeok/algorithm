
import java.util.*;
import java.io.*;

public class Main { // 절사 평균
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 난의도 의견 개수
        int n = Integer.parseInt(br.readLine());

        // 의견이 없으면 0 출력 및 종료
        if(n == 0){
            bw.write(String.valueOf(0));
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        // 난의도 의견 배열
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        // 제외할 사람의 수
        int except = (int)Math.round(n * 0.15);

        // 평균을 구할 변수
        long average = 0;

        // except 만큼 처음과 끝 의견을 제외한 범위 내에서 탐색
        for(int i = except; i < n - except; i++){
            average += arr[i];
        }

        // 제외한 인원 수를 고려해 평균 계산
        average = Math.round(average / (double)(arr.length - except * 2));

        // 출력
        bw.write(String.valueOf(average));
        bw.flush();
        bw.close();
        br.close();
    }
}
