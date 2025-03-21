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

            }
        }
        // 정렬 후 배열로 변환해서 반환
        Collections.sort(answerList);// new(새롭게 알게 된)! 리스트 정렬 함수 Collections.sort(list)오름차순 정렬(A->Z, 1->9),
                                     // Collections.reverse(list)내림차순 정렬(Z->A, 9->1)
        return answerList.toArray(new String[0]); // 리스트를 배열로 변환하는 방법 Stiring[]타입으로 리턴
    }
}