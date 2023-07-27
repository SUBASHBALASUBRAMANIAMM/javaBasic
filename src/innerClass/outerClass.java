package innerClass;

 class outerClass {
    int x =10;
    static class innerClass{
        int y =5;
    }
    public void fun(){
        outerClass.innerClass in = new innerClass();
        System.out.println(in.y);
    }



}
class Main{
    public static void main(String[] args) {
        outerClass.innerClass in = new outerClass.innerClass();
        System.out.println(in.y);

    }
}
