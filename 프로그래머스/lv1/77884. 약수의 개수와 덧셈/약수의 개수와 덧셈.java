import java.util.*;
class Solution {
    public int solution(int left, int right) {
        ArrayList<Integer> srcList = new ArrayList<>();

            for (int i = left; i <= right; i++) {
                srcList.add(i);
            }

            System.out.println(srcList);

            ArrayList<Integer> divisorList = new ArrayList<>();

            for (int i = 0; i < srcList.size(); i++) {
                int cnt = 0;
                for (int j = 1; j <= srcList.get(i); j++) {
                    if (srcList.get(i) % j == 0) {
                        cnt++;
                    }
                }
                divisorList.add(cnt);
            }

            int answer = 0;

            for (int i = 0; i < divisorList.size(); i++) {
                if (divisorList.get(i) % 2 == 0){
                    answer += srcList.get(i);
                }else {
                    answer -= srcList.get(i);
                }

            }
        return answer;
    }
}