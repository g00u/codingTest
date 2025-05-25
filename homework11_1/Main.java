package homework11_1;

import java.util.*;

public class Main {

    static int[] A;
    static int M;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 입력 받기
            int N = sc.nextInt(); // 강의 수
            M = sc.nextInt(); // 블루레이 개수
            A = new int[N];

            int left = 0, right = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                left = Math.max(left, A[i]); // 가장 긴 강의가 최소 용량
                right += A[i]; // 모든 강의 합이 최대 용량
            }

            int answer = binarySearch(left, right);
            System.out.println(answer);
        }
    }

    // 이진 탐색으로 최소 블루레이 용량 구하기
    static int binarySearch(int left, int right) {
        int result = right; // 최소값 찾기이므로 최대치로 초기화

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = compare(mid);

            if (cmp <= 0) {
                // M개 이하로 나눌 수 있음 → 줄여볼 수 있음
                result = mid;
                right = mid - 1;
            } else {
                // M개보다 많이 필요함 → 용량이 부족 → 키워야 함
                left = mid + 1;
            }
        }
        return result;
    }

    // compare 함수 (앞서 구현한 것 그대로 사용)
    static int compare(int capacity) {
        int count = 1;
        int sum = 0;

        for (int len : A) {
            if (sum + len > capacity) {
                count++;
                sum = len;
            } else {
                sum += len;
            }
        }
        return count - M;
    }
}
