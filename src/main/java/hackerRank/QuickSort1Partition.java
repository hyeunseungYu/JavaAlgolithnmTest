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
        //입력된 리스트가 1보다 작으면 그 리스트를 그대로 반환
        if (arr.size() < 2) {
            return arr;
        }
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

        //나누어진 서브리스트를 재귀 정렬
        List<Integer> sortedLeft = quickSort(left);
        List<Integer> sortedRight = quickSort(right);

        List<Integer> answer = new ArrayList<>();
        answer.addAll(sortedLeft);
        answer.addAll(equal);
        answer.addAll(sortedRight);

        return answer;

    }

    public static void output(List<Integer> arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
