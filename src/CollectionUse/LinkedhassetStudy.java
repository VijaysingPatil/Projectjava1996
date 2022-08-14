package CollectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhassetStudy {

	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Rohit");
		lh.add('R');
		lh.add(null);
		lh.add(null);
		lh.add("Rohit");
		lh.add(true);
		lh.add(1995);
		lh.add(2543.37f);
		System.out.println(lh);
		lh.remove(null);
		System.out.println(lh);
		lh.add("Ram");
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println("========for loop==========");
		for(Object h:lh) {
			System.out.println(h);
		}
        System.out.println("=======Iteration =========");
        Iterator i = lh.iterator();
        while(i.hasNext()) {
	    System.out.println(i.next());}
        
	    lh.clear();
	   System.out.println(lh);
	   
}
	}

