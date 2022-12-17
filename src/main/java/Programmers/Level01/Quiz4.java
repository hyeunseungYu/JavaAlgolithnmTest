package Programmers.Level01;

import java.util.Arrays;

public class Quiz4 {
    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (String s : participant){
            System.out.println(s);
        }
        for (String s:completion){
            System.out.println(s);
        }

        for (int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                answer = participant[i];
                System.out.println(answer);
                return;}

        }
        answer = participant[participant.length -1];
        System.out.println(answer);
    }

}

//ana mis mis stan
//ana mis stan