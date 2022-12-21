package programmers.Level01;

public class Quiz14 {
    public static void main(String[] args) {
        int answer = 0;
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[] widthList = new int[sizes.length];
        int[] heightList = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length - 1; j++) {
                if (sizes[i][j] < sizes[i][j + 1]) {
                    int temp = sizes[i][j];
                    sizes[i][j] = sizes[i][j + 1];
                    sizes[i][j + 1] = temp;
                }
            }
        }
        int widthIndex = 0;
        int heightIndex = 0;

        for (int[] i : sizes) {
            widthList[widthIndex++] = i[0];
        }

        for (int[] i : sizes) {
            heightList[heightIndex++] = i[1];
        }

        int widthMax = widthList[0];
        int heightMax = heightList[0];

        for (int i = 1; i < widthList.length; i++) {
            if (widthList[i] > widthMax) {
                widthMax = widthList[i];
            }
        }

        for (int i = 1; i < heightList.length; i++) {
            if (heightList[i] > heightMax) {
                heightMax = heightList[i];
            }
        }
        answer = heightMax * widthMax;



    }
}
