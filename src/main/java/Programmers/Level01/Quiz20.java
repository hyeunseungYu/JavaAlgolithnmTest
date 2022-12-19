package Programmers.Level01;

import java.util.*;


public class Quiz20 {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        String[] sList =s.split("");

        String[] answerList = Arrays.stream(sList).sorted(Comparator.reverseOrder())
                                                    .toArray(a -> new String[a]);

        String answer = "";

        for (String s1 : answerList) {
            answer += s1;
        }


    }
}
