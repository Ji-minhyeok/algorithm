import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sourceNum = new int[n];
        for(int i = 0; i < n; i++){
            sourceNum[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] findNum = new int[m];
        for(int i = 0; i < m; i++){
            findNum[i] = scanner.nextInt();
        }
        Arrays.sort(sourceNum); // 이분탐색을 위한 정렬
        findingNum(sourceNum, findNum);
    }

    public static void findingNum(int[] sourceNum, int[] findNum){
        for(int i = 0; i < findNum.length; i++){
            if(Arrays.binarySearch(sourceNum, findNum[i]) >= 0){
                System.out.println(1);
            }else System.out.println(0);
        }
    }
}
