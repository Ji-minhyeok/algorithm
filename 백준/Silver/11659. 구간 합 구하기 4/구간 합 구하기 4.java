import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        input = br.readLine();
        st = new StringTokenizer(input);

        int[] arr = new int[n]; // 일반 배열
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sumArr = new int[n]; // arr배열의 합배열
        sumArr[0] = arr[0]; // 인덱스 0 초기화
        for(int i = 1; i < n; i++){ // 합배열 구성하기
            sumArr[i] = sumArr[i - 1] + arr[i];
        }

        for(int i = 0; i < m; i++){
            input = br.readLine();
            st = new StringTokenizer(input);
            int first = Integer.parseInt(st.nextToken()); // 구간의 첫 인덱스
            int last = Integer.parseInt(st.nextToken()); // 구간의 마지막 인덱스

            // 마지막 줄이 아닐 경우 개행문자 추가
            if (i == m - 1) {
                bw.write(String.valueOf(panelCalculator(sumArr, first, last)));
            } else {
                bw.write(String.valueOf(panelCalculator(sumArr, first, last)) + '\n');
            }
        }
        bw.flush();
    }

    private static int panelCalculator(int[] sumArr, int first, int last) {
        if(first == 1){
            return sumArr[last - 1];
        }else return sumArr[last-1] - sumArr[first-2];
    }
}
