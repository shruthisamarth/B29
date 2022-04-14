//WAP to get the cart count in the below string:
//"You have 5 items in your cart"
package javaPrograms;

public class PrintIntegerPresentInASentence 
{
	public static void main(String[] args)
	{
		String str = "You have 1000 items in your cart";
		//String subStr = str.substring(8, 10);
		String[] str1 = new String[str.length()];
		str1=str.split(" ");
		//for(String strSplit:str1)
		//{
			if(str1[2].matches("[0-9]*"))
			{
				//String num = strSplit;
				System.out.println(str1[2]);
				//break;
				
			}
			int count = Integer.parseInt(str.replaceAll("[^0-9]", ""));
			System.out.println(count);
		}

	}

