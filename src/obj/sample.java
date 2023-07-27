package obj;

public class sample {
    public static void main(String[] args) {
        String name = "yogesh";
        int roll = 101;
        int mark = 500;

        String names[] = {"ytyt","bccvb"};
        int[] rolls = new int[]{1,2};
        int[] marks = {100,200};

        Student s1 = new Student("yog",1,5);

        System.out.println(s1.name + " " + s1.roll + " " + s1.mark);
        Student[] nae = {new Student("gjg",1,5),new Student("fdkfd",2,5)};
        System.out.println(nae[0].name);
        System.out.println(nae[1].mark);

        Phone apple = new Phone("sony",6,2);

        System.out.println(apple);


    }
}

