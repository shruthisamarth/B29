package pkgSample;

public class MethodOverloading 
{
	public void add()
	{
		System.out.println("Addition of 2 and 3 gives "+(2+3));
	}
	
	public int add(int a, int b)
	{
		// a=10;
		 //b=20;
		int c = a+b;
		return c;
	}
	
	public double add(double a, double b)
	{
		double c = a + b;
		return c;
	}
	
	public static void main(String[] args)
	{
		MethodOverloading objFunc = new MethodOverloading();
		objFunc.add();
		int resInt = objFunc.add(3,3);
		System.out.println("Addition of 3 and 3 is "+resInt);
		double resDouble = objFunc.add(1.2, 2.8);
		System.out.println("Addition of 1.2 and 2.8 is "+resDouble);
	}
	
	
}
