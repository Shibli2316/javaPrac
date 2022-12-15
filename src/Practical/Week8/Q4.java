package Practical.Week8;

public class Q4 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("red", "good", 50);
        f1.display();
        Fruit f2 = new Fruit("Green", "Not so good");
        f2.display();
        Fruit f3 = new Fruit(40);
        f3.display();
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
        Fruit(String c, String t){
            this.colour = c;
            this.taste = t;
        }
        Fruit(int p){
            this.price = p;
        }
        Fruit(){
            this.colour = "Magenta";
            this.price = 20;
            this.taste = "Bad";
        }
        void display(){
            System.out.println("The color is " + colour + " taste is "+ taste + " and price is " + price);
        }
    }
}