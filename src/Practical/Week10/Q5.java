package Practical.Week10;

public class Q5 {
    public static void main(String args[]) {
        CLanguage program1 = new  CLanguage();
        program1.abstraction();
        program1.inheritance();
        program1.polymorphism();
        program1.template();
        program1.friendFunction();
    }
}

class ObjectOriented1 {

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

class JavaLanguage extends ObjectOriented1 {

    void persistence() {
        System.out.println("Persistence: Speacial freature of java");
    }

    void interfaces() {
        System.out.println("Interfaces: Speacial freature of java");
    }
}
class CLanguage extends ObjectOriented1 {

    void template() {
        System.out.println("Template: Speacial freature of C");
    }

    void friendFunction(){
        System.out.println("Friend Function: Speacial freature of C");
    }
}
