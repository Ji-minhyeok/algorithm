import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;


        Arrays.sort(d);
        

        for (int al : d) {
            if (sum + al <= budget) {
                sum += al;
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}