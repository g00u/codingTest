package homework12_1;

import java.util.*;

public class Test2 {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new ArrayDeque<>();

        visited[0][0] = true;
        queue.add(new int[] { 0, 0, 1 });

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int r = now[0], c = now[1], dist = now[2];

            System.out.println("현재 위치: (" + r + "," + c + "), 거리: " + dist);

            if (r == n - 1 && c == m - 1)
                return dist;

            if (r > 0 && maps[r - 1][c] == 1 && !visited[r - 1][c]) {
                visited[r - 1][c] = true;
                queue.add(new int[] { r - 1, c, dist + 1 });
                System.out.println("  위로 이동: (" + (r - 1) + "," + c + ")");
            }
            if (r < n - 1 && maps[r + 1][c] == 1 && !visited[r + 1][c]) {
                visited[r + 1][c] = true;
                queue.add(new int[] { r + 1, c, dist + 1 });
                System.out.println("  아래로 이동: (" + (r + 1) + "," + c + ")");
            }
            if (c > 0 && maps[r][c - 1] == 1 && !visited[r][c - 1]) {
                visited[r][c - 1] = true;
                queue.add(new int[] { r, c - 1, dist + 1 });
                System.out.println("  왼쪽으로 이동: (" + r + "," + (c - 1) + ")");
            }
            if (c < m - 1 && maps[r][c + 1] == 1 && !visited[r][c + 1]) {
                visited[r][c + 1] = true;
                queue.add(new int[] { r, c + 1, dist + 1 });
                System.out.println("  오른쪽으로 이동: (" + r + "," + (c + 1) + ")");
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Test2 sol = new Test2();
        // Test 5
        int[][] map5 = {
                { 1, 1, 1 },
                { 0, 0, 1 },
                { 1, 1, 1 }
        };
        System.out.println("Test 5결과: " + sol.solution(map5));

        int[][] map6 = {
                { 1, 1, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println("Test 6  결과: " + sol.solution(map6));

    }
}
