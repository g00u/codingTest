package homework11;

public class Main {

    static int[] A;
    static int M;

    public static void main(String[] args) {

        A = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        M = 3;

        // 다양한 용량으로 compare 함수 테스트
        compare(9); // 블루레이 용량이 너무 작을 때
        compare(14); // 블루레이 용량이 딱 맞을 때
        compare(27); // 블루레이 용량이 클 때
    }

    // 디버깅용 compare 함수
    static int compare(int capacity) {
        int count = 1; // 블루레이 개수 (최소 1개 필요)
        int sum = 0; // 현재 블루레이에 담긴 강의 길이 합

        System.out.println("블루레이 용량: " + capacity);
        System.out.print(" 블루레이 " + count + ": ");

        for (int len : A) {
            if (sum + len > capacity) {

                count++;
                sum = len;
                System.out.println();
                System.out.print(" 블루레이 " + count + ": " + len + " ");
            } else {
                sum += len;
                System.out.print(len + " ");
            }
        }

        System.out.println("\n필요한 블루레이 수: " + count);
        System.out.println("compare() 결과: " + (count - M));
        System.out.println("--------------");

        return count - M;
    }
}
