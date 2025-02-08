class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lengthT = t.length(); // 문자열 t 길이
        int lengthP = p.length(); // 문자열 p 길이
        long intP = Long.parseLong(p); // 문자열 p의 int형 변환

        
        // 부분 문자열 초기화
        String subString = "";
        
        // T의 전체 길이만큼 탐색
        for(int i = 0; i <= lengthT - lengthP; i ++){
            
            // t의 부분문자열
            subString = t.substring(i, i+lengthP);
            
            // t의 부분문자열 단위 대소 비교
            long intT = Long.parseLong(subString);
            if(intT <= intP){
                answer++; // 반환값 증가
            }
        }
        return answer;
    }
}