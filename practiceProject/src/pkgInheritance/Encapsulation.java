package pkgInheritance;

public class Encapsulation 
{
	private String name;
	private int id;
	
	public void setNameAndID(String Name,int ID)
	{
		this.id=ID;
		this.name=Name;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	
	public static void main(String[] args)
	{
		Encapsulation objEncap = new Encapsulation();
		objEncap.setNameAndID("Shruthi", 1234);
		String name = objEncap.getName();
		int id = objEncap.getID();
		System.out.println("Name is "+name+" ID is "+id);
	}
}
