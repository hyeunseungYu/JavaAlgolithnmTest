package programmers.Level01;

import java.util.ArrayList;

public class Quiz29 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];

       ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int startPoint = commands[i][0] -1;
            int endPoint = commands[i][1] -1;
            int index = commands[i][2] -1;


            ArrayList<Integer>tempList = new ArrayList<>();
            for (int j = startPoint; j <= endPoint; j++){
                tempList.add(array[j]);

            }

            Object[] stream = tempList.stream().sorted().toArray();
            answer[i] = (int) stream[index];


        }




    }
}
