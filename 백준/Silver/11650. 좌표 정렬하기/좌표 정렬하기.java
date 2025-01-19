import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        Coordinate[] coordinates = new Coordinate[n]; // 좌표 배열 생성
        for (int i = 0; i < n; i++) { // 첫 줄의 n 만큼의 좌표 받기
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            coordinates[i] = new Coordinate(x, y);
        }
        coordinates = sortCoordinate(coordinates);
        for (int i = 0; i < n; i++) {
            System.out.println(coordinates[i].x + " " + coordinates[i].y);
        }
    }
    public static Coordinate[] sortCoordinate(Coordinate[] coordinates){
        Arrays.sort(coordinates, (a, b) -> {
            if (a.x != b.x) {
                return Integer.compare(a.x, b.x); // x 기준 오름차순
            } else {
                return Integer.compare(a.y, b.y); // x가 같으면 y 기준 오름차순
            }
        });
        return coordinates;
    }
}

class Coordinate{
    int x;
    int y;
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}
