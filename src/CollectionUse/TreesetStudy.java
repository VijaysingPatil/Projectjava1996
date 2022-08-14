package CollectionUse;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("qwe");
		t.add("PQR");
		t.add("1765");
		t.add("123");
		t.add("God");
		t.add("PQR");
		
		System.out.println(t);
		t.add("Ram");
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println(t.containsAll(t));
		System.out.println(t.size());
		System.out.println("========For Each=======");
		for(Object r:t) {
			System.out.println(r);
		}
		System.out.println("=====Iterator======");
Iterator i = t.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}

	}
}
	
