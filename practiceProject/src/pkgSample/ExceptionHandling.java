package pkgSample;

public class ExceptionHandling 
{

	public static void main(String[] args) throws ArithmeticException
	{
//		int a=5, b=0;
//		try {
//		int c = a/b;
//		System.out.println(c);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Caught exception - "+e.getMessage());
//		}
		
//		try {
//			Thread.sleep(5);
//			System.out.println("No exception");
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
		double c = getAverage(4,0);
		System.out.println("Average is "+c);
//		
	}
	public static double getAverage(int a, int b)
	{
		try
		{
			throw new ArithmeticException();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("In the finally block");
		}
		return a/b;
	}
	
	
	
	
}
