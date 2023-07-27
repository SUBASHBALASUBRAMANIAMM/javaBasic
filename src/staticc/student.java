package staticc;

import OOPS.Abstraction.Student;

public class student {
        String name;
        int age;
        int count=0;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    public void getInfo(){
        System.out.println("name :" + this.name + "age :" + this.age + "college:" + count);
    }

    public static void fun(){
        System.out.println("fun");
    }
}

class Main{
    public static void main(String[] args) {
        student s = new student("yogesh",20);
        student s2 = new student("ranjith",20);
        s.getInfo();
        s2.getInfo();
    }
}
