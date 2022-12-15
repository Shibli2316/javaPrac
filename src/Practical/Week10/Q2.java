package Practical.Week10;

public class Q2 {
    public static void main(String[] args) {
        Edible.Fruit f1 = new Edible.Fruit("Apple");
        Edible.Fruit.fruitDetails();
        f1.fruitPackaging();

        Edible.Vegetable v1 =new Edible.Vegetable("Potato");
        Edible.Vegetable.vegetableDetails();
        v1.vegetablePacking();

    }
}

class Edible{
    static class Fruit{
        String name;

        public Fruit(String name) {
            this.name = name;
        }

        static void fruitDetails(){
            System.out.println("Fruits are Tasty");
        }
        void fruitPackaging(){
            System.out.println(name+" Packed");
        }
    }
    static class Vegetable{
        String name;

        public Vegetable(String name) {
            this.name = name;
        }

        static void vegetableDetails(){
            System.out.println("Vegetable are Healthy");
        }
        void vegetablePacking(){
            System.out.println(name+" Packed");
        }
    }
}
