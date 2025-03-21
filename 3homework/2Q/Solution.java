import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();
        for (int c : course) {
            Map<String, Integer> map = new HashMap<>();
            // 조합
        }
        // 정렬 후 배열로 변환해서 반환
        Collections.sort(answerList);// new(새롭게 알게 된)! 리스트 정렬 함수 Collections.sort(list)오름차순 정렬(A->Z, 1->9),
                                     // Collections.reverse(list)내림차순 정렬(Z->A, 9->1)
        return answerList.toArray(new String[0]);
    }
}