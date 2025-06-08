package homework13_1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 열
        int N = sc.nextInt(); // 행
        int[][] box = new int[N][M];
        Queue<int[]> queue = new ArrayDeque<>();

        // 방향 벡터: 상, 하, 좌, 우
        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    queue.add(new int[] { i, j });
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] u = queue.poll();
            int r = u[0], c = u[1];

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M && box[nr][nc] == 0) {
                    box[nr][nc] = box[r][c] + 1;
                    queue.add(new int[] { nr, nc });
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, box[i][j]);
            }
        }

        System.out.println(max - 1);
    }
}
