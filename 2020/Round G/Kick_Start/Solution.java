import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int ans = 0;
            String s = sc.next();
//            System.out.println(s);

            List<Integer> indicesKick = new ArrayList<>();
            int index = s.indexOf("KICK");
            while (index >= 0) {
                indicesKick.add(index);
                index = s.indexOf("KICK", index + 3);
            }

            List<Integer> indicesStart = new ArrayList<>();
            index = s.indexOf("START");
            while (index >= 0) {
                indicesStart.add(index);
                index = s.indexOf("START", index + 3);
            }

            for (int i : indicesKick) {
                for (int k : indicesStart) {
                    if (k > i) {
                        ans += 1;
                    }
                }
            }


            // some code here

            System.out.println("Case #" + (t + 1) + ": " + ans);

        }
    }
}