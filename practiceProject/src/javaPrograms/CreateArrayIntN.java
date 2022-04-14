//WAp to create an integer array of size 'n' and assign the index of the block as value
package javaPrograms;

import java.util.Scanner;

public class CreateArrayIntN 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arrayInt = new int[n];
		for(int i=0;i<arrayInt.length;i++)
		{
			arrayInt[i]=i;
			System.out.println("arrayInt["+i+"] = "+i);
		}
		
		
	}

}
