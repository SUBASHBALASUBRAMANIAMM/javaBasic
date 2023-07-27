package OOPS.Abstraction;

abstract public class Student {
    abstract void type();
}


class CsStudent extends Student{
    void type(){
        System.out.println("I am CS boy");
    }
}

class Main{
    public static void main(String[] args) {
        Student s1 = new CsStudent();
        s1.type();
    }
}