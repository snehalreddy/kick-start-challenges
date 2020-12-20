import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int ans = 0;
            int N = sc.nextInt();
            int[] a = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            // some code here

            System.out.println("Case #" + (t + 1) + ": " + ans);

        }
    }
}