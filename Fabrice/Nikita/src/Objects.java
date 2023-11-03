class SimpleInterest
{
    public double CalcSI(double principal, double rate, double time)
    {
        return principal*rate*time;
    }
}
public class Objects {
    public static void main (String [] args){
        //create an instance of the SimpleInterest class

        SimpleInterest mySI = new SimpleInterest();

        //Use the product method to multiply p,r and t

        double result = mySI.CalcSI(100000,0.05 ,5);
        System.out.println(" Result: " + result);
    }
}
    