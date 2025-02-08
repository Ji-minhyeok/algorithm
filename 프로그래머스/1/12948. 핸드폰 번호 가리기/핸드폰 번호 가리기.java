class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length(); // 문자열 길이
        
        // 뒷 4자리를 제외한 길이만큼 '*' 반복 결합
        for(int i = 0; i < length - 4; i++){
            sb.append("*");
        }
        // 뒷 4자리 결합
        sb.append(phone_number.substring(length - 4));
        
        // 반환
        answer = sb.toString();
        return answer;
    }
}