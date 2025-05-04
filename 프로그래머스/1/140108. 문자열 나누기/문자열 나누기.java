class Solution {
    public int solution(String s) {
        int answer = 0;

        int findCount = 0;
        int anotherCount = 0;

        while( s.length() != 0 ){
            for(int i = 0; i < s.length(); i++){
            
                char startChar = s.charAt(0);

                if( startChar == s.charAt(i) ){
                    findCount ++;
                }
                else{
                    anotherCount ++;
                }
                if( findCount == anotherCount ){
                    answer ++;
                    s = s.substring(i + 1); // 기존 문자열 업데이트
                    break;
                }
                if( i == s.length() - 1 ){
                    answer ++;
                    return answer;
                }
            }
        }
        return answer;
    }
}