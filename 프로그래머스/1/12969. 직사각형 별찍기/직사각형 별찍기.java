import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 가로 길이
        int b = sc.nextInt(); // 세로 길이
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; i ++){
            // 가로 길이만큼 별 찍기
            for(int j = 0; j < a; j++){
                sb.append("*");
            }
            sb.append("\n"); // 개행문자 추가
        }
        System.out.println(sb.toString());
    }
}