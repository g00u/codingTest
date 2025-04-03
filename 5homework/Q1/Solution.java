// 코딩테스트 숫자 문자열과 영단어

class Solution {
    public int solution(String s) {
        // 숫자에 대응하는 영단어를 인덱스 순서대로 배열에 저장
        // 0: zero, 1: one, 2: two, ..., 9: nine
        String[] num = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        // 배열을 반복하면서 문자열에 해당 영단어가 있으면 숫자로 치환
        for (int i = 0; i < num.length; i++) {
            // String.replace() 메서드를 사용하여 영단어를 숫자로 치환
            // replace() 메서드는 문자열을 변경하지 않고 새로운 문자열을 반환하므로
            // 원래 문자열을 변경하려면 반환된 문자열을 다시 변수에 저장해야 함
            // 즉, s = s.replace(num[i], Integer.toString(i));와 같이 사용
            s = s.replace(num[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("one4seveneight")); // 1478
        System.out.println(sol.solution("23four5six7")); // 234567
        System.out.println(sol.solution("2three45sixseven")); // 234567
        System.out.println(sol.solution("123")); // 123
    }
}