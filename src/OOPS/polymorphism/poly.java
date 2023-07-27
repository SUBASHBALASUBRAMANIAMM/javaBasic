package OOPS.polymorphism;

public class poly {
     void num(int c){
        System.out.println(c);
    }
    public void num(int a,int b){
        System.out.println(a + " " + b);
    }
}
class child extends poly{
    @Override
     void num(int c){
         System.out.println(c + " from child");
     }
}
class Main{
    public static void main(String[] args) {
        poly p = new child();
       p.num(5);

    }
}
