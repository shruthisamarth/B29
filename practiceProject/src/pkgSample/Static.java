package pkgSample;

public class Static 
{
	public static String URL = "https://www.google.co.in";
	
	public static void printStatic()
	{
		System.out.println("Inside a static method");
	}
	
	public static void main(String[] args)
	{
		System.out.println(URL);
		printStatic();
	}

	
}
