package Random.Assignment3.Testing;

public class Shape_2D extends Shape {

    @Override
    public void calArea(){
        System.out.println("Area of 2D shape");
    }

    public Shape_2D(String name) {
        super(name);
    }

    public void display(){
        System.out.println("name is " + super.getName());
    }
}
