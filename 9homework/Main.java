public class Main {

    // 카드 수, 목표 숫자, 최대 합 변수
    static int N = 5;
    static int M = 21;
    static int[] cards = { 5, 6, 7, 8, 9 }; // 카드 값 배열
    static int max = 0;

    public static void main(String[] args) {
        // 재귀 함수 호출 시작
        recur(0, 0, 0);

        // 최댓값 출력
        System.out.println(max);
    }

    static void recur(int i, int count, int sum) {
        // 카드 3장을 모두 선택했을 경우 종료
        if (count == 3) {
            // 합이 M 이하인 경우에만 최대값 갱신
            if (sum <= M) {
                max = Math.max(max, sum);
            }
            return;
        }
        if (i >= N)
            return;
        // 선택하지 않는 경우 (X)
        recur(i + 1, count, sum);

        // 선택하는 경우 (O)
        recur(i + 1, count + 1, sum + cards[i]);
    }
}
