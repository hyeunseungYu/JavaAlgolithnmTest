package grammerStudy;

public class singletoneExample01Test {
    public static void main(String[] args) {
        singletoneExample01 obj1 = singletoneExample01.getInstance();
        singletoneExample01 obj2 = singletoneExample01.getInstance();

        if (obj1 == obj2){
            System.out.println("true");
        }

    }
}
