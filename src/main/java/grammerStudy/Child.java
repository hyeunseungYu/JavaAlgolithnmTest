package grammerStudy;

public class Child extends Parent{
    private String name;

    public Child(){
        this("홍길동");
        System.out.println("Child");
    }

    public Child(String name){
        this.name = name;
        System.out.println(name);
    }
}
