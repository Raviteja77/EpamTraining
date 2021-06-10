class Person
{
    public static void walk()
    {
        System.out.println("person is walking");
    }
}

class Student extends Person{
    public static void walk()
    {
        System.out.println("student is walking");
    }
}

public class Methodhiding {
    public static void main(String args[])
    {
        Person p = new Person();
        p.walk();

        Student s = new Student();
        s.walk();

        Person p1 = new Student();
        p1.walk();
    }
}
