package Programmers;

import java.util.ArrayList;

public class Quiz13_memoryError {
    public static void main(String[] args) {
        long n = 125;
        long answer = 0;
        ArrayList<Long> base3List = new ArrayList<>();

        while (true){
            base3List.add(n%3);
            n = n/3;
            if (n == 1){
                base3List.add(n);
                break;
            }
        }

//        for (long i : base3List){
//            System.out.println(i);
//        }


        long index = 0;

        for (long L : base3List){
            answer += (long) (L * Math.pow(3, base3List.size()- (1 + (index++))));
            System.out.println(answer);
        }

//        for (long i = 0; i < base3List.size(); i++){
//
//            answer = base3List. * Math.pow(3, base3List.size()-1);
//            System.out.println(answer);
//        }

    }
}
