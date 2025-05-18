package homework10_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 테스트 입력
        int[] numbers = { 2, 1, 3, 4, 1 };

        // solution 함수 호출
        Solution sol = new Solution();
        int[] result = sol.solution(numbers);

        // 결과 출력
        System.out.println("최종 결과 (중복 제거 + 정렬): " + Arrays.toString(result));
    }
}

class Solution {
    Set<Integer> sumSet = new HashSet<>();
    int[] numbers;

    public int[] solution(int[] numbers) {
        this.numbers = numbers;

        // DFS 시작
        dfs(0, new ArrayList<>());

        // Set → List → 정렬
        List<Integer> sorted = new ArrayList<>(sumSet);
        Collections.sort(sorted);

        // List → int[]
        int[] answer = new int[sorted.size()];
        for (int i = 0; i < sorted.size(); i++) {
            answer[i] = sorted.get(i);
        }

        return answer;
    }

    void dfs(int index, List<Integer> selected) {
        if (selected.size() == 2) {
            int sum = selected.get(0) + selected.get(1);
            sumSet.add(sum); // 중복 제거
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            selected.add(numbers[i]);
            dfs(i + 1, selected); // 조합: i+1
            selected.remove(selected.size() - 1);
        }
    }
}
