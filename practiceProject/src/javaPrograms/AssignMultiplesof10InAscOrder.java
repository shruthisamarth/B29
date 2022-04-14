//Write a program to assign multiples of 10 to an array in ascending order
package javaPrograms;

import java.util.Scanner;

public class AssignMultiplesof10InAscOrder 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arrayInt = new int[n];
		for(int i=0;i<arrayInt.length;i++)
		{
			arrayInt[i]=(i+1)*10;
			System.out.println("arrayInt["+i+"] = "+((i+1)*10));
		}
	}
}
