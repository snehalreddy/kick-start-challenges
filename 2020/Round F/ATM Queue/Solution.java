import java.util.*;

class Person {
    int position;
    int times;

    Person(int position, int times) {
        this.position = position;
        this.times = times;
    }

}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.times == p2.times) {
            return p1.position - p2.position;
        }
        return p1.times - p2.times;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            List<Integer> ans = new ArrayList<>();
            int N = sc.nextInt();
            int X = sc.nextInt();

            ArrayList<Person> people = new ArrayList<Person>();

            for (int i = 0; i < N; i++) {
                int cash = sc.nextInt();
                Person p = new Person(i, (int)Math.ceil((double)cash / X));
//                System.out.println(p.position + " " + p.times);
                people.add(p);
            }

            Collections.sort(people, new PersonComparator());

            System.out.print("Case #" + (t + 1) + ": ");
            for (Person a : people) {
                System.out.print((a.position + 1) + " ");
            }

//            while (!cash.isEmpty()) {
//                if (cash.get(0) <= X) {
//                    ans.add(indices.get(0));
//                    cash.remove(0);
//                    indices.remove(0);
//                } else {
//                    tempCash = cash.get(0) - X;
//                    tempIndex = indices.get(0);
//                    cash.remove(0);
//                    indices.remove(0);
//                    cash.add(tempCash);
//                    indices.add(tempIndex);
//                }
//            }
//
//
//            System.out.print("Case #" + (t + 1) + ": ");
//            for (int a : ans) {
//                System.out.print((a + 1) + " ");
//            }
            System.out.println();
        }
    }
}