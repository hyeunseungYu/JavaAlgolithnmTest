package programmers.Level01;

import java.util.ArrayList;

public class Quiz23_프로그래머스Lv1시저암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;

//      먼저 소스가 되는 스트링을 띄어쓰기 포함 문자별로 자름
//      자르고 리스트를 만들어 줌
        String[] sSplit = s.split("");
        ArrayList<String> sList = new ArrayList<>();

        for (String s1 : sSplit) {
            sList.add(s1);
        }

//      알파벳 대소문자 리스트도 만들어 줌
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


//       띄어쓰기가 있다면 띄어쓰기 그대로 answer에 추가해줌.
//       소문자인 경우, 해당 char가 소문자 알파벳 배열의 몇 번째 값인지 찾아줌.
//       그리고 거기에 n만큼 더해준다.
//       n이 알파벳 수인 26을 벗어나는 경우가 있으니, 최종 인덱스 값은 n을 더한 값을 26으로 나눈 나머지로 해 준다.
//       그리고 answer에 해당하는 인덱스의 값을 붙여준다.
//       대문자도 소문자와 마찬가지

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


    }
}
