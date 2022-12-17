package Programmers;

public class Quiz1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        int[] month = new int[12];
        int[] day = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

//        if (a%2 != 0){
//            day = new int[31];
//        } else if (a == 2) {
//            day = new int[29];
//        }else {
//            day = new int[30];
//        }

        int sum = 0;

        for (int i = 0; i < a - 1; i++) {
            sum += day[i];
        }

        int targetDays = sum + b;
        int weekIndex = targetDays%7;
        String answer;

        if(weekIndex == 0){
            answer = week[6];
        }else{
            answer = week[weekIndex - 1];
        }

        System.out.println(answer);



    }


}
