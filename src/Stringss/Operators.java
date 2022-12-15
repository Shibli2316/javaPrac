package Stringss;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a'+ 3));
//        integer will be converted to Integer that will call toString()
//        Same as "a" + "1"
        System.out.println("a" + 1);

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

    }
}
