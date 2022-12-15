package Random.Assignment3.Q1;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String n){
        this();
        this.name = n;
    }

    public Shape(){
        this.name = "Default";
    }

    public void calArea(){
        System.out.println("Area will be calculated soon");
    }

    public void calPerimeter(){
        System.out.println("Perimeter will be calculated soon");
    }

    public void display(){
        System.out.println("The name of the shape is: " + this.name);
    }

    static void info(){
        System.out.println("It is a shape");
    }
}