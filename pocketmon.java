
package cote02;

import java.util.HashSet;
import java.util.Set;

public class pocketmon {
    public static void main(String[] args) {
        int[] nums1 = { 3, 1, 2, 3 };
        System.out.println(solution(nums1));

        int[] nums2 = { 3, 3, 3, 2, 2, 4 };
        System.out.println(solution(nums2));

        int[] nums3 = { 3, 3, 3, 2, 2, 2 };
        System.out.println(solution(nums3));

    }

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
