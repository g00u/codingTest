package homework13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 열
        int N = sc.nextInt(); // 행
        int[][] box = new int[N][M];
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    queue.add(new int[] { i, j }); // 익은 토마토의 위치를 큐에 추가
                }
            }
        }

        // BFS 상하좌우 4방향 탐색
        while (!queue.isEmpty()) {
            int[] u = queue.poll();
            int r = u[0], c = u[1];

            // 상
            if (r > 0 && box[r - 1][c] == 0) {
                // box[r - 1][c]는 "현재 위치 (r,c)의 위쪽 칸"
                // 토마토는 상하좌우로만 익으므로 위칸에 안 익은 토마토(0)가 있다면
                // 현재 칸의 값 +1을 기록하고 큐에 넣음
                box[r - 1][c] = box[r][c] + 1;
                queue.add(new int[] { r - 1, c });
            }
            // 좌
            if (c > 0 && box[r][c - 1] == 0) {
                box[r][c - 1] = box[r][c] + 1;
                queue.add(new int[] { r, c - 1 });
            }

            // 하
            if (r < N - 1 && box[r + 1][c] == 0) {
                box[r + 1][c] = box[r][c] + 1;
                queue.add(new int[] { r + 1, c });
            }

            // 우
            if (c < M - 1 && box[r][c + 1] == 0) {
                box[r][c + 1] = box[r][c] + 1;
                queue.add(new int[] { r, c + 1 });
            }
        }

        // 결과확인: 남은 0 (안 익은 토마토)와 최대 날짜 확인
        int maxDays = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println("-1"); // 안 익은 토마토가 있으면 -1 출력
                    return;
                }
                maxDays = Math.max(maxDays, box[i][j]);
            }
        }
        // 모든 토마토가 익었으면 최대 날짜 출력
        System.out.println(maxDays);

        sc.close();
    }
}
