package programmers.greedy;

import java.util.ArrayList;
import java.util.List;

public class Quiz01 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        //일단 answer arr 크기는 n의 크기만큼
        //reserve의 요소를 돌면서 +-1만큼의 값이 lost에 있는지 찾음
        //int answer에 그 값을 더하고 reserve의 크기를 더함

        List<Integer> answerArr = new ArrayList<>();

        for (int i = 0; i < lost.length; i++) {
            System.out.println("지금 lost = " +lost[i] );
            for (int j = 0; j < reserve.length; j++) {
                System.out.println("지금 reserve = " + reserve[j]);
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {

                }
            }
        }

        System.out.println(answerArr);

    }
}
