import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // 문자열 변환
        String str = String.valueOf(n);
        // 배열 선언
        int length = str.length();
        Integer[] arr = new Integer[length];
        
        // 입력받은 값 배열로 변환
        for(int i = 0; i < length; i++){
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < length; i++){
            sb.append(arr[i]);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}