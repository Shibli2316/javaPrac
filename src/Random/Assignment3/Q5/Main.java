package Random.Assignment3.Q5;

public class Main{
    public static void main(String[] args) {
        SBI s = new SBI(23.2);
        SBI q = new SBI(3.2);
        s.calInterest();
        s.showAnnualRevenue();
        q.calInterest();
        q.showAnnualRevenue();

        ICICI w = new ICICI(12.3);
        ICICI r = new ICICI(45.2);
        w.calInterest();
        r.calInterest();
        w.showAnnualRevenue();
        r.showAnnualRevenue();

        HDFC j = new HDFC(123.2);
        HDFC k = new HDFC(120.3);
        j.calInterest();
        k.showAnnualRevenue();
        j.showAnnualRevenue();
        k.calInterest();
    }
}
