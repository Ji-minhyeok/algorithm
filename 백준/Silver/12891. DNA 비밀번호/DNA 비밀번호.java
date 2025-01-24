import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int s = Integer.parseInt(st.nextToken()); // DNA 문자열 길이
        int p = Integer.parseInt(st.nextToken()); // 비밀번호 문자열 길이

        // 입력받은 DNA 문자열
        String strDNA = br.readLine();

        // 각 문자의 최소 갯수
        input = br.readLine();
        st = new StringTokenizer(input);
        int[] minNum = new int[4];
        for(int i = 0; i < 4; i++){
            minNum[i] = Integer.parseInt(st.nextToken());
        }

        // 결과값 저장 변수
        int result = 0;

        // 현재 슬라이딩 문자열 상태 저장 변수
        int[] countArr = new int[4];

        for(int i = 0; i < p; i++){ // 초기 슬라이딩
            switch (strDNA.charAt(i)){
                case 'A':
                    countArr[0]++;
                    break;
                case 'C':
                    countArr[1]++;
                    break;
                case 'G':
                    countArr[2]++;
                    break;
                case 'T':
                    countArr[3]++;
                    break;
                default: break;
            }
        }
        if(minNum[0] <= countArr[0] && minNum[1] <= countArr[1] && minNum[2] <= countArr[2] && minNum[3] <= countArr[3]){
            result++;
        }
        int startIndex = 1; // 시작점
        while(startIndex <= s - p){
            switch (strDNA.charAt(startIndex + p -1)) { // 한 칸 이동
                case 'A':
                    countArr[0]++;
                    break;
                case 'C':
                    countArr[1]++;
                    break;
                case 'G':
                    countArr[2]++;
                    break;
                case 'T':
                    countArr[3]++;
                    break;
                default:
                    break;
            }
            switch (strDNA.charAt(startIndex - 1)) { // 이전 칸 삭제
                case 'A':
                    countArr[0]--;
                    break;
                case 'C':
                    countArr[1]--;
                    break;
                case 'G':
                    countArr[2]--;
                    break;
                case 'T':
                    countArr[3]--;
                    break;
                default:
                    break;
            }
            // 조건 충족 시 결과 +1
            if(minNum[0] <= countArr[0] && minNum[1] <= countArr[1] && minNum[2] <= countArr[2] && minNum[3] <= countArr[3]){
                result++;
            }// 다음 인덱스
            startIndex++;
        }
        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
