package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Quiz02 {
    public static void main(String[] args) {
        int[] a = {5, 6, 7};
        int[] b = {3, 6, 10};


        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < b.length; i++) {
            if (a[i] > b[i]) {
                aScore++;
            } else if (b[i] > a[i]) {
                bScore++;
            }
        }
        List<Integer> arr = new ArrayList<>();

        int[] answer = {aScore, bScore};
        System.out.println(answer[0]);
        System.out.println(answer[1]);

    }
}
