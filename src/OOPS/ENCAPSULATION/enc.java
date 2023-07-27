package OOPS.ENCAPSULATION;

public class enc {
    private int num ;

    public void set_num(int num){
        this.num = num;
    }
    public int get_num(){
        return this.num;
    }
}

class Main{
    public static void main(String[] args) {
        enc e1 = new enc();
        e1.set_num(30);
        System.out.println(e1.get_num());
    }
}
