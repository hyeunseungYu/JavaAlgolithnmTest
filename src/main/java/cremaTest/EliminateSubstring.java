package cremaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EliminateSubstring
{
    public static void main(String[] args) {
        String s = "AWAWSSG";

        String answer = s;
        boolean status = true;

        while (status) {
            status = false;

            String[] split = answer.split("AWS");

            answer = "";

            for (String s1 : split) {
                answer += s1;
            }

            if (answer.contains("AWS")) {
                status = true;
            }
        }

        if (answer.equals("")) {
            answer = "-1";
        }



    }
}
