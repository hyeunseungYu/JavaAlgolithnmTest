package programmers.greedy;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Quiz01 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,2,3,4,5};

        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여분이 있는 학생이 도난당하면 lost, reserve에서 제거해야함
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }

            }
        }

        System.out.println(answer);
    }
}
