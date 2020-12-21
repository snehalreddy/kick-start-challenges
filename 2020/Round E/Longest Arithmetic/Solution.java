import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

            List<Integer> countList = new ArrayList<Integer>();
            int count = 2;
            int diff = a[0] - a[1];

            for (int i = 1; i < N - 1; i++) {
                int diffConsec = a[i] - a[i + 1];
                if (diffConsec != diff) {
                    diff = diffConsec;
                    // add count to countList
                    countList.add(count);
                    count = 1;
                    // System.out.println(diffConsec + " " + a[i] + " " + a[i + 1]);
                }
                count += 1;
            }
            countList.add(count);

            ans = Collections.max(countList);
            System.out.println("Case #" + (t + 1) + ": " + ans);
        }
    }
}