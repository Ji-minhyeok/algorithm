import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 행
        int m = scanner.nextInt(); // 열
        scanner.nextLine();
        char[][] chess = new char[n][m]; // 2차원 배열 생성
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                chess[i][j] = input.charAt(j); // 문자열에서 j번째 문자 추출 후 배열에 저장
            }
        }
        System.out.println(findFaintChess(chess));
    }
    public static int findFaintChess(char[][] chess){
        int n = chess.length;
        int m = chess[0].length;
        int printCountW = 0;
        int resultW = 64;
        int printCountB = 0;
        int resultB = 64;
        //W 부터 시작인 경우
        for(int i = 0; i < n-7; i++){ // 시작점 세로 범위
            for(int j = 0; j < m-7; j++){ // 시작점 가로 범위
                for(int k = 0; k <8 ; k++){ // 세로 8칸 범위 지정
                    if(k % 2 == 0) { // 홀수줄
                        for (int l = 0; l < 7; l += 2) { // 가로 8칸 범위 지정
                            if(chess[i+k][j+l] != 'W'){ // 홀수칸
                                printCountW ++;
                            }
                            if(chess[i+k][j+l+1] != 'B'){ // 짝수칸
                                printCountW ++;
                            }
                        }
                    }else{ // 짝수줄
                        for (int l = 0; l < 7; l += 2) { // 가로 8칸 범위
                            if(chess[i+k][j+l] != 'B'){ // 홀수칸
                                printCountW ++;
                            }
                            if(chess[i+k][j+l+1] != 'W'){ // 짝수칸
                                printCountW ++;
                            }
                        }
                    }
                }
                if(printCountW < resultW){
                    resultW = printCountW;
                    printCountW = 0;
                }else printCountW = 0;
            }
        }
        //B 부터 시작인 경우
        for(int i = 0; i < n-7; i++){ // 시작점 세로 범위
            for(int j = 0; j < m-7; j++){ // 시작점 가로 범위
                for(int k = 0; k <8 ; k++){ // 세로 8칸 범위 지정
                    if(k % 2 == 0) { // 홀수줄
                        for (int l = 0; l < 7; l += 2) { // 가로 8칸 범위 지정
                            if(chess[i+k][j+l] != 'B'){ // 홀수칸
                                printCountB ++;
                            }
                            if(chess[i+k][j+l+1] != 'W'){ // 짝수칸
                                printCountB ++;
                            }
                        }
                    }else{ // 짝수줄
                        for (int l = 0; l < 7; l += 2) { // 가로 8칸 범위
                            if(chess[i+k][j+l] != 'W'){ // 홀수칸
                                printCountB ++;
                            }
                            if(chess[i+k][j+l+1] != 'B'){ // 짝수칸
                                printCountB ++;
                            }
                        }
                    }
                }
                if(printCountB < resultB){
                    resultB = printCountB;
                    printCountB = 0;
                }else printCountB = 0;
            }
        }
        if(resultW < resultB)
            return resultW;
        else
            return resultB;
    }
}
