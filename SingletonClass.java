

public class SingletonClass {
    public static SingletonClass instance;

    private SingletonClass()
    {
        System.out.println("private constructor");
    }
    public void print()
    {
        System.out.println("im accessing the method");
    }

    public static SingletonClass getInstance()
    {
        if(instance == null)
            instance = new SingletonClass();
        return instance;
    }

    class InnerSingeltonClass extends SingletonClass
    {

    }
    
}
class Test
{
    public static void main(String args[]) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass.InnerSingeltonClass innerObj = obj.new InnerSingeltonClass();
        innerObj.print();
    }
}