import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine()); // 연산 갯수
		int x; // 연산 정보

		// 우선순위 큐 선언
		PriorityQueue<Integer> que = new PriorityQueue<>(
			(a, b) -> {
				int absA = Math.abs(a);
				int absB = Math.abs(b);

				if (absA == absB) {
					return a - b; // 절댓값 같으면 음수가 앞으로
				} else {
					return absA - absB; // 절댓값 작은 순
				}
			}
		);

		for( int i = 0; i < n; i++){
			x = Integer.parseInt(br.readLine());
			if (x == 0){
				if (que.size() == 0) { // 빈 배열이면 0 출력
					sb.append("0\n");
				}else{ // 가장 절댓값 작은 수 출력
					sb.append(que.poll()).append("\n");
				}
			}else{
				que.offer(x);
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
