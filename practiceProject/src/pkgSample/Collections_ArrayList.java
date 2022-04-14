package pkgSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections_ArrayList 
{
	public static void main(String[] args)
	{
		//ArrayList
		List<String> arrListStr = new ArrayList<String>();
		arrListStr.add("abc");
		arrListStr.add("def");
		arrListStr.add("ghi");
		arrListStr.add("xyz");
		//System.out.println(arrListStr.get(3));
		int n = arrListStr.size();
		Iterator<String> i = arrListStr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Size of ArrayList is "+n);
		try
		{
			List<String> arrSub = arrListStr.subList(2, 1);
			i = arrSub.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
