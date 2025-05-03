package Q2;

import java.util.PriorityQueue;

public class HeapTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = { 10, 4, 15, 1, 7, 6 };

        for (int num : arr) {
            pq.add(num);
            System.out.println("추가 후 poll() 미리보기: " + pq.peek());
        }

        System.out.println("\n모든 값 poll() 하기:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
