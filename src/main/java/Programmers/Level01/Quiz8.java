package Programmers.Level01;

public class Quiz8 {
    public static void main(String[] args) {
        long n = 118372;
        String num = Long.toString(n);
        String[] numList = num.split("");
        int[] answerList = new int[numList.length];
        int index = 0;
        for (String s : numList) {

            answerList[index++] = Integer.parseInt(s);
        }


        for (int i = 0; i < numList.length; i++) {
            for (int j = i + 1; j < numList.length; j++) {
                if (answerList[i] < answerList[j]) {
                    int temp = answerList[i];
                    answerList[i] = answerList[j];
                    answerList[j] = temp;
                }
            }
        }

        int Stringindex = 0;
        String[] answerStringList = new String[numList.length];
        for (int s : answerList){
            answerStringList[Stringindex++] = Integer.toString(s);
        }

        String answerString = "";
        for (String s: answerStringList){
            answerString += s;
        }

        long answer = Long.parseLong(answerString);

    }
}
