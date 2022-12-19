package Programmers.Level01;

public class Quiz22 {
    public static void main(String[] args) {
        String s = "23four5six7";
        String[] alphabetList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


        for (int i = 0; i < alphabetList.length; i++) {
            if (s.contains(alphabetList[i])){
                s = s.replace(alphabetList[i], Integer.toString(i));
            }

        }
        int answer = Integer.parseInt(s);
        System.out.println(answer);

    }
}
