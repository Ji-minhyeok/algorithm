class Solution {
    public int[] solution(long n) {
        // 자릿수 파악
        String value = String.valueOf(n);
        int length = value.length();
        
        // 자릿수 파악 후 배열 생성
        int[] answer = new int[length]; 
        
        // 배열 채우기
        int index = 0;
        for(int i = length-1; i >=0; i--){
            answer[index] = value.charAt(i) - '0';
            index++;
        }

        return answer;
    }
}