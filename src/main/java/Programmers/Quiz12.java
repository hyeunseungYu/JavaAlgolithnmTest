public class Quiz12 {
    public static void main(String[] args) {
        int x = 13;
        boolean answer = true;
        String makeString = Integer.toString(x);
        String[] StringList = makeString.split("");

        int[] integerList = new int[StringList.length];
        int index = 0;

        for (String s : StringList) {
            integerList[index++] = Integer.parseInt(s);
        }
        int sum = 0;

        for (int i : integerList){
            sum += i;
        }

        answer = (x % sum == 0) ? true: false;

        System.out.println(answer);


    }
}
