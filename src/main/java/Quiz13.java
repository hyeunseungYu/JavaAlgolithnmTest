
import java.util.*;
public class Quiz13_memoryError3 {
    public static void main(String[] args) {
        int n = 125;
        int answer = 0;

        ArrayList<Integer> answerList = new ArrayList<>();
        while(true){
            if(n < 3){
                answerList.add(n);
                break;
            }
            answerList.add(n%3);
            n = n/3;
        }

        for(int i = 0; i< answerList.size(); i++){
            answer += (Math.pow(3, answerList.size()-1-i) * answerList.get(i));

        }


    }
}
