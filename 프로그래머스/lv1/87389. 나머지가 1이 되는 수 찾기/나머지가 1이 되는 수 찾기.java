import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 1){
                answerList.add(i);
            }

        }

        int answer = answerList.get(0);
        return answer;
    }
}