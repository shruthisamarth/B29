package javaPrograms;

import java.util.Scanner;

public class Print1toN 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();	
		printNumber(n,1);
	}
	public static void printNumber(int n,int i) {
		if(i<=n)
		{
			System.out.println(i); 
			printNumber(n,++i);
		}
	}
}
