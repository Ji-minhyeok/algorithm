
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        // n개의 수 배열
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int result = 0;
        for(int i = 0; i < n; i++){
            int target = arr[i]; // 목표값

            // 출발점 : 배열 양 끝 범위
            int firstIndex = 0;
            int lastIndex = arr.length-1;

            // 합계 초기 값
            int sum = arr[firstIndex]+ arr[lastIndex];

            // 투 포인터 만나기 전 까지 진행
            while(firstIndex < lastIndex){
                if(sum == target){
                    // 자기 자신은 제외한다.(다른 두 수의 합이 조건)
                    if(lastIndex == i){
                        lastIndex--;
                        sum = arr[firstIndex]+ arr[lastIndex];
                    }
                    else if (firstIndex == i) {
                        firstIndex++;
                        sum = arr[firstIndex]+ arr[lastIndex];
                    }
                    // 다른 두 수의 합이 목표를 만족하면 결과 +1
                    else{
                        result++;
                        break;
                    }
                // 두 수의 합이 목표를 만족하지 못하면 재탐색
                }else if(sum < target){
                    firstIndex++;
                    sum = arr[firstIndex]+ arr[lastIndex];
                }else{
                    lastIndex--;
                    sum = arr[firstIndex]+ arr[lastIndex];
                }
            }
        }
        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
