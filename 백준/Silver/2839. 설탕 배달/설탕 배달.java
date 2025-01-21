import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findMinBags(n));
    }
    public static int findMinBags(int n){
        int result = 0;
        for(int i = n/5; i >= 0; i--){ // 5kg의 최대치부터 1봉지 씩 감소
            if((n - (i * 5)) % 3 == 0){ // 5kg로 나눈 나머지가 3kg로 나눠진다면?
                result = result + i + ((n - (i * 5)) / 3); // i개의 5kg 봉지와 나머지 분량에 해당하는 3kg 봉지
                return result;
            } // 나눠지지 않는다면 5kg 봉지를 1개씩 줄인다.
        }
        return -1; // 배달 가능한 조합이 없다면 -1 리턴
    }
}
