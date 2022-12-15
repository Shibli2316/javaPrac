package Practical.Week10;

public class Q6 {
    public static void main(String[] args) {
        Department d1 = new Department("Computer Science","Aasim Zafar","AMU","Science",2);
        d1.display();
    }
}


class University {

    String Uname;
    int rank;

    University(String Uname, int rank) {
        this.Uname = Uname;
        this.rank = rank;
    }
}

class Faculty extends University {

    String Fname;

    public Faculty(String Uname, String Fname, int rank) {
        super(Uname, rank);
        this.Fname = Fname;
    }

    void details() {
        System.out.println("The first name is: "+ Fname+". University name is: "+Uname+". The rank is: "+rank);
    }

}
class Department extends Faculty{
    String Dname;
    String chairperson;

    public Department(String Dname, String chairperson, String Uname, String Fname, int rank) {
        super(Uname, Fname, rank);
        this.Dname = Dname;
        this.chairperson = chairperson;
    }


    void details(){
        System.out.println("Department name is: "+Dname + ". The chairman is: " + chairperson);
    }
    void display(){
        super.details();
        details();
    }
}