

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String sNums = br.readLine();
        StringTokenizer st = new StringTokenizer(sNums);
        int[] arrNums = new int[n];
        int maxNum = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            arrNums[i] = Integer.parseInt(st.nextToken());
            if(arrNums[i] > maxNum){
                maxNum = arrNums[i];
            }
            sum += arrNums[i];
        }
        double result = sum * 100.0 / maxNum / n;
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
