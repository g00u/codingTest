package homework12;

public class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        java.util.Queue<int[]> queue = new java.util.ArrayDeque<>();

        // 시작점 (0,0)을 큐에 추가

        queue.add(new int[] { 0, 0, 1 }); // {행, 열, 지금까지 거리}

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int r = now[0]; // 현재 행 위치
            int c = now[1]; // 현재 열 위치
            int dist = now[2]; // 지금까지 이동 거리

            // 도착지점에 도달하면 지금까지 거리 리턴
            if (r == n - 1 && c == m - 1) {
                return dist;
            }

            // 상하좌우 조건별로 이동 (이동 가능한 칸만)
            if (r > 0 && maps[r - 1][c] == 1)
                queue.add(new int[] { r - 1, c, dist + 1 });
            if (r < n - 1 && maps[r + 1][c] == 1)
                queue.add(new int[] { r + 1, c, dist + 1 });
            if (c > 0 && maps[r][c - 1] == 1)
                queue.add(new int[] { r, c - 1, dist + 1 });
            if (c < m - 1 && maps[r][c + 1] == 1)
                queue.add(new int[] { r, c + 1, dist + 1 });
        }

        // 도착할 수 없으면 -1 리턴
        return -1;
    }
}
