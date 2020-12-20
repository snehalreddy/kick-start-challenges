import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int a[], ans = 0, N, K;
        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            K = sc.nextInt();
            ans = 0;

            a = new int[N];

            for (int j = 0; j < N; j++) {
                a[j] = sc.nextInt();
            }

            boolean flag = true;
            for (int j = 0; j < N - K + 1; j++) {
                flag = true;
                for (int k = j; k < j + K; k++) {
                    if (a[k] != K + j - k) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += 1;
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + ans);
        }
    }
}