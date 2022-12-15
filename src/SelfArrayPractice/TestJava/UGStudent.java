package SelfArrayPractice.TestJava;

public class UGStudent extends Student{
    private String subsidiary1;
    private String subsidiary2;

    public UGStudent(String name, int age, int rollNo, double marks, String subsidiary1, String subsidiary2) {
        super(name, age, rollNo, marks);
        this.subsidiary1 = subsidiary1;
        this.subsidiary2 = subsidiary2;
    }

    public UGStudent(String name, int rollNo, double marks, String subsidiary1, String subsidiary2) {
        super(name, rollNo, marks);
        this.subsidiary1 = subsidiary1;
        this.subsidiary2 = subsidiary2;
    }

    public UGStudent(int age, int rollNo, double marks, String subsidiary1, String subsidiary2) {
        super(age, rollNo, marks);
        this.subsidiary1 = subsidiary1;
        this.subsidiary2 = subsidiary2;
    }

    public UGStudent(int rollNo, double marks, String subsidiary1, String subsidiary2) {
        super(rollNo, marks);
        this.subsidiary1 = subsidiary1;
        this.subsidiary2 = subsidiary2;
    }

    public UGStudent(String subsidiary1, String subsidiary2) {
        this.subsidiary1 = subsidiary1;
        this.subsidiary2 = subsidiary2;
    }

    public UGStudent(){
        super();
        this.subsidiary1 = "Maths";
        this.subsidiary2 = "Stats";
    }

    public String getSubsidiary1() {
        return subsidiary1;
    }

    public void setSubsidiary1(String subsidiary1) {
        this.subsidiary1 = subsidiary1;
    }

    public String getSubsidiary2() {
        return subsidiary2;
    }

    public void setSubsidiary2(String subsidiary2) {
        this.subsidiary2 = subsidiary2;
    }

    public void display(){
        System.out.println("The name is " + super.getName() + ". Age is " + super.getAge() +
                ". Roll is " + this.getAge() + ". Marks is " + this.getMarks() +
                ". Sub1 is " + this.getSubsidiary1()+ ". Sub 2 is " + this.getSubsidiary2());
    }
}
