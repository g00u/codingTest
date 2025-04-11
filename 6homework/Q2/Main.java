
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 명령의 수

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                if (list.isEmpty()) {
                    System.out.println(0);
                } else {
                    Collections.sort(list); // 정렬
                    System.out.println(list.get(0)); // 가장 작은 수
                    list.remove(0); // 제거
                }
            } else {
                list.add(x); // 숫자 저장
            }
        }
    }
}
