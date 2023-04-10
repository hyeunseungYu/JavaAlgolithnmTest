package hackerRank;

import java.util.Arrays;
import java.util.List;

public class Quiz05 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0,0,-1,1,1);

        int size = arr.size();
        double plus = 0;
        double minus = 0;
        double zero = 0;

        for (Integer integer : arr) {
            if (integer > 0) {
                plus++;
            } else if (integer < 0) {
                minus++;
            } else {
                zero++;
            }
        }

        double one = (double) Math.round((plus / size) * 1000000) / 1000000;
        double two = (double) Math.round((minus / size) * 1000000) / 1000000;
        double three = (double) Math.round((zero / size) * 1000000) / 1000000;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }
}
