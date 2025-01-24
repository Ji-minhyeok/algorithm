
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
        long[] sumArr = new long[n];
        long[] countArr = new long[m];

        input = br.readLine();
        st = new StringTokenizer(input);

        sumArr[0] = Long.parseLong(st.nextToken());
        for(int i =1; i < n; i++){
            sumArr[i] = sumArr[i-1] + Long.parseLong(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int reminder = (int)(sumArr[i]%m);
            if(reminder == 0) result++;
            countArr[reminder]++;
        }

        for(int i = 0; i < m; i++){
            if (countArr[i] > 1){
                result = result + (countArr[i] * (countArr[i] -1) / 2);
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
