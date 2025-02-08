class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int target = 0; target <= 9; target++){
            int check = 0;
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] == target){
                    check = 1;
                    break;
                }
            }
            if(check != 1){
                answer += target;
            }
        }
        return answer;
    }
}