package programmers.Level01;

import java.util.ArrayList;

public class Quiz33 {
    public static void main(String[] args) {
        int n = 5;

        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;


        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = (fibo[i - 2] + fibo[i - 1]) %1234567;

        }

       int answer = fibo[n];
    }
}
