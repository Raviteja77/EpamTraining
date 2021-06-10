class Animal
{
    public void count(String... names)
    {
        System.out.println("counting the number of animals available");
    }

    public void eat(int... count)
    {
        System.out.println("animals are eating at parent level");
    }
}
class Tiger extends Animal{
    public void count(String name)
    {
        System.out.println("counting the number of tigers available");
    }

    public void eat(int... count)
    {
        System.out.println("animals are eating at child level");
    }
}

public class OverridingWithVarArgs {
    public static void main(String args[])
    {
        Animal a = new Animal();
        a.count("lion");

        Tiger t = new Tiger();
        t.count("tiger");

        Animal a1 = new Tiger();
        a1.count("tiger");

        a.eat(2);

        t.eat(3);
        
        a1.eat(4);

    }
}
