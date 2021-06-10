class A{
    A()
    {
        System.out.println("parent class No-Arg constructor");
    }
}
class B extends A{
    B()
    {
        System.out.println("child class No-Arg constructor");
    }
    B(String name)
    {
        this();
        System.out.println("child class param constructor");
    }
}

public class ConstructorLoading {
    public static void main(String args[])
    {
        A a = new B("java");
    }
}
