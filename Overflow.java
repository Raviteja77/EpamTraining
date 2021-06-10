
class Example{
    static{
        System.out.println("static block");
    }
    Example()
    {
        System.out.println("constructor");
    }
    {
        System.out.println("instance block");
    }
}

public class Overflow {
    public static void main(String args[]){
        Example e = new Example();
        System.out.println("main method");
    }
    
}
