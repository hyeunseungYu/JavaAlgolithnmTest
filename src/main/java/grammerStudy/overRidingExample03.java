package grammerStudy;

public class overRidingExample03 {
    public static void main(String[] args) {
        overRidingExample02 airplane = new overRidingExample02();

        airplane.takeOff();
        airplane.fly();
        airplane.flyMode = overRidingExample02.SUPERSONIC;
        airplane.fly();
        airplane.flyMode = overRidingExample02.NORMAL;
        airplane.fly();
        airplane.land();
    }
}
