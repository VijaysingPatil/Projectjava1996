package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetStudy2 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("Rohit");
		h.add('M');
		h.add(1995);
		h.add("Rohit");
		h.add(null);
		h.add(null);
		h.add(123.43f);
		h.add(true);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.containsAll(h));
		System.out.println(h.isEmpty());
		System.out.println(h);
		System.out.println(h.remove("Rohit"));
		System.out.println(h);
		
		System.out.println("========For each=========");
		for(Object r:h) 
		{
			System.out.println(r);
		}
		System.out.println("=========iteration==========");
		
		Iterator it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		}
		{
			
		
		

	}

}
