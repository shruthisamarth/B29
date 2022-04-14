//WAP to read n values and store it in an array
package javaPrograms;

import java.util.Scanner;

public class ReadNValuesFromUserToAnArray 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] = "+
			arr[i]);
		}
	}
}
