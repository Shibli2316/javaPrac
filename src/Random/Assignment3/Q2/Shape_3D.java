package Random.Assignment3.Q2;

public abstract class Shape_3D extends Shape{

    public abstract void calArea();

    public abstract void calVolume();

    public Shape_3D(String name) {
        super(name);
    }

    public void display(){
        System.out.println("name is " + super.getName());
    }

}

