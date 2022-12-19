import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String[] sSplit = s.split("");
        ArrayList<String> sList = new ArrayList<>();

        for (String s1 : sSplit) {
            sList.add(s1);
        }


        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String[] lowerSplit = lower.split("");
        String[] upperSplit = upper.split("");


        ArrayList<String> lowerList = new ArrayList<>();
        ArrayList<String> upperList = new ArrayList<>();


        for (String s1 : lowerSplit) {
            lowerList.add(s1);
        }

        for (String s1 : upperSplit) {
            upperList.add(s1);
        }


        String answer = "";

        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).equals(" ")) {
                answer += " ";
            }
            if (lowerList.contains(sList.get(i))) {
                int index = lowerList.indexOf(sList.get(i));
                int src = index + n;
                int result = src % 26;

                answer += lowerList.get(result);
            }

            if (upperList.contains(sList.get(i))) {
                int index = upperList.indexOf(sList.get(i));
                int src = index + n;
                int result = src % 26;

                answer += upperList.get(result);
            }
            
        }

        return answer;
    }
}