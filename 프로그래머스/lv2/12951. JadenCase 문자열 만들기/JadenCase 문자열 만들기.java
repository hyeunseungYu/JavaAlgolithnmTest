import java.util.ArrayList;
class Solution {
    public String solution(String s) {
        String[] lists = s.split("");
        String answer = "";
        ArrayList<String> answerList = new ArrayList<>();

        int index = 0;

        for (String list : lists) {
            index = list.equals(" ") ? 0 : index +1;
            if (index == 1){
                answerList.add(list.toUpperCase());
            }else {
                answerList.add(list.toLowerCase());
            }
        }

        for (String s1 : answerList) {
            answer += s1;
        }
        return answer;
    }
}