class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 정답 배열 초기화
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        // 배열 채우기
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        // 반환
        return answer;
    }
}