package Programmers;

public class Quiz6 {
    public static void main(String[] args) {
        int n = 987;
        int answer = 0;
        String change = Integer.toString(n);
        String[] changeSplit = change.split("");

        int[] answerList = new int[changeSplit.length];

        for (int i = 0; i<answerList.length; i++){
            answerList[i] = Integer.parseInt(changeSplit[i]);
        }

        for (int i : answerList){
            answer += i;
            System.out.println(answer);
        }
    }
}
