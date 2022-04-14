package javaPrograms;

public class PrintStringLengthAndCharacters 
{
	public static void main(String[] args)
	{
	String str = "Bangalore";
	System.out.println("Length of the string is "+str.length());
	for(int i=0;i<str.length();i++)
	{
		System.out.println(str.charAt(i));
	}
	}
	
}
