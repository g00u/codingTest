
package cote02_1;

import java.util.HashMap;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>(); // ① 선수 이름과 개수를 저장할 HashMap 생성

        for (String p : participant) { // ② 참가자 리스트를 순회하며 HashMap에 저장
            map.put(p, map.getOrDefault(p, 0) + 1);
            // 기존에 이름이 있으면 +1 증가, 없으면 0+1로 초기화
        }

        for (String c : completion) { // ③ 완주한 선수 리스트를 순회하며 HashMap에서 개수를 감소
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) { // ④ HashMap을 순회하면서 값이 1인 선수 찾기
            if (map.get(key) == 1) {
                return key; // 완주하지 못한 선수 반환
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] participant = { "leo", "kiki", "eden" };
        String[] completion = { "eden", "kiki" };

        String result = solution(participant, completion);
        System.out.println("완주하지 못한 선수: " + result);
    }
}
