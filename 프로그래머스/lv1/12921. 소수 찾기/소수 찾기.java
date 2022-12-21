import java.util.*;
class Solution {
    public int solution(int n) {
      int answer = 0;

        int[] tempList = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (tempList[i] == 0) {
                answer++;
               for(int j = i + i; j <=n; j += i){
                   tempList[j] = 1;
               }
            }

        }
        return answer;
    }
}