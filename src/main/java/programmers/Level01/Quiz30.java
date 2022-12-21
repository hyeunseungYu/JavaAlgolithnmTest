package programmers.Level01;

import java.util.ArrayList;

public class Quiz30 {
    public static void main(String[] args) {
        int n = 10;

        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 1){
                answerList.add(i);
            }

        }

        int answer = answerList.get(0);
    }
}
