package Programmers;

class Quiz10_1 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(solution(arr));

    }
    public static int[] solution(int[] arr) {
        int min = arr[0];
        int[] answer = new int[arr.length-1];

        if (arr.length <= 1){
            answer = new int[]{-1};
            return answer;
        }

        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }

        int index = 0;

        for (int i =0; i < arr.length; i++){
            if (min == arr[i]){
                continue;
            }else {
                answer[index++] = arr[i];
            }
        }
return answer;
    }
}