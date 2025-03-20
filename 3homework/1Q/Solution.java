
// K번째 수
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 정답을 담을 배열

        for (int c = 0; c < commands.length; c++) {
            // i, j, k를 commands 배열에서 가져옴
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];

            // 배열의 i~j 부분을 잘라서 새 배열 temp에 저장
            int[] temp = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(temp); // 잘라낸 배열 정렬
            answer[c] = temp[k - 1]; // k번째 수를 결과 배열에 저장
        }

        return answer;
    }

    // 실행을 위한 main 메서드 추가
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 예제 입력
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = {
                { 2, 5, 3 },
                { 4, 4, 1 },
                { 1, 7, 3 }
        };

        // solution 메서드 실행 후 결과 출력
        int[] result = sol.solution(array, commands);
        System.out.println(Arrays.toString(result)); // [5, 6, 3] 출력
    }
}