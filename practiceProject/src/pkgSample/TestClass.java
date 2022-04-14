package pkgSample;

public class TestClass extends MethodOverriding
{
	//@Override
	public void boat()
	{
		System.out.println("Inside boat in TestClass class");
	}
	
	public void display()
	{
		super.boat();
	}
	public static void main(String[] args)
	{
//		System.out.println(Static.URL);
//		Static.printStatic();
		TestClass obj = new TestClass();
		//obj.boat();
		//obj.boat();
		MethodOverriding objParent = new TestClass();
		objParent.boat();
		obj.display();
		//super.boat();
	}
}
