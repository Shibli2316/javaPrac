package Random.Assignment3.Q5;

public class ICICI extends Bank{
    public ICICI(double minInterestRate) {
        super(minInterestRate);
    }

    public void calInterest(){
        System.out.println("Calculate Interest ICICI");
    }

    public void showAnnualRevenue(){
        System.out.println("ICICI show your revenue");
    }
}
