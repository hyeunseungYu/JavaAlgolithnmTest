package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 3, 2, 1);
        counting(arr);
    }

    public static List<Integer> counting(List<Integer> arr) {
        int[] answer = new int[100];

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == i) {
                    answer[i]++;
                }
            }
        }
        output(answer);

        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            answerList.add(answer[i]);
        }
        return answerList;
    }

    public static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
