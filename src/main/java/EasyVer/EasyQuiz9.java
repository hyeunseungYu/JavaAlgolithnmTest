package EasyVer;

public class EasyQuiz9 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = "";
        String[] numberList = phone_number.split("");


        int changeRequire = numberList.length - 4;
        for (int i = 0; i < changeRequire; i++) {
            numberList[i] = "*";
        }

        for (String s : numberList){
            answer += s;
        }
        System.out.println(answer);


    }
}


