package Random.Assignment3.Q2;

public abstract class Shape_2D extends Shape{

    public abstract void calArea();

    public abstract void calPerimeter();

    public Shape_2D(String name) {
        super(name);
    }

    public void display(){
        System.out.println("name is " + super.getName());
    }

}

