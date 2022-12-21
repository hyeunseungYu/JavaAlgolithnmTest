package programmers.Level01;

public class Quiz9 {
    public static void main(String[] args) {
        long n = 3;
        long answer = 0;
        for (long i = 0; i <= n; i++){
            if (i * i == n) {
                answer += (i + 1) * (i + 1);
                System.out.println(answer);
                return;
            }
        }
        answer += -1;
        System.out.println(answer);
    }
}


