import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // char 배열로 변환
        char[] chars = s.toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(chars);
        
        // String으로 재변환
        for(char c : chars){
            sb.append(c);
        }
        // 내림차순 변환
        sb.reverse();
        
        // 반환
        answer = sb.toString();
        return answer;
    }
}