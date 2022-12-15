package Random.Assignment3.Q4;

public class Computer {
    private String brand;
    private double price;
    Monitor monitor;
    InputDevice inputDevice;

    public Computer(String brand, double price, Monitor monitor, InputDevice inputDevice) {
        this.brand = brand;
        this.price = price;
        this.monitor = monitor;
        this.inputDevice = inputDevice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("The brand is " + this.brand + " the price is " + this.price);
        monitor.display();
        inputDevice.display();
    }
}
