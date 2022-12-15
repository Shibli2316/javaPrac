package Random.Assignment3.Q1;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String n, int length, int width) {
        super(n);
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void calArea() {
        System.out.println("The area of rectangle is: " + this.length*this.width);
    }

    @Override
    public void calPerimeter() {
        System.out.println("The perimeter of rectangle is: " + 2*(this.length+this.width));
    }

    public void display(){
        super.display();
        System.out.println("The lenght is: " + this.length + " The width is: "+ this.width);
    }

    static void info(){
        System.out.println("It is a rectangle");
    }
}
