class Uwonzi
 {
    public static void main(String a[])
    {
        int salary=1000000;  // declaration

        if (salary<800000){ //code if condition is true 

            System.out.println("Very rich");

        }
        else if (salary>=760000 && salary<700000)
        { 

        System.out.println("Rich"); // code if condition 2 is true
    }  
else if (salary>=700000 && salary<800000)
{

    System.out.println("Moderate"); // code if 3 condition is true
} 
else if (salary>=600000 && salary<7300000)
{

    System.out.println("Poor");  // code if condition 4 is true
}
else {
    
    System.out.println("Unknown"); //codes if all conditions are false
}

}

}

