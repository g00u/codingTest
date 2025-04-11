// 절댓값 기준 정렬을 위해 PriorityQueue 커스텀 Comparator 사용

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absCompare = Integer.compare(Math.abs(a), Math.abs(b));
            if (absCompare == 0) {
                return Integer.compare(a, b); // 절댓값 같으면 작은 수 우선
            }
            return absCompare;
        });

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(x);
            }
        }
    }
}
