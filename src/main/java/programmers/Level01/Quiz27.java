package programmers.Level01;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz27 {
    public static void main(String[] args) {
        int[] d = {1,2,3,4};
        int budget = 15;

        int max = 0;

        int target = budget;

        int[] dStream = Arrays.stream(d).sorted().toArray();

        ArrayList<Integer> dList = new ArrayList<>();

        for (int i : dStream) {
            dList.add(i);
        }

        int left = budget;
        int cnt = 0;

        for (Integer integer : dList) {
            if (left < 0){
                break;
            }else {
                left -= integer;
                cnt++;
            }
        }

        int answer = 0;

        if (left < 0){
            answer = cnt -1;
        }else {
            answer = cnt;
        }

        System.out.println(answer);

    }
}
