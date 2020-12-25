import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int ans = 0;
            int N = sc.nextInt();
            int K = sc.nextInt();
            int P = sc.nextInt();

            int[][] n = new int[N + 1][K + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= K; j++) {
                    n[i][j] = sc.nextInt();
                }
            }

            int[][] sum = new int[N + 1][K + 1];
            for (int i = 1; i < N + 1; i++) {
                sum[i][0] = n[i][0];
                for (int j = 1; j <= K; j++) {
                    sum[i][j] = sum[i][j - 1] + n[i][j];
                }
            }
//            for (int i = 0; i <= N; i++) {
//                for (int j = 0; j <= K; j++) {
//                    System.out.print(sum[i][j] + " ");
//                }
//                System.out.println();
//            }

            int[][] dp = new int[N + 1][P + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= P; j++) {
                    dp[i][j] = 0;

                    for (int x = 0; x <= Math.min(j, K); x++) {
                        dp[i][j] = Math.max(dp[i][j], (sum[i][x] + dp[i - 1][j - x]));
                    }
                }
            }

//            for (int i = 0; i <= N; i++) {
//                for (int j = 0; j <= P; j++) {
//                    System.out.print(dp[i][j] + " " + i + ":" + j + ", ");
//                }
//                System.out.println();
//            }

            ans = dp[N][P];
            System.out.println("Case #" + (t + 1) + ": " + ans);

        }
    }
}