package hackerRank;

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart2 {
    public static void main(String[] args) {
        int n = 7;
        List<Integer> arr = Arrays.asList(3, 4, 7, 5, 6, 2, 1 );

        int[] convert = new int[arr.size()];

        for (int i = 0; i < convert.length; i++) {
            convert[i] = arr.get(i);
        }

        for (int i = 1; i < convert.length; i++) {
            int key = convert[i];
            int j = i - 1;

            while (j >= 0 && convert[j] > key) {
                convert[j + 1] = convert[j];
                j--;
            }
            convert[j + 1] = key;

            for (int k = 0; k < convert.length; k++) {
                System.out.print(convert[k] + " ");
            }
            System.out.println();

        }
    }
}
