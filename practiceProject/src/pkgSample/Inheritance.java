package pkgSample;

import pkgInheritance.Encapsulation;

public class Inheritance extends Encapsulation
{
	public static void main(String[] args)
	{
	Encapsulation objEncap = new Encapsulation();
	Inheritance objInherit = new Inheritance();
	objInherit.setNameAndID("Shruthiiiii", 6789);
	String name1 = objInherit.getName();
	int id1 = objInherit.getID();
	System.out.println("Name is "+name1+" ID is "+id1);
	objEncap.setNameAndID("Shruthi", 1234);
	String name = objEncap.getName();
	int id = objEncap.getID();
	System.out.println("Name is "+name+" ID is "+id);
	}
	

}
