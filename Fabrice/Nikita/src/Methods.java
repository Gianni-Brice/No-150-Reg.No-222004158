class CompoundInterest
{
    public double CalcCI(double principal, double rate, double time, double n)
    {
        return principal *(Math.pow((1 + rate / n), n*time));
          
    }
}
public class  Methods {
    public static void main (String [] args){
        //create an instance of the CompoundInterest class

        CompoundInterest myCI = new CompoundInterest();

        //Use the product method to multiply p,r and t

        double result = myCI.CalcCI(500000,0.18,3,12);
        System.out.println(" Result: " + result);
    }
}
