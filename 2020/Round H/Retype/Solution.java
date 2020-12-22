import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int ans = 0;
            int N = sc.nextInt();
            int K = sc.nextInt();
            int S = sc.nextInt();

            if (K - S <= K / 2) {
//                go back
                ans = (K - S) + N - S + K;
            } else {
//                start again, +1 for restart
                ans = N + K;
            }

            System.out.println("Case #" + (t + 1) + ": " + ans);

        }
    }
}