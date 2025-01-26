
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 수열 생성
        int n = Integer.parseInt(br.readLine());
        int[] originArr = new int[n];
        Data[] sortedArr = new Data[n];
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            originArr[i] = input;
            sortedArr[i] = new Data(i,input);
        }
        // 정렬된 수열 생성
        Arrays.sort(sortedArr);

        // 결과를 저장할 result
        int result = 1;

        // 정렬된 i번째 값의 index 와 원래 수열의 index 를 비교한 차는 곧 버블정렬 횟수를 뜻한다.
        for(int i = 0; i < n; i++){
            int compare = sortedArr[i].index - i + 1;
            if(result < compare){
                result = compare;
            }
        }
        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
    public static class Data implements Comparable<Data> {
        int index;
        int value;
        public Data(int index, int value){
            this.index = index;
            this.value = value;
        }
        public int compareTo(Data data){
            return this.value - data.value;
        }
    }
}
