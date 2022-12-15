package Random.Assignment1;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countNum = 0;
        int countLetter = 0;
        int countSpace = 0;
        int countOther = 0;
        System.out.println("Enter the string: ");
        String input = in.nextLine();
        char[] singles = input.toCharArray();
        for (int i = 0; i < singles.length; i++) {
            if (Character.isDigit(singles[i])){
                countNum++;
            }
            else if(Character.isLetter(singles[i])){
                countLetter++;
            } else if (Character.isSpaceChar(singles[i])) {
                countSpace++;
            }else {
                countOther++;
            }
        }
        System.out.println("There are " + countNum + " numbers, " + countLetter + " alphabets, " + countSpace + " spaces and " + countOther + " special characters in the string");
    }
}
