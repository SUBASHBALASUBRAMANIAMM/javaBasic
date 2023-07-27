package interfac;

public interface parent {
    void fun();
    void a();

}
interface parent2 extends parent{
     void fun();

}

class child implements parent2 {
     @Override
     public void fun(){
          System.out.println("from child");
     }

     @Override
     public void a() {

     }
}
class Main{
     public static void main(String[] args) {
          child c = new child();
          c.fun();

     }
}
