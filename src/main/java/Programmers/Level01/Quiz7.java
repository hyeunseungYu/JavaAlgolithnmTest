package Programmers;

public class Quiz7 {
    public static void main(String[] args) {
        long n = 12345;
        String change = Long.toString(n);

        String[] changeSplit = change.split("");
        int[] answer = new int[changeSplit.length];

//        for (String s : changeSplit){
//            System.out.println(s);
//        }

        for (int i = 0; i < changeSplit.length /2; i++ ){
            String temp = changeSplit[i];
            changeSplit[i] = changeSplit[changeSplit.length -1 -i];
            changeSplit[changeSplit.length -1 -i] = temp;
        }

        for (int i =0; i< changeSplit.length; i++){
            answer[i] = Integer.parseInt(changeSplit[i]);
        }


    }
}
