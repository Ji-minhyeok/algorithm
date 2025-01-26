
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        int flag = 1;

        int range = n - 1;

        while(flag != 0){
            flag = 0;
            for(int i = 0; i < range; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = 1;
                }
            }
            range --;
        }

        for(int i = 0; i < n; i++){
            bw.write(String.valueOf(arr[i]));
            if(i != n-1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
