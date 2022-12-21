package grammerStudy;

public class singletoneExample01 {
    private static singletoneExample01 singletone = new singletoneExample01();

    private singletoneExample01(){}

    static singletoneExample01 getInstance(){
        return singletone;
    }
}

