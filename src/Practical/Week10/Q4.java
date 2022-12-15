package Practical.Week10;

public class Q4 {
    public static void main(String args[]) {
        JavaLanguage1 program1 = new JavaLanguage1();
        program1.abstraction();
        program1.inheritance();
        program1.polymorphism();
        program1.persistence();
        program1.interfaces();
    }
}


class ObjectOriented {

    void abstraction() {
        System.out.println("Abstraction: Feature of object oriented languages.");
    }

    void polymorphism() {
        System.out.println("Polymorphism: Feature of object oriented languages.");
    }

    void inheritance() {
        System.out.println("Inheritance: Feature of object oriented languages.");
    }
}

class JavaLanguage1 extends ObjectOriented1 {

    void persistence() {
        System.out.println("Persistence: Speacial freature of java");
    }

    void interfaces() {
        System.out.println("Interfaces: Speacial freature of java");
    }
}
