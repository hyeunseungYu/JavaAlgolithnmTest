package programmers.Level01;

public class Quiz10 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        if (arr.length == 1){
            int[] answer = {-1};

        }else {
            int[] answer = new int[arr.length - 1];

            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++){
                    int temp = arr[i];
                    if (arr[i] < arr[j]){
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        for (int i : arr){
            System.out.println(i);
        }

            for (int i = 0; i < answer.length; i++){
                answer[i] = arr[i];
            }

            for (int i : answer){
                System.out.println(i);
            }

        }
    }

}
