package Random.Assignment3.Q2;

public class Circle extends Shape_2D {
    int Radius;

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius;
    }

    public Circle(int Radius, String name) {
        super(name);
        this.Radius = Radius;
    }

    @Override
    public void calArea(){
        System.out.println("AREA OF CIRCLE IS: " + Math.PI*Math.pow(this.Radius, 2) );
    }

    @Override
    public void calPerimeter(){
        System.out.println("PERIMETER OF CILCLE IS: " + 2*Math.PI*this.Radius);

    }

    public void display(){
        System.out.println("RADIUS IS: " + this.Radius);
    }
}