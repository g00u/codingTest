class Solution {
    public int solution(String s) {
        // 문자열이 압축이 하나도 안 될 때는 원래 길이가 최소
        int minLength = s.length();

        // 압축 단위를 1부터 문자열 길이의 절반까지 시도
        for (int step = 1; step <= s.length() / 2; step++) {
            StringBuilder compressed = new StringBuilder(); // 압축 결과 저장
            String prev = s.substring(0, step); // 기준 문자열 (첫 블록)
            int count = 1; // 반복 횟수

            // step 단위로 문자열 자르며 반복
            for (int i = step; i <= s.length() - step; i += step) {
                // 현재 블록 추출
                String curr = s.substring(i, i + step);

                // 이전 블록과 같으면 count 증가
                if (curr.equals(prev)) {
                    count++;
                } else {
                    // 같지 않으면 압축 문자열에 결과 추가
                    if (count > 1) {
                        compressed.append(count); // 반복된 횟수
                    }
                    compressed.append(prev); // 블록 문자열
                    prev = curr; // 기준 블록 변경
                    count = 1; // 반복 횟수 초기화
                }
            }

            // 마지막 남은 블록 처리
            if (count > 1) {
                compressed.append(count);
            }
            compressed.append(prev);

            // 문자열이 step 단위로 나누어 떨어지지 않는 경우,
            // 남은 문자열은 그대로 붙인다
            if (s.length() % step != 0) {
                compressed.append(s.substring(s.length() - s.length() % step));
            }

            // 최소 길이 갱신
            minLength = Math.min(minLength, compressed.length());
        }

        // 압축 후 최소 문자열 길이 반환
        return minLength;
    }
}
