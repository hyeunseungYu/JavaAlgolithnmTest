import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        double[] users = new double[N + 1];

        for (int i : stages) {
            if (i == N + 1) {
                continue;
            }

            users[i]++;
        }

        ArrayList<Double> failList = new ArrayList<>();
        double allUsers = stages.length;
        double minusTemp = 0;

        for (int i = 1; i < users.length; i++) {
            minusTemp = users[i];

            users[i] = users[i] / allUsers;
            allUsers -= minusTemp;

            failList.add(users[i]);
        }

        Collections.sort(failList, Collections.reverseOrder());


        for (int i = 0; i < failList.size(); i++) {
            for (int j = 1; j < users.length; j++) {

                if (failList.get(i) == users[j]) {
                    answer[i] = j;
                    users[j] = -1;
                    break;
                }
            }

        }

        return answer;
    }
}