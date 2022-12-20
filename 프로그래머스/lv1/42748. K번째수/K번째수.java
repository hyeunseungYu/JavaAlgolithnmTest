import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
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

        return answer;
    }
}