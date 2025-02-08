class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        // 문자 단위 비교 및 카운팅
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                countP ++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                countY ++;
        }
        // 결과 리턴
        answer = countP == countY;
        return answer;
    }
}