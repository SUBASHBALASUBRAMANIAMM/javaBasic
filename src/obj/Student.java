package obj;

public class Student {
    public String name;
    public int roll;
    public int mark;

    Student(){
        System.out.println("hi");
    }
    Student(String name,int roll,int mark){
        this.name = name;
        this.mark = mark;
        this.roll = roll;
    }

}
