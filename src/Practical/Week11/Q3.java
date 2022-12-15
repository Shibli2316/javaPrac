package Practical.Week11;

public class Q3 {
    public static void main(String args[]) {
        BuySomething b1 = new BuySomething();
        b1.offer();
        b1.details();
    }
}


interface Bike{
    void offer();
    default void details(){
        System.out.println("Details of bike");
    }
}

interface Scooty{
    void offer();
    default void details(){
        System.out.println("Details of Scooty");
    }
}

class BuySomething implements Bike,Scooty{
    public void offer(){
        System.out.println("Offers On vehicle");
    }
    public void details(){
        Bike.super.details();
        Scooty.super.details();
    }
}
