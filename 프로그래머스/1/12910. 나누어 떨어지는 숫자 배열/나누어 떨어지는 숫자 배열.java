import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 배열 크기 확인
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }
        // 나누어 떨어지는 숫자가 없을 때
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        // 정답 배열 생성
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[index] = arr[i];
                index ++;
            }
        }
        // 오름차순 정렬, 리턴
        Arrays.sort(answer);
        return answer;
    }
}