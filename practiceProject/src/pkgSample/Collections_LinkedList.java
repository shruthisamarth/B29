package pkgSample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections_LinkedList 
{
	public static void main(String[] args)
	{
		//LinkedList - String
//		List<String> linkListStr = new LinkedList<String>();
//		linkListStr.add("orange");
//		linkListStr.add("apple");
//		linkListStr.add("grapes");
//		linkListStr.add("pineapple");
//		Iterator<String> itLinkedList = linkListStr.iterator();
//		while(itLinkedList.hasNext())
//		{
//			System.out.println(itLinkedList.next());
//		}
//		int n = linkListStr.size();
//		System.out.println("Size of LinkedList is "+n);
		
		//LinkedList - Integer
		List<Integer> intList = new LinkedList<Integer>();
		intList.add(2);
		intList.add(4);
		intList.add(6);
		Iterator<Integer> iterator = intList.iterator();
		System.out.println("Size of the List is "+intList.size());
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		intList.add(2,3);
		 iterator = intList.iterator();
		 System.out.println("Size of the List is "+intList.size());
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		for(int i=0;i<intList.size();i++)
		{
			System.out.println(intList.get(i).equals(4));
		}
	}
}
