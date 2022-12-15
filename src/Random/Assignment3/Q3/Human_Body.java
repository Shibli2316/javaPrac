package Random.Assignment3.Q3;

public class Human_Body {
    private double height;
    private double weight;

    public Human_Body(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.println("The height is: " + this.height + " The weight is: " + this.weight);
    }

    public class Eye{
        String color;
        int size;

        public Eye(String color, int size) {
            this.color = color;
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void display(){
            System.out.println("The color is: " + this.color + " The size is: "+ this.size + " The height is " + height + " The weight is: " + weight);
        }
    }
}
