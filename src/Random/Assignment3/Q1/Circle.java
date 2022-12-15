package Random.Assignment3.Q1;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String n, double r){
        super(n);
        this.radius = r;
    }

    public Circle(){
        this.radius = 0.0;
    }

    @Override
    public void calArea() {
        System.out.println("The area of circle is: " + Math.PI*Math.pow(this.radius, 2));
    }

    @Override
    public void calPerimeter() {
        System.out.println("The perimeter of circle is: " + 2*Math.PI*this.radius);
    }

    public void display(){
        System.out.println("The radius of circle is " + this.radius + " " + super.getName());
    }

    static void info(){
        System.out.println("It is a circle");
    }
}
