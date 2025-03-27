import java.util.*;

public class Main {
    public static class Solution {
        public int[] solution(int[] arr) {
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                // 스택이 비어있거나, 스택의 top이 현재 숫자와 다르면 스택에 추가
                // isEmpty()로 먼저 체크해야 NullPointerException이 발생하지 않음
                if (stack.isEmpty() || stack.peek() != num) {
                    stack.push(num);
                }
            }

            int[] answer = new int[stack.size()]; // 스택의 크기만큼 배열 생성
            for (int i = 0; i < answer.length; i++) { // 스택의 크기만큼 반복
                answer[i] = stack.get(i); // 스택은 인덱스로 접근이 불가능하므로 get()을 사용
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(new int[] { 1, 1, 3, 3, 0, 1, 1 });
        System.out.println(Arrays.toString(result));
    }
}
