package Practical.Week10;

public class Q1 {
    public static void main(String args[]) {
        Person p1 = new Person("ABC",65445686);

        Person.Address a1 = p1.new Address();
        a1.House_No = 45;
        a1.Street = "XYZ Street";
        a1.City = "Aligarh";
        a1.State = "U.P";

        Person.DateOfBirth d1 = p1.new DateOfBirth();

        d1.Day = 9;
        d1.Month = 8;
        d1.Year = 2001;

        p1.display();
        a1.displayAdr();
        d1.displayDOB();
    }
}

class Person{
    String name;
    int phone;


    public Person(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }


    class Address{
        int House_No;
        String Street;
        String City;
        String State;

        public int setHouse_No() {
            return House_No;
        }

        public String setStreet() {
            return Street;
        }

        public String setCity() {
            return City;
        }

        public String setState() {
            return State;
        }
        void displayAdr(){
            System.out.println(House_No+","+Street+","+State);
        }
    }
    class DateOfBirth{
        int Day;
        int Month;
        int Year;

        public int setDay() {
            return Day;
        }

        public int setMonth() {
            return Month;
        }

        public int setYear() {
            return Year;
        }


        void displayDOB(){
            System.out.println(Day+"/"+Month+"/"+Year);
        }
    }

    void display(){
        System.out.println("The name is: "+name+". The phone is: "+phone);
    }

}
