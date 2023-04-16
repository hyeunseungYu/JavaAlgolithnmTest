package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort2 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(19, 10, 12, 10, 24, 25, 22);
        sort(arr);
    }

    public static List<Integer> sort(List<Integer> arr) {
        int[] counting = new int[Collections.max(arr) + 1];

        for (int i = 0; i < Collections.max(arr) + 1; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == i) {
                    counting[i]++;
                }
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < counting.length; i++) {
            if (counting[i] != 0) {
                for (int j = 0; j < counting[i]; j++) {
                    answer.add(i);
                }
            }
        }

        System.out.println(arr.size());
        for (int i : counting) {
            System.out.print(i + " ");
            System.out.println();
        }
        output(answer);


        return answer;
    }

    public static void output(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
