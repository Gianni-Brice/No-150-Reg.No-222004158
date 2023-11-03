class  Melody
{
    public static void main(String a[])
    { 
        
        //for positive numbers, >>and >>> works same
        
        System.out.println(20>>2);  //20/2^2 = 20/4
       
        System.out.println(20>>>2); //20/2^2 = 20/4

        // for negative numbers, >>>changes the parity bit(MSB) to 0

        System.out.println(-20>>2);  //-20/2^2 = -20/4
        
        System.out.println(-20>>>2);
    }
}
