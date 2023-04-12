package cremaTest;

import java.util.Arrays;
import java.util.List;

public class LongestSubArray {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3);
        int k = 3;

        int result = findLongestSubarray(a, k);
        System.out.println(result);
    }

    public static int findLongestSubarray(List<Integer> a, int k) {
        int answer = 0;

        int[] arr = new int[a.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.get(i);
        }
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum <= k) {
                    if ((j - i) + 1 > answer) {
                        answer = (j - i) + 1;
                    }
                } else {
                    break;
                }
            }
        }

        return answer;
}
}
