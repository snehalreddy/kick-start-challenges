import java.util.Scanner;

import static java.util.Arrays.sort;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int N, B, a[], sum = 0;
        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            B = sc.nextInt();
            a = new int[N];
            sum = 0;

            for (int j = 0; j < N; j++) {
                a[j] = sc.nextInt();
            }

            sort(a);

            int j;
            for (j = 0; j < N; j++) {
                if ((sum + a[j]) > B) {
                    System.out.println("Case #" + (i + 1) + ": " + (j));
                    break;
                } else {
                    sum += a[j];
                }
            }

            if (j == N) {
                System.out.println("Case #" + (i + 1) + ": " + (j));
            }
        }

    }
}
