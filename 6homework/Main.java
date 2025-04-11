//  두 번째 시도: PriorityQueue에 정렬 기준(비교자) 넣기
// 1. 절댓값이 작은 수가 먼저
// 2. 절댓값이 같다면 실제 값이 작은 수가 먼저

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 명령 수

        // PriorityQueue에 우리가 원하는 정렬 기준(비교자) 넣기
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            // 절댓값이 같으면 더 작은 수가 먼저
            if (Math.abs(a) == Math.abs(b)) {
                return a - b; // 실제 값이 작은 수가 먼저
            } else {
                return Math.abs(a) - Math.abs(b); // 절댓값이 작은 수가 먼저
            }
        });

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                // 큐가 비어있으면 0 출력
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    // 절댓값이 가장 작은 수 출력
                    System.out.println(pq.poll());
                }
            } else {
                // 절댓값 기준 우선순위 큐에 값 추가
                pq.add(x);
            }
        }

        sc.close();
    }
}
