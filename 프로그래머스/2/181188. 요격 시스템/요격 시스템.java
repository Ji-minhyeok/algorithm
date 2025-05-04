import java.util.*;

class Solution {
    // 끝 점 기준 정렬하고
    // 관통하면 통과
    // 아니면 추가
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, Comparator.comparingInt(a -> a[1])); // 끝 점 기준 정렬
        
        double shot = -1;

        for(int[] target : targets){
            int s = target[0];
            int e = target[1];

            if( !(shot > s && shot < e) ){
                answer += 1;
                shot = e - 0.01;
            }
        }

        return answer;
    }
}