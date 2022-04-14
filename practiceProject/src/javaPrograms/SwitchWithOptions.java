//WAP to do following based on user choice(SWITCH) and write each in methods
//1 -> read two number and print biggest of two
//2 -> read one int value print whether its positive or negative
//3 -> read one int and print factorial of that number
//4 -> read one int and print whether its prime or not
//5 -> read two int say m,n and print odd number between m and n
package javaPrograms;

import java.util.Scanner;

public class SwitchWithOptions
{
	
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1 -> read two number and print biggest of two /n n2 -> read one int value print whether its positive or negative /n 3 -> read one int and print factorial of that number /n 4 -> read one int and print whether its prime or not /n 5 -> read two int say m,n and print odd number between m and n");
		System.out.println("Enter your choice between 1-5:");
		int choice = scan.nextInt();
		switch(choice)
		{
			case 1: fn_biggestOfTwo();
			case 2: String positiveOrNegative = fn_positiveOrNegative();
					System.out.println("Number is "+positiveOrNegative);
			case 3: System.out.println("Enter the number to find the factorial");
					int num=scan.nextInt();
					int fact = fn_factorialOfN(num);
			case 4: System.out.println("Enter the number to find if it is prime or not");
					int num=scan.nextInt();
					String primeOrNot = fn_primeOrNot();
					System.out.println("Number is "+positiveOrNegative);
			case 5: 
		}
	}
		public static void fn_biggestOfTwo()
		{
			//Scanner scan = new Scanner(System.in);
			System.out.println("Enter two numbers to find the biggest of two:");
			System.out.println("Enter the first number");
			int first=scan.nextInt();
			System.out.println("Enter the second number");
			int second=scan.nextInt();
			String result = (first>second)?"first":"second";
			System.out.println("Biggest of the two numbers entered is "+result);
		}
		 public String fn_positiveOrNegative()
		 {
			 Scanner scan = new Scanner(System.in);	
			 System.out.println("Enter the number to verify if it is positive or not");
				int num=scan.nextInt();
				String positiveOrNegative = (num>=0)?"positive":"negative";
				return positiveOrNegative;
		 }
		public int fn_factorialOfN(int num)
		{
			
		}
		public String fn_primeOrNot(int num)
		{
			
		}
		public void fn_printOddNumbersBetweenMAndN()
		{
			System.out.println("Enter m");
			int m=scan.nextInt();
			System.out.println("Enter n");
			int n=scan.nextInt();
			for(int i=m;i<=n;i++)
			{
				if(i%2 != 0)
				{
					System.out.println(i);
				}
			}
		}
		
	}
}