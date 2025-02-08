class Solution {
    public int[] solution(int[] arr) {
        int minIndex = 0; // 가장 작은 수의 인덱스
        
        // 빈 배열
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        // 가장 작은 값 찾기
        for(int i = 0; i < arr.length; i++){
            if (arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        
        // 가장 작은 값을 제외한 배열 만들기
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != minIndex){ // 제외 조건
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}