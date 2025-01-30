
import java.util.*;
import java.io.*;

public class Main { // 최소합을 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // "-" 기호 기준으로 나눠 뺄셈의 최댓값을 만듦
        String input = br.readLine();
        String[] sectionBeforeSub = input.split("-");

        // 결과를 저장할 변수
        int sumResult = 0;

        // "-" 기호로 구분된 각 구간의 합을 구하여 결과에서 뺀다.
        for (int i = 0; i < sectionBeforeSub.length; i++) {
            // "-" 기호가 나오기 전 첫 문자열 구간 나누기 및 합 구하기
            if (i == 0) {
                String[] temp = sectionBeforeSub[i].split("\\+");
                for(int j = 0; j < temp.length; j++){
                    sumResult += Integer.parseInt(temp[j]);
                }
            }
            else {
                sumResult -= SectionSum(sectionBeforeSub[i]); // 각 구간의 합을 구하여 뺌
            }
        }
        // 출력
        bw.write(String.valueOf(sumResult));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int SectionSum(String s) {
        String[] sectionBeforeAdd = s.split("\\+"); // 문자열 형태를 "+" 기호 기준으로 나눔 (정규식 표현 주의)
        int result = 0; // 반환할 값

        // 나눈 문자열의 합 구하기
        for(int i = 0; i < sectionBeforeAdd.length; i++){
            result += Integer.parseInt(sectionBeforeAdd[i]);
        }
        // 반환
        return result;
    }
}