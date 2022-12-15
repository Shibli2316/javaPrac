package Random.Assignment1;

import java.util.Scanner;

public class Ntimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter what do you want to be printed: ");
        int num = in.nextInt();
        System.out.print("How many times do you want it to be printed: ");
        int times = in.nextInt();
        for (int i=0; i<times; i++){
            System.out.println(num);
        }
    }
}
