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
        long result = 0;
        long[] sumArr = new long[n]; // 누적합 배열
        long[] countArr = new long[m]; // 누적합을 M으로 나눈 나머지 값의 카운팅 배열

        input = br.readLine();
        st = new StringTokenizer(input);

        // 누적합 계산
        sumArr[0] = Long.parseLong(st.nextToken());
        for(int i =1; i < n; i++){
            sumArr[i] = sumArr[i-1] + Long.parseLong(st.nextToken());
        }

        // 나머지 값 카운팅
        for(int i = 0; i < n; i++){
            int reminder = (int)(sumArr[i]%m); // 누적합을 M으로 나눈 나머지 값
            if(reminder == 0) result++; // M으로 나누어 떨어지면(0이면) 결과값 +1
            countArr[reminder]++; // 아니라면, 나머지 값에 해당하는 인덱스에 +1
        }
        // 나머지 값 조합 계산
        for(int i = 0; i < m; i++){
            // 나머지 값이 동일하다면 두 수의 차는 M으로 나누어 떨어진다!
            // 고로, 나머지 값이 같은 수가 '두 수'이상이라면 그 조합만큼 결과값 증가 (k * (k-1) / 2)
            if (countArr[i] >= 2){
                result = result + (countArr[i] * (countArr[i] -1) / 2);
            }
        }
        // 결과 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
