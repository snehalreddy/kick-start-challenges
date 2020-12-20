import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int a[], ans = 0, N;
        for (int i = 0; i < T; i++) {
            ans = 0;
            N = sc.nextInt();
            a = new int[N];

            for (int j = 0; j < N; j++) {
                a[j] = sc.nextInt();
            }

            // some code here

            System.out.println("Case #" + (i + 1) + ": " + ans);

        }
    }
}