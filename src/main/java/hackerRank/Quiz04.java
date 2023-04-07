package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz04 {
    public static void main(String[] args) {
        int n = 3;
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> add1 = Arrays.asList(11, 2, 4);
        List<Integer> add2 = Arrays.asList(4, 5, 6);
        List<Integer> add3 = Arrays.asList(10,8,-12);
        arr.add(add1);
        arr.add(add2);
        arr.add(add3);

        int leftToRight = 0;
        int rightToLeft = 0;


        for (int i = 0; i < n; i++) {
            leftToRight += arr.get(i).get(i);
        }


        for (int i = 0; i < n; i++) {
            rightToLeft += arr.get(i).get((n - 1) - i);
        }


        int sum = leftToRight - rightToLeft;

        if (leftToRight - rightToLeft < 0) {
            sum = (leftToRight - rightToLeft) * -1;
        }

        System.out.println(arr.get(0).size());
    }
}
