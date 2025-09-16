import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());


		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int[] sumArr = new int[n];

		// n 길이의 배열 초기화
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 1; i < n; i++){
			int insertValue = arr[i];
			int j = i - 1;

			// insertValue보다 큰 값들을 한 칸씩 뒤로 민다
			while(j >= 0 && arr[j] > insertValue){
				arr[j + 1] = arr[j];
				j--;
			}

			// 최종 삽입 위치
			arr[j + 1] = insertValue;
		}
		// 합배열
		sumArr[0] = arr[0];
		for(int i = 1; i < n; i++){
			sumArr[i] = sumArr[i - 1] + arr[i];
		}

		// 결과값
		int result = 0;
		for(int i = 0; i < n; i++){
			result = result + sumArr[i];
		}
		System.out.println(result);
	}
}
