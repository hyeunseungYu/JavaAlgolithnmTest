class Solution {
    public double solution(int[] arr) {
        int size = arr.length;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        double answer = (double)sum / size;
        return answer;
    }
}