package SelfArrayPractice.TestJava;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Person p = new Person();
        p.setName("Shibli");
        p.display();

        Person s = new Student();
        s.setName("Raza");
        s.display();

        Person u = new UGStudent();
        u.setName("Ahmad");
        u.display();
        kiskaHai(a);

    }
    public static void kiskaHai(Object a){
        if(a instanceof Person){
            if(a instanceof Student){
                if (a instanceof UGStudent){
                    System.out.println("UG hai");
                }else{
                    System.out.println("Stud hai");
                }
            }else {
                System.out.println("Person hai");
            }
        } else{
            System.out.println("Kuch nahi hai");
        }
    }
}
