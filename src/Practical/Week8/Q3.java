package Practical.Week8;

public class Q3 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("red", "good", 50);
        f1.display();
    }

    static class Fruit{
        private String colour;
        private String taste;
        private int price;

        Fruit(String c, String t, int p){
            this.colour = c;
            this.taste = t;
            this.price = p;
        }

        void display(){
            System.out.println("The color is " + colour + " taste is "+ taste + " and price is " + price);
        }
    }
}
