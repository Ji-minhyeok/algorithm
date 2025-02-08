class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int middleIndex = s.length() / 2;
        
        // 짝수 길이 조건
        if(s.length() % 2 == 0){
            sb.append(s.charAt(middleIndex - 1));
            sb.append(s.charAt(middleIndex));
        }// 홀수 길이 조건
        else{
            sb.append(s.charAt(middleIndex));
        }
        answer = sb.toString();
        return answer;
    }
}