//문자열 압축
class Solution {
    public int solution(String s) {
        // 결과 문자열 누적
        StringBuilder result = new StringBuilder();
        // 첫 글자를 기준으로 설정(비교)
        char prev = s.charAt(0); // 현재까지 확인한 문자
        int count = 1; // 연속된 문자 개수

        // 두번째 부터 반복
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i); // 현재 문자
            if (curr == prev) {
                count++; // 연속된 문자 개수 증가
            } else {
                // 이전 문자와 다르면 결과 문자열에 추가
                if (count > 1) {
                    // 반복된 문자가 2번 이상이면 숫자 + 문자
                    result.append(count); // 연속된 문자 개수 추가
                }
                result.append(prev); // 반복되지 않았거나 1번인 문자 추가
                prev = curr; // 현재 문자를 이전 문자로 설정
                count = 1; // 연속된 문자 개수 초기화
            }

        }
        // 마지막 문자 처리(for 종료 후 남은 문자)
        if (count > 1) {
            result.append(count); // 연속된 문자 개수 추가
        }
        result.append(prev); // 마지막 문자 추가
        return result.length(); // 결과 문자열 길이 반환

    }
}