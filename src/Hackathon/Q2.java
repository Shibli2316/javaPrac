package Hackathon;
public class Q2 {

    static int countRec(int choc, int wrap)
    {

        if (choc < wrap)
            return 0;


        int newChoc = choc / wrap;

        return newChoc + countRec(newChoc +
                choc % wrap, wrap);
    }
    static int countMaxChoco(int money,
                             int price, int wrap)
    {

        int choc = money/price;


        return choc + countRec(choc, wrap);
    }
    public static void main (String[] args)
    {
        int money = 15 ;
        int price = 1;


        int wrap = 3 ;
        System.out.println(
                countMaxChoco(money, price, wrap));
    }
}