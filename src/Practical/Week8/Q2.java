package Practical.Week8;

public class Q2 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.setColour("red");
        f1.setTaste("good");
        f1.setPrice(50);
        f1.display();
    }

    static class Fruit{
        private String colour;
        private String taste;
        private int price;

        public void setColour(String colour) {
            this.colour = colour;
        }

        public void setTaste(String taste) {
            this.taste = taste;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        void display(){
            System.out.println("The color is " + colour + " taste is "+ taste + " and price is " + price);
        }
    }
}
