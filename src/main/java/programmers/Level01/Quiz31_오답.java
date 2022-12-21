package programmers.Level01;

import java.util.ArrayList;

public class Quiz31_오답 {
    public static void main(String[] args) {
        int n = 5;

        int answer = 0;
        int[] tempList = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (tempList[i] == 0){
                answer++;
                for (int j = i+i; j <= n; j += i) {
                    tempList[j] = 1;
                }

            }

        }


        System.out.println(answer);


    }
}
