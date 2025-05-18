package homework10_1;

import java.util.*;

class Solution {
    Set<Integer> sumSet = new HashSet<>();
    int[] numbers;

    public int[] solution(int[] numbers) {
        this.numbers = numbers;

        // 조합 DFS 시작
        dfs(0, new ArrayList<>());

        // Set → List로 변환 후 정렬
        List<Integer> sorted = new ArrayList<>(sumSet);
        Collections.sort(sorted);

        // List → int[] 변환
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
            dfs(i + 1, selected);
            selected.remove(selected.size() - 1);
        }
    }
}
