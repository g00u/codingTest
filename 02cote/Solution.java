
package cote02;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int solution(int[] nums) {
        // Set을 이용하여 종류만 셀렉
        Set<Integer> uniquePocketmons = new HashSet<>();
        // nums 배열에서 포켓몬 종류 set에 추가
        for (int num : nums) {
            uniquePocketmons.add(num);
        }
        // 최대 선택 2/N
        int maxSelect = nums.length / 2;
        return Math.min(uniquePocketmons.size(), maxSelect);

    }
}
