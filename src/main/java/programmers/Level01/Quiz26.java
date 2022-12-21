package programmers.Level01;

import java.util.ArrayList;

public class Quiz26 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(5));

    }

    static class Solution {
        public int solution(int n){
            ArrayList<Integer> divisorList = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0){
                    divisorList.add(i);
                }

            }

            int answer = 0;

            for (int i : divisorList) {
                answer += i;
            }
            return answer;
        }
    }
}
