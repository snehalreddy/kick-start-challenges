import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int a[], ans = 0, N;
        for (int t = 0; t < T; t++) {
            ans = 0;
            N = sc.nextInt();
            a = new int[N];

            for (int j = 0; j < N; j++) {
                a[j] = sc.nextInt();
            }

            if (N == 1) {
                System.out.println("Case #" + (t + 1) + ": " + 1);
                continue;
            }

            int max = a[0];

            if (a[0] > a[1]) {
                ans += 1;
            }

            for (int i = 1; i < N - 1; i++) {
                if (a[i] > max && a[i] > a[i + 1]) {
                    ans += 1;
                    max = a[i];
                }
            }
            if (a[N - 1] > max) {
                ans += 1;
            }

            System.out.println("Case #" + (t + 1) + ": " + ans);
        }
    }
}