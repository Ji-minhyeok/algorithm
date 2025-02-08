class Solution {
    public boolean solution(String s) {
        // 길이 조건 확인
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        // 아스키코드 활용 숫자 구성 확인
        for(int i = 0; i < s.length(); i++){
            if('9' < s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}