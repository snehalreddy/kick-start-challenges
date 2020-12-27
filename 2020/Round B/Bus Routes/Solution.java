import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            long ans = 0;
            int N = sc.nextInt();
            long D = sc.nextInt();
            long[] n = new long[N + 1];

            for (int i = 1; i <= N; i++) {
                n[i] = sc.nextLong();
            }

            ans = D;
            for (int i = N; i > 0; i--) {
                ans = ans - (ans % n[i]);
            }

            System.out.println("Case #" + (t + 1) + ": " + ans);
        }
    }
}