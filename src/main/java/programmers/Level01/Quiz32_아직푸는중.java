package programmers.Level01;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz32_아직푸는중 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        ArrayList<Integer> stageList = new ArrayList<>();

        for (int stage : stages) {
            stageList.add(stage);
        }

        ArrayList<Double> checkList = new ArrayList<>();

        for (int i = 0; i <= N+1; i++) {
            checkList.add((double)Collections.frequency(stageList, i));

        }

        System.out.println(checkList);

        ArrayList<Double> failureList = new ArrayList<>();

        for (int i = 0; i < checkList.size(); i++) {
            failureList.add(checkList.get(i) / (stages.length - checkList.get(i)));
        }



        System.out.println(failureList);



    }
}
