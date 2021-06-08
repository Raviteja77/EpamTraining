//Abstraction

interface MobilePhone
{
	void call();
	void message();
	void playGames();
	void listenSongs();
}

abstract class Nokia implements MobilePhone
{
	public void call()
	{
		System.out.println("I'm initiating a call");
	}
	
	public void message()
	{
		System.out.println("I'm sending a message");
	}
}

class Samsung extends Nokia
{
	public void playGames()
	{
		System.out.println("I'm playing a game");
	}
	
	public void listenSongs()
	{
		System.out.println("I'm listening to music");
	}
}

public class TestMobilePhone
{
	public static void main(String args[])
	{
		MobilePhone phn = new Samsung();
		phn.call();
		phn.message();
		phn.playGames();
		phn.listenSongs();
	}
}


//Encapsulation

class Employee 
{
	private String name;
	private int IDNo;
	private String designation;
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getIDNo()
	{
		return this.IDNo;
	}
	
	public void setIDNo(int IDNo)
	{
		this.IDNo = IDNo;
	}
	
	public String getDesignation()
	{
		return this.designation;
	}
	
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	
}

public class TestEmployee
{
    public static void main(String args[])
    {
	    Employee emp = new Employee();
	    emp.setName("employee");
	    emp.setIDNo(12345);
	    emp.setDesignation("Junior Software");
	    System.out.println(emp.getName());
	    System.out.println(emp.getIDNo());
	    System.out.println(emp.getDesignation());
    }
}


//Inheritance
class Vehicle
{
	public void drive()
	{
		System.out.println("I'm driving a vehicle");
	}
	
	public void startEngine()
	{
		System.out.println("vehicle);
	}
	
}

class Car extends Vehicle{
	public void changeGear()
	{
		System.out.println("I'm changing the gear");
	}
}

public class TestVehicle
{
	public static void main(String args[])
	{
		Car c = new Car();
		c.drive();
		c.startEngine();
		c.changeGear();
	}
}

//Polymorphism

compile-time polymorphism

class Animal{}
class Dog extends Animal {}
public class Test {
	public void m1(Animal a)
	{
		System.out.println("animal type");
	}
	public void m1(Dog d)
	{
		System.out.println("dog type");
	}
	public static void main(String args[])
	{
		Test t1 = new Test();
		Animal a = new Animal();
		t1.m1(a);   
					
		Test t2 = new Test();
		Dog d = new Dog();
		t2.m1(d);   
					
		Test t3 = new Test();
		Animal a1 = new Dog();
		t3.m1(a1);   
	}
}

run-time polymorphism

class Animal 
{
	public void eat()
	{
		System.out.println("animal is eating");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("dog is eating");
	}
}
public class Test
{
	public static void main(String args[])
	{
		Animal a = new Dog();
		a.eat();
	}
}
