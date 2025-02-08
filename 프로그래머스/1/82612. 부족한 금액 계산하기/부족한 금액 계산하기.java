class Solution {
    public long solution(int price, int money, int count) {
        // 총 이용 금액 구하기
        long totalPrice = 0;
        for(int i = 1; i <= count; i++){
            totalPrice += price*i;
        }
        if(money - totalPrice > 0) return 0;
        else return -(money - totalPrice);
    }
}