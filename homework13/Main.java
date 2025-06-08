package homework13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 열
        int N = sc.nextInt(); // 행
        int[][] box = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
            }
        }

        // 테스트 출력
        System.out.println("입력 받은 박스 배열:");
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(box[i]));
        }
    }
}
