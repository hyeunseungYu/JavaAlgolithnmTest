package programmers.Level02;

public class Quiz02 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4};

        int size = arr.length;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        double answer = (double)sum / size;

        System.out.println(answer);
    }
}
