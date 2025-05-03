
import java.util.Scanner;

// 클래스 이름은 반드시 Main으로 작성 (백준 제출 시 규칙)
public class Main {

    // 전역 변수 선언
    static int N; // 카드의 개수
    static int M; // 목표 합 (M 이하의 합이어야 함)
    static int[] cards; // 카드 값들이 저장된 배열
    static int max = 0; // 조건(M 이하) 내에서 3장 조합의 최대 합을 저장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기: 카드 수(N)와 목표 합(M)
        N = sc.nextInt();
        M = sc.nextInt();

        // 카드 배열 초기화 및 카드 값 입력
        cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        /*
         * 재귀 호출 시작:
         * idx = 0 → 아직 어떤 카드도 선택하지 않은 상태, 즉 배열의 0번 인덱스부터 선택 시작
         * count = 0 → 아직 고른 카드의 개수는 0개
         * sum = 0 → 선택한 카드의 합은 0
         */
        recur(0, 0, 0);

        // 최종적으로 M 이하인 카드 3장 조합 중 최대 합 출력
        System.out.println(max);
    }

    /**
     * 재귀 함수 설명:
     * 
     * @param idx   : 현재 선택할 카드의 시작 인덱스 (중복 조합 방지를 위해 이전에 선택한 카드보다 뒤쪽 인덱스만 고려)
     * @param count : 현재까지 선택한 카드의 개수 (3장이 되면 종료 조건)
     * @param sum   : 지금까지 선택한 카드들의 합 (조건 검사에 사용)
     *
     *              이 함수는 idx부터 시작하여, 중복 없이 3장 조합을 생성하고,
     *              각 조합의 합(sum)이 목표 M 이하이면 최대합(max)을 갱신한다.
     */
    static void recur(int idx, int count, int sum) {
        // 종료 조건: 카드 3장을 모두 선택했을 경우
        if (count == 3) {
            // 만약 3장 선택 후 합이 M 이하이면, max를 갱신
            if (sum <= M) {
                max = Math.max(max, sum);
            }
            return;
        }

        // 현재 idx부터 N - 1까지 반복:
        // 이로 인해 이전에 선택한 카드보다 오른쪽에 있는 카드들만 고려하게 됨 → 중복 조합 제거
        for (int i = idx; i < N; i++) {
            // 카드 i를 선택한 경우:
            // 다음 재귀 호출 시, 시작 인덱스는 i + 1로, 선택한 카드 개수는 1 증가, 합도 cards[i]만큼 증가시킴
            recur(i + 1, count + 1, sum + cards[i]);
        }
    }
}
