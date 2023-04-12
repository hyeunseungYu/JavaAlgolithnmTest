package cremaTest;

public class EliminateSubstringRe
{
    public static void main(String[] args) {
        String s = "AWAWSSG";

        String answer = s;
        boolean status = true;


        while (status) {
            status = false;

            int index = answer.indexOf("AWS");
            while (index >= 0) {
                answer = answer.substring(0, index) + answer.substring(index + 3);
                index = answer.indexOf("AWS");
                status = true;
            }

        }

        if (answer.equals("")) {
            answer = "-1";
        }

        System.out.println(answer);


    }
}
