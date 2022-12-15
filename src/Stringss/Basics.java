package Stringss;

public class Basics {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        if (a==b){
            System.out.println("Hey there");
        }
//        Explicitly defining to make new objects
        String a1 = new String("Kunal");
        String b1 = new String("Kunal");
        if (a1==b1){
            System.out.println(a1);
            System.out.println(a1.equals(b1));
        }

        System.out.println(a.charAt(1));
    }
}
