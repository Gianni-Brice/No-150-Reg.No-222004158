// Java Program to Illustrate Do-while Loop

// Class
class DoWhileLoop2 //class name
{
	public static void main(String a[])
    {
		int y=21, sum=0;  //declaration of variables

		do {
			// codes to be executed

			sum+= y;
			y--;
		}

	
		while (y>10);  //condition

	
		System.out.println("The Summation is: " + sum);  //output
	}
}
