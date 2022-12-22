package programmers.Level01;

public class Quiz33_시간초과 {
    public static void main(String[] args) {
        int n = 3;
        int answer = 0;

        answer = fiboReturn(n);

        System.out.println(answer);
    }

    public static int fiboReturn(int n) {
        if (n < 2) {
            return n% 1234567;
        } else {
            return (fiboReturn((n - 2)) + fiboReturn(n - 1)) % 1234567;
        }


    }
}


