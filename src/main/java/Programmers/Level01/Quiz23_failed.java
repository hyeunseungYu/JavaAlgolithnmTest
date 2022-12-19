package Programmers.Level01;

import java.util.*;

public class Quiz23_failed {
    public static void main(String[] args) {
        String s = "AaZz";
        int n = 25;

        char[] answerList = s.toCharArray();


        ArrayList<Integer> upperList = new ArrayList<>();
        ArrayList<Integer> lowerList = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();


        for (int i = 65; i < 91; i++) {
            upperList.add(i);
        }

        for (int i = 97; i < 123; i++) {
            lowerList.add(i);
        }

        for (char c : answerList) {
            if (c == ' ') {
                answers.add(32);
            }
            if (Character.isUpperCase(c)) {
                if ((c + n) > 90) {
                    if ((c+n) %90 > 26){
                        answers.add(upperList.get((c+n) % 90 - 26) -1);
                        break;
                    }
                    answers.add(upperList.get((c+n) % 90) -1);
                    break;
                }
                answers.add(c + n);
            }

            if (Character.isLowerCase(c)) {
                if ((c+n) > 122) {
                    if ((c+n) %90 > 26){
                        answers.add(lowerList.get((c+n) % 122 - 26) -1);
                        break;
                    }
                    answers.add(lowerList.get((c+n) % 122) -1);
                    break;
                }
                answers.add(c + n);
            }
        }
        String answer = "";
        for (int i : answers) {
            answer += (char) i;
        }
        System.out.println(answer);
    }
}
