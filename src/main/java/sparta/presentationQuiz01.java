package sparta;

public class presentationQuiz01 {
    public static void main(String[] args) {
        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < n-i; j++) {
//                System.out.print(" ");
//
//            }
//            for (int k = 0; k < 2*i +1; k++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }

        int i = 0;

        while (i < n) {
            int space = i;
            while (space < n) {
                System.out.print(" ");
                space++;
            }

            int k = 0;

            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }


    }
}
