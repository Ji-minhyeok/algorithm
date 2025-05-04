class Solution {
    public boolean solution(int x) {
        int hashard = x;
        int sum = 0;
        while(hashard > 0){
            sum += hashard % 10;
            hashard = hashard / 10;
        }
        if(x % sum == 0){
            return true;
        }
        return false;
    }
}