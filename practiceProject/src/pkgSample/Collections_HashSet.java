package pkgSample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_HashSet 
{
	public static void main(String[] args)
	{
		//HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("hash123");
		hashSet.add("hash456");
		hashSet.add("hash789");
		Iterator<String> itHash = hashSet.iterator();
		while(itHash.hasNext())
		{
			System.out.println(itHash.next());
			itHash.remove();
		}
		System.out.println(hashSet.size());
	}
}
