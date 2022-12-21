package sparta;

public class presentationQuiz02 {
    public static void main(String[] args) {
        int N = 11;

        int answer = 0;

        while (true){
            if (N % 5 == 0){
                answer += N /5;
                break;

            }else {
                N -= 3;
                answer++;

                if (N < 0){
                    answer = -1;
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
