package Random.Assignment1;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = in.nextLine();
        System.out.println("Enter the next string: ");
        String str2 = in.nextLine();
        System.out.println("The two strings after concatenation are: " );
        System.out.println(str1+str2);
    }
}
