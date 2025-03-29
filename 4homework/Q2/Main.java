import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>(); // 괄호를 저장할 스택 생성

        // 문자열 s를 하나씩 다 확인
        for (char c : s.toCharArray()) {
            // 여는 괄호일 경우 스택에 추가
            if (c == '(') {
                stack.push(c);

            } else {
                // 닫는 괄호가 나왔을 때
                // 스택이 비어있다면? 짝이 맞지 않는 경우
                if (stack.isEmpty()) {
                    return false;
                }
                // 짝이 되는 여는 괄호 하나를 꺼냄
                stack.pop();
            }
        }
        return stack.isEmpty(); // 스택이 비어있으면 모든 괄호가 짝이 맞는 것
        // 스택에 남아있는 여는 괄호가 있으면 false 반환

    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("(())()")); // true
        System.out.println(sol.solution(")()(")); // false
        System.out.println(sol.solution("(()(")); // false
    }
}
