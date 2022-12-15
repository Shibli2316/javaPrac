package Practical.Week8;

public class Q1 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.colour = "red";
        f1.taste = "average";
        f1.price = 60;
        f1.display();

        Fruit f2 = new Fruit();
        f2.colour = "yellow";
        f2.taste = "good";
        f2.price = 20;
        f2.display();

        Fruit f3 = new Fruit();
        f3.colour = "green";
        f3.taste = "awful";
        f3.price = 05;
        f3.display();
    }
    static class Fruit{
        private String colour;
        private String taste;
        private int price;

        void display(){
            System.out.println("The color is " + colour + " taste is "+ taste + " and price is " + price);
        }
    }
}
