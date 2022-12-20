import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int max = 0;

        int target = budget;

        int[] dStream = Arrays.stream(d).sorted().toArray();

        ArrayList<Integer> dList = new ArrayList<>();

        for (int i : dStream) {
            dList.add(i);
        }

        int left = budget;
        int cnt = 0;

        for (Integer integer : dList) {
            if (left < 0){
                break;
            }else {
                left -= integer;
                cnt++;
            }
        }

        int answer = 0;

        if (left < 0){
            answer = cnt -1;
        }else {
            answer = cnt;
        }
        return answer;
    }
}