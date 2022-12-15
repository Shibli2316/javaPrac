package Practical.Week9;

public class Q1 {
    public static void main(String[] args) {
        Bus b1 = new Bus("UP81T2369",1250);
        b1.display();
        b1.cost();

        Train t1 = new Train("12267",85000);
        t1.display();
        t1.cost();
    }
}
class Vehicle{
    int price;
    Vehicle(int price){
        this.price = price;
    }
    void cost(){
        double cost = price + price*0.08;
        System.out.println("The cost of Vehicle is: "+ cost);
    }
}
class Bus extends Vehicle{
    String regNo;

    Bus(String regNo,int price){
        super(price);
        this.regNo = regNo;
    }

    void display(){
        System.out.println("The reg no is: " +regNo+". The price is: "+price);
    }
}
class Train extends Vehicle{
    String trainNo;
    Train(String trainNo,int price){
        super(price);
        this.trainNo = trainNo;
    }
    void display(){
        System.out.println("The train no is: " +trainNo+". The price is: "+price);
    }
}