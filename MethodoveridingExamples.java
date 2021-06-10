class Vehicle 
{
    public void getSpeed()
    {
        System.out.println("40 is the speed limit");
    }

    public Object getInstance()
    {
        System.out.println("object type instance is returning");
        return null;
    }
}

class Car extends Vehicle
{
    public void getSpeed()
    {
        System.out.println("80 is the spped limit");
    }

    public String getInstance()
    {
        System.out.println("string type instance is returing");
        return null;
    }
}

public class MethodoveridingExamples {
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        v.getSpeed();

        Car c = new Car();
        c.getSpeed();

        Vehicle v1 = new Car();
        v1.getSpeed();
    }
}

abstract class MobilePhone
{
    public abstract void call();

    protected void message()
    {
        System.out.println("messaging is done at parent level");
    }

    public void games() throws Exception
    {
        System.out.println("gaming zone at parent level");
    }
}

class Nokia extends MobilePhone
{
    public void call()
    {
        System.out.println("calling is initiated");
    }

    public void message()
    {
        System.out.println("messaging is done at child level");
    }

    public void games() throws ClassNotFoundException
    {
        System.out.println("gaming zone at child level");
    }
}


