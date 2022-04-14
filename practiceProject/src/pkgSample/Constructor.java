package pkgSample;

public class Constructor 
{
	int i;
	String s;
	
	public Constructor()
	{
		System.out.println("Inside default constructor");
	}
	
	public Constructor(int id, String name)
	{
		i = id;
		s = name;
	}
	
	public static void main(String[] args)
	{
		Constructor constr = new Constructor(1,"Shru");	
		//constr.display(1, "Shru");
		
		System.out.println(constr.i+" "+constr.s);
	}
}
