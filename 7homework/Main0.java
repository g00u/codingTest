import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main0 {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        // 에라토스테네스의 체로 소수 판별 배열 만들기
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        int min = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;

                if (min == 0) {
                    min = i;
                }
            }
        }

        System.out.println(sum);
        System.out.println(min);

        br.close();
    }

}
