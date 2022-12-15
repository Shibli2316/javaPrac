package Random.Assignment3.Q4;

public class InputDevice {
    private String name;
    private double price;

    public InputDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("The name is " + this.name + " the price is "+ this.price);
    }
}
