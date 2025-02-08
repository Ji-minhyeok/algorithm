class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // left~right 반복 범위 지정
        for(int i = left; i <= right; i ++){
            
            // 약수의 갯수 카운팅
            int measure = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    measure ++;
                }
            }
            if(measure % 2 == 0) answer += i; // 약수의 개수가 짝수
            else answer -= i;// 약수의 개수가 홀수
        }
        return answer;
    }
}