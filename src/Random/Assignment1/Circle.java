package Random.Assignment1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = in.nextInt();
        double area = (Math.PI)*Math.pow(radius, 2);
        double perimeter = 2*Math.PI*radius;
        System.out.println("The area of the circle is: "+ area);
        System.out.println("The perimeter of the circle is: "+ perimeter);
    }
}
