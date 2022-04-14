//WAP to print the number of occurrence of a character in a string 
package javaPrograms;

public class PrintNumOfOccurenceOfAChar 
{
	public static void main(String[] args)
	{
		String str = "Bangalore";
		char character = 'a';
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c==character)
			{
				count ++;
			}
		}
		System.out.println("Number of occurrences is "+count);
	}
}
