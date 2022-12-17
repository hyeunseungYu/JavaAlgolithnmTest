import java.util.LinkedList;
import java.util.Queue;

public class Quiz13_memoryError2 {
    public static void main(String[] args) {
        int n = 125;
        int listSize = 0;
        int answer = 0;
        Queue<Integer> base3List = new LinkedList<>() {
        };

        while (true){
            listSize++;
            base3List.add(n % 3);
            n = n/3;
            if (n == 1){
                listSize++;
                base3List.add(n);
                break;
            }
        }

        for (int i = 0; i < listSize; i++){
            answer += (int) (base3List.poll() * Math.pow(3, listSize - (1+i)));
            System.out.println(answer);
        }








//        for (int i = 0; i < base3List.size(); i++){
//            answer = base3List[i];
//            System.out.println(answer);
//        }



    }
}
