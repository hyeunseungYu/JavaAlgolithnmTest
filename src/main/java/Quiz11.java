public class Quiz11 {
    public static void main(String[] args) {
        long num = 626331;
        int cnt = 0;

        while (cnt <= 500) {
            if (num == 1){
                break;
            }

            if (num%2 == 0){
                num = num/2;
                cnt++;
            } else if (num%2 != 0) {
                num = num*3 +1;
                cnt++;
            }
        }
        cnt = (cnt > 500) ? cnt = -1 : cnt;
        System.out.println(cnt);
    }
}
