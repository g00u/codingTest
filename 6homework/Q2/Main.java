package Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // PriorityQueue: 기본이 '최소 힙' 구조
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll()); // 가장 작은 값 출력 + 제거
                }
            } else {
                pq.add(x); // 힙에 값 추가
            }
        }

        sc.close();
    }
}
