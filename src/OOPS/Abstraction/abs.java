package OOPS.Abstraction;

abstract public class abs {

    public void fun(){
        System.out.println("from fun");
    }
    abstract void afun();
}
class child extends abs{
   @Override
    void afun(){
       System.out.println("from child");
    }
}