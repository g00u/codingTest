
package cote02;

import java.util.HashSet;

public class pocketmon {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 3 };
        int result = solution(nums);
        System.out.println(result);
    }

    public static int solution(int[] nums) {
        // Set을 이용하여 종류만 셀렉
        HashSet<Integer> uniquePocketmons = new HashSet<>();
        // nums 배열에서 포켓몬 종류 set에 추가
        for (int num : nums) {
            uniquePocketmons.add(num);
        }
        // 최대 선택 2/N
        int maxSelect = nums.length / 2;
        return Math.min(uniquePocketmons.size(), maxSelect);

    }
}
