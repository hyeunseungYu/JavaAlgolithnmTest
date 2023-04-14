package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort1Partition {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(4, 5, 3, 7, 2);
        List<Integer>answer = quickSort(arr);

        output(answer);

    }

    public static List<Integer> quickSort(List<Integer> arr) {
        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = Arrays.asList(pivot);


        for (Integer integer : arr) {
            if (pivot > integer) {
                left.add(integer);
            } else if (integer > pivot) {
                right.add(integer);
            }
        }

        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(equal);
        answer.addAll(right);

        return answer;

    }

    public static void output(List<Integer> arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
