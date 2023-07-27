package OOPS.Inheritance;

public class Games {
    void needed(){
        System.out.println("players,ball");
    }

    void ball(){
        System.out.println("may be");
    }
}


 class Football extends Games{
    void noOfPlayers(){
        System.out.println("11");
    }
//    @Override
//    void ball(){
//        System.out.println("yes");
//    }



}