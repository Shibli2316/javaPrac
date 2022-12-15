package Random.Assignment3.Q4;

public class Monitor {
    private String color;
    private int dimension;
    Resolution resolution;

    public Monitor(String color, int dimension, Resolution resolution) {
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void display(){
        System.out.println("The color is "+ this.color + " the dimension is "+ this.dimension);
        resolution.display();
    }
}
