package homework10;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        // 테스트용 입력
        int[] numbers = { 2, 1, 3, 4, 1 };
        Solution sol = new Solution();
        sol.solution(numbers);
    }

    List<Integer> result = new ArrayList<>();
    int[] numbers;

    public int[] solution(int[] numbers) {
        this.numbers = numbers;

        // DFS 시작
        dfs(0, new ArrayList<>());

        // 결과 출력
        System.out.println("합계 목록 : " + result);

        // 실제 반환은 의미 없음 (시각화 용도)
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    // 두 개 고르기 위한 DFS
    void dfs(int index, List<Integer> selected) {
        if (selected.size() == 2) {
            int sum = selected.get(0) + selected.get(1);
            result.add(sum); // 선택된 두 수의 합을 결과 목록에 추가
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            selected.add(numbers[i]);
            dfs(i + 1, selected); // 조합: i+1부터
            selected.remove(selected.size() - 1);
        }
    }
}
