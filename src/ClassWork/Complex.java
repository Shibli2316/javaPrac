package ClassWork;

public class Complex {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(2, 3);
        c1.display();
        ComplexNumbers c2 = new ComplexNumbers(3, 2);
        c2.display();
        c1.add(c2);
        c1.sub(c2);
        c1.mul(c2);
        ComplexNumbers t = c1.subt(c2);
        t.display();
    }
    public static class ComplexNumbers{
        double r;
        double i;

        ComplexNumbers(double a, double b){
            r = a;
            i = b;
        }

        void display(){
            System.out.println(r + "+i" + i);
        }

        void add(ComplexNumbers c){
            System.out.println((this.r + c.r) + "+i"+(this.i+c.i));
        }

        void sub(ComplexNumbers c){
            System.out.println((this.r-c.r)+ "+i"+(this.i-c.i));
        }
        void mul(ComplexNumbers c){
            double inter = ((this.r*c.r) - (this.i*c.i));
            double addi = ((this.r*c.i)+(this.i*c.r));
            System.out.println(inter+ "+" + addi+"i");
        }

        ComplexNumbers subt(ComplexNumbers c){
            double r1 = (this.r-c.r);
            double i1 = (this.i-c.i);
            ComplexNumbers t = new ComplexNumbers(r1, i1);
            return t;
        }
    }
}
