package Random.Assignment1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = in.nextLine();
        System.out.println("The string you entered is: " + input);
        String rev = "";
        char single;
        for (int i = 0; i<input.length(); i++){
            single = input.charAt(i);
            rev = single+rev;
        }
        System.out.println("The string after reversing is: " + rev);
    }
}
