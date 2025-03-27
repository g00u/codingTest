import java.util.*;

public class Main {
    public static class Solution {
        public int[] solution(int[] arr) {
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];

                if (stack.peek() != num) {
                    stack.push(num);
                }
            }

            int[] answer = new int[stack.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = stack.pop();
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
