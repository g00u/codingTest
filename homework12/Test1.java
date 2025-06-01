package homework12;

public class Test1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] map1 = {
                { 1, 1, 1 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };
        System.out.println("Test 1 결과: " + sol.solution(map1));

        int[][] map2 = {
                { 1, 0 },
                { 0, 1 }
        };
        System.out.println("Test 2 결과: " + sol.solution(map2));

        int[][] map3 = {
                { 1, 1 },
                { 1, 1 }
        };
        System.out.println("Test 3 결과: " + sol.solution(map3));

        int[][] map4 = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        System.out.println("Test 4 결과: " + sol.solution(map4));
        // Test 5
        int[][] map5 = {
                { 1, 1, 1 },
                { 0, 0, 1 },
                { 1, 1, 1 }
        };
        System.out.println("Test 5결과: " + sol.solution(map5));

        int[][] map6 = {
                { 1, 1, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println("Test 6  결과: " + sol.solution(map6));

    }

}
