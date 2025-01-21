import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findLastNumber(n));
    }
    public static Integer findLastNumber(int n){
        Queue<Integer> arr = new ArrayDeque<>();
        for(int i = 0; i < n; i++){ // 카드 배열 초기화
            arr.offer(i+1);
        }
        while(arr.size() > 1){ // 한 장이 남을때까지 반복.
            arr.poll(); // 제일 위에 있는 카드를 바닥에 버린다.
            arr.offer(arr.poll()); // 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
        }
        return arr.poll(); // 마지막 한 장 반환
    }
}