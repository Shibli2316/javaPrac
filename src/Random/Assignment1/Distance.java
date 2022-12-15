package Random.Assignment1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first coordinates: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the second coordinates: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double x = Math.pow((x2-x1), 2);
        double y = Math.pow((y2-y1), 2);
        double dist = Math.sqrt(x+y);
        System.out.println("The distance between the points is: " + dist);
    }
}
