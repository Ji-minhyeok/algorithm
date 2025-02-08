class Solution {
    public String solution(String[] seoul) {
        int index = -1; // "Kim"의 위치를 저장할 인덱스 변수
        String answer = ""; // 반환할 문자열
        // 각 요소 비교 및 리턴
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                index = i;
                answer = "김서방은 "+index+"에 있다";
                return answer;
            }
        }return answer;
    }
}