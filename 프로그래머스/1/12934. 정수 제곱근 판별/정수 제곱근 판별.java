class Solution {
    public long solution(long n) {
        long answer = -1;
        if(n == 1) return 4;
        for(long i = 1; i < n/2; i++){
            if(n == i*i){
                return (i+1)*(i+1);
            }
        }
        return answer;
    }
}