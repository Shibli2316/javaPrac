package Random.Assignment3.Q4;

public class Main {
    public static void main(String[] args) {
        Resolution r1 = new Resolution(300, 500);
        Resolution r2 = new Resolution(768, 1024);

        Monitor m1 = new Monitor("Blue Ray", 64, r1);
        Monitor m2 = new Monitor("Black", 14, r2);

        InputDevice i1 = new InputDevice("Mouse", 23.76);
        InputDevice i2 = new InputDevice("JoyStick", 50.22);

        Computer c1 = new Computer("Dell", 50000.00, m1, i1);
        Computer c2 = new Computer("HP", 30000.50, m2, i2);
        c1.display();
        c2.display();
    }
}
