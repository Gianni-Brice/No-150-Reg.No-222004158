class Fabrice{
    public static void main(String args[]) {
        Alice myobj=new Alice();
        myobj.show();
        myobj.dis();
        myobj.calc();
        myobj.add();
        myobj.interfacetest();
        
    }
}

class Daddy{
    int f=6;
    int g=20;
    
    public void add(){
        int result=f+g;
        System.out.println(result);

    }
}
class Chris extends Daddy{
    public static void dis(){
        System.out.println("This class is called Bruno"); // the output message
    }
}
class Bruno extends Chris{
    public static void calc(){
        int h=15;
        int j=30;
        int result=j-h;
        System.out.println(result);
    }
}

    interface Eric {
   void interfacetest();
} 

class Alice extends Bruno implements E{
    public  void show() {
        System.out.println(f+g);
        
    }
    
    public void interfacetest(){
    
    System.out.println("The interface method");
}
}
