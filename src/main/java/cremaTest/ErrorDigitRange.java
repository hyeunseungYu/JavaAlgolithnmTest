package cremaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorDigitRange {
    public static void main(String[] args) {
        long num = 3000000000L;

        String stringNum = Long.toString(num);

        List<Long> answerArr = new ArrayList<>();
        int originalLength = stringNum.length();

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == j) {
                    continue;
                }
                String temp = stringNum.replaceAll(String.valueOf(i), String.valueOf(j));
                long value = Long.parseLong(temp);
                if (Long.toString(value).length() == originalLength) {
                    answerArr.add(value);
                }

            }
        }
        long maxValue = Collections.max(answerArr);
        long minValue = Collections.min(answerArr);

        long answer = maxValue - minValue;
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(answerArr);
        System.out.println(answer);
    }
}
