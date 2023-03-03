package programmers.Level02;

import java.util.ArrayList;
import java.util.List;

public class Quiz01 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";

        String[] numbers = s.split(" ");


        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        String answer = "";
        answer += min;
        answer += " ";
        answer += max;

        System.out.println(answer);
    }
}
