import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();
        for (int c : course) {
            Map<String, Integer> map = new HashMap<>();
            // 각 주문 돌기, 길이 c 조합 만들기, map에 추가
            // order 문자열 char 배열로 변환, 정렬(같은 순서 조합)
            // 조합 생성 후 map에 추가 횟수 카운트
            for (String order : orders) {
                char[] orderArr = order.toCharArray();
                Arrays.sort(orderArr);

                genrateCombination(orderArr, 0, c, "", map);

            }

            // 조합 중 가장 많이 나온 것 추가가
            int max = 0;
            for (int count : map.values()) {
                if (count > max) {
                    max = count;
                }
            }
        }
        // 정렬 후 배열로 변환해서 반환
        Collections.sort(answerList);// new(새롭게 알게 된)! 리스트 정렬 함수 Collections.sort(list)오름차순 정렬(A->Z, 1->9),
                                     // Collections.reverse(list)내림차순 정렬(Z->A, 9->1)
        return answerList.toArray(new String[0]); // 리스트를 배열로 변환하는 방법 Stiring[]타입으로 리턴
    }

    // 조합 생성 함수; 주어진 알파벳 배열에서 c개의 조합을 생성하는 함수; 재귀함수
    public void genrateCombination(char[] orderArr, int start, int c, String comb, Map<String, Integer> map) {
        // 정렬된 주문 문자열, 지금까지 만든 조합, 다음에 뽑을 글자 시작위치,
        // 만들고 싶은 조합의 길이, 조합(등장횟수 저장 맵맵)
        if (comb.length() == c) { // 목표로 한 길이 도달달
            map.put(comb, map.getOrDefault(comb, 0) + 1); // 지금 만든 조합 맵 저장
            // 이미 있었으면 기존 횟수를 가져옴, 거기에 +1 해서 횟수 누적적
            return; // 조합 저장했으면 더 이상 글자 붙일 필요 없고, 함수 종료 (재귀 종료)
        }
        for (int i = start; i < orderArr.length; i++) { // 중복 방지 위해 start부터 시작, 앞에 뽑은 글자보다 뒤에 있는 글자만 고르기기
            genrateCombination(orderArr, i + 1, c, comb + orderArr[i], map);// 글자 하나를 붙여서 재귀 호출 , 길이 도달할 때까지 재귀 계속속
        }
    }
}