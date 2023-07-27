package OOPS.Inheritance;

public class example {
    String name;
    int age;

     example(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class child extends  example{

    int mark;
    public child(String name, int age, int mark) {
        super(name, age);
        this.mark = mark;
    }
}
