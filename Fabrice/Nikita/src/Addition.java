class Addition 
{
    public static int addNumbers(int num1,int num2)
    {

    return num1 + num2;
   
}
    public static void main (String a[])  // main method
    
    {
        //declaration of variables

        int number1 = 5;

        int number2 =7;

        int result = addNumbers(number1,number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " +  result); //this wii print "The sum of 5 and 5 is: " 5 + 7 = 12
    }
}