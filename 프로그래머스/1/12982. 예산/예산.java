import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;

        List<Integer> sortedList = new ArrayList<>();

        for (int al : d) {
            sortedList.add(al);
        }

        Collections.sort(sortedList);



        for (Integer al : sortedList) {
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