class Solution {
    public int solution(int num) {
        int count = 0;
        long calculate = num;
        while(count <= 500){ // 500회 제한
            if(calculate == 1) return count;
            count ++;
            if(calculate % 2 == 0){ // 짝수 조건
                calculate /= 2;
            }else{ // 홀수 조건
                calculate = calculate * 3 + 1;
            }
            if(calculate == 1) return count;
        }
        return -1;
    }
}