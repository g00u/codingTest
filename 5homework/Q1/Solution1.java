import java.util.HashMap;

class Solution {
    public int solution(String s) {
        // 영단어 → 숫자 매핑을 저장할 HashMap 생성
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        // 문자열 s 내에 영단어가 포함되어 있으면 대응하는 숫자로 바꿔줌
        for (String key : map.keySet()) {
            // replaceAll()은 정규표현식 기반 치환 함수이지만, 여기선 단순 문자열만 있어 안전하게 사용 가능
            s = s.replaceAll(key, map.get(key));
        }

        // 숫자 문자열로 변환된 s를 정수형으로 변환
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
