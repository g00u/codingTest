import java.util.*; // ArrayList 사용을 위한 import

public class Solution {
    public int[] solution(int[] arr) {

        // 중복 제거된 숫자들을 담을 리스트 생성 (크기가 자동으로 늘어나는 리스트)
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        // 이전 숫자를 기억할 변수. 0~9 외 값인 10으로 초기화 (입력 배열에는 없는 값)
        int preNum = 10;

        // 향상된 for문으로 배열 arr의 숫자를 하나씩 꺼냄
        for (int num : arr) {
            // 현재 숫자와 이전 숫자가 다르면 중복이 아니므로 리스트에 추가
            if (preNum != num)
                tempList.add(num);

            // 현재 숫자를 다음 비교를 위해 preNum에 저장
            preNum = num;
        }

        // ArrayList를 int[] 배열로 변환
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < answer.length; i++) {
            // tempList에서 꺼낸 Integer 객체를 int로 변환해서 저장
            answer[i] = tempList.get(i).intValue(); // 또는 그냥 answer[i] = tempList.get(i); 도 됨 (자동 언박싱)
        }

        return answer; // 결과 배열 반환
    }
}
