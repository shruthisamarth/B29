package javaPrograms;

import java.util.Scanner;

public class FindBiggestAndLowestInArray 
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
		int largest = 0;
		for(int i=0;i<=arr.length;i++)
		{
//			System.out.println("arr["+i+"] = "+
//			arr[i]);
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			largest = arr[i];
		}
		System.out.println("Largest is "+largest);
	}
}
