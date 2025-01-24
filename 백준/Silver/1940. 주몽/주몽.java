
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

        int[] arr = new int[n]; // 고유 번호 배열 초기화
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 오름차순 정렬
        Arrays.sort(arr);

        int firstIndex = 0;
        int lastIndex = arr.length-1;
        int result = 0;
        int sum = arr[firstIndex] + arr[lastIndex];

        while(firstIndex < lastIndex){
            if(sum == m){ // 합을 찾으면 결과에 +1 하고 범위를 좁혀 다음 수를 찾는다.
                result ++;
                firstIndex ++;
                lastIndex --;
                sum = arr[firstIndex] + arr[lastIndex];
            }else if(sum < m){ // 합이 m 보다 작으면 시작 인덱스를 늘린다.
                firstIndex++;
                sum = arr[firstIndex] + arr[lastIndex];
            }else{ // 합이 m 보다 크면 끝 인덱스를 줄인다.
                lastIndex --;
                sum = arr[firstIndex] + arr[lastIndex];
            }
        }
        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
