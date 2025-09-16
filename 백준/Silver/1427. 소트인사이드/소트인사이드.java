import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int[] n = new int[str.length()];

		// 입력받은 n 값 배열로 저장
		for(int i = 0; i < str.length(); i ++){
			n[i] = Integer.parseInt(str.substring(i, i + 1));
		}

		int index = 0;
		int maxIndex = index;
		while(index < n.length){
			for(int i = index; i < n.length; i++){
				if(n[maxIndex] < n[i]){
					maxIndex = i;
				}
			}
			int temp = n[index];
			n[index] = n[maxIndex];
			n[maxIndex] = temp;

			// 탐색 범위 축소 및 최댓값 초기화
			index ++;
			maxIndex = index;
		}

		for(int i = 0; i < n.length; i++){
			bw.write(String.valueOf(n[i]));
		}
		bw.flush();
	}
}
