import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int N, a[], prev, next, curr, peaks = 0;
        for (int i = 0; i < T; i++) {
            peaks = 0;

            N = sc.nextInt();
            a = new int[N];

            for (int j = 0; j < N; j++) {
                a[j] = sc.nextInt();
            }

            for (int j = 1; j < N - 1; j++) {
                prev = a[j - 1];
                curr = a[j];
                next = a[j + 1];

                if (prev < curr && curr > next) {
                    peaks += 1;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + peaks);

        }
    }
}