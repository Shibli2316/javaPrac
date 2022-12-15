package SelfArrayPractice.TestJava;

public class Student extends Person{
    private int rollNo;
    private double marks;

    public Student(String name, int age, int rollNo, double marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public Student(String name, int rollNo, double marks) {
        super(name);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public Student(int age, int rollNo, double marks) {
        super(age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public Student(int rollNo, double marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public Student(){
        super();
        this.rollNo = -1;
        this.marks = 0.0;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void display(){
        System.out.println("The name is " + super.getName() + ". Age is " + super.getAge() +
                ". Roll is " + this.getAge() + ". Marks is " + this.getMarks());
    }
}
