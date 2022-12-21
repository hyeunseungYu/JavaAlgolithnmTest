package programmers.Level01;

import java.util.ArrayList;
import java.util.Comparator;

public class Quiz28 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;

        ArrayList<Integer> nList = new ArrayList<>();
        ArrayList<Integer> mList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                nList.add(i);
            }
        }

        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                mList.add(i);
            }

        }

        ArrayList<Integer> divisorList = new ArrayList<>();

        for (int i = 0; i < nList.size(); i++) {
            for (int j = 0; j < mList.size(); j++) {
                if (nList.get(i).equals(mList.get(j))) {
                    divisorList.add(mList.get(j));
                }

            }

        }

        Object[] stream = divisorList.stream().sorted(Comparator.reverseOrder()).toArray();

        int lcd = (int) stream[0];

        int lcm = n* m / lcd;



        int[] answer = new int[]{lcd, lcm};

        for (int i : answer) {
            System.out.println(i);
        }










    }
}
