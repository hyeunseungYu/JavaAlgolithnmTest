package programmers.Level01;

import java.util.ArrayList;

public class Quiz31 {
    public static void main(String[] args) {
        int n = 5;

        int answer = 0;
        ArrayList<Integer> test = new ArrayList<>();
        int[] tempList = new int[n + 1];

        for (int i = 2; i*i <= n; i++) {
            if (tempList[i] == 1){
                continue;
            }
                for (int j = i * i; j <= n; j += i) {
                    tempList[j] = 1;
                }


        }

        for (int i = 2; i <= n; i++) {
            if (tempList[i] == 0){
                test.add(i);
            }

        }

        System.out.println(test);


    }
}
