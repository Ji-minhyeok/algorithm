class Solution {
    public int[] solution(int n, int m) {
        int GCD = -1;
        int LCM = -1;
        
        // 대소비교
        if(n > m){
            int temp = n;
            n = m;
            m = temp;
        }
        
        GCD = GCD(n, m); // 최대공약수
        LCM = n * m / GCD; // 최소공배수
        
        
        int[] answer = {GCD, LCM};
        return answer;
    }
    
    public int GCD(int n, int m){
        if(m == 0){
            return n;
        }else return GCD(m , n % m); // 재귀
    }
}