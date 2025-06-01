package homework12_1;

public class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // 방문 여부를 체크하기 위한 2차원 배열
        boolean[][] visited = new boolean[n][m];

        java.util.Queue<int[]> queue = new java.util.ArrayDeque<>();

        // 시작점 방문 표시 및 큐에 넣기
        visited[0][0] = true; // 시작점 방문 처리
        queue.add(new int[] { 0, 0, 1 });

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int r = now[0];
            int c = now[1];
            int dist = now[2];

            // 도착했으면 거리 리턴
            if (r == n - 1 && c == m - 1) {
                return dist;
            }

            // 위
            if (r > 0 && maps[r - 1][c] == 1 && !visited[r - 1][c]) {
                visited[r - 1][c] = true;
                queue.add(new int[] { r - 1, c, dist + 1 });
            }

            // 아래
            if (r < n - 1 && maps[r + 1][c] == 1 && !visited[r + 1][c]) {
                visited[r + 1][c] = true;
                queue.add(new int[] { r + 1, c, dist + 1 });
            }

            // 왼쪽
            if (c > 0 && maps[r][c - 1] == 1 && !visited[r][c - 1]) {
                visited[r][c - 1] = true;
                queue.add(new int[] { r, c - 1, dist + 1 });
            }

            // 오른쪽
            if (c < m - 1 && maps[r][c + 1] == 1 && !visited[r][c + 1]) {
                visited[r][c + 1] = true;
                queue.add(new int[] { r, c + 1, dist + 1 });
            }
        }

        return -1;
    }
}
