package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector3 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(123);
		v.add(133);
		v.add(123);
		v.add(125);
		v.add(123);
		v.add(183);
		v.add(133);
		v.add(123);
	
		System.out.println(v);
		System.out.println(v.isEmpty());
		System.out.println(v.add(1996));
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.get(5));
		System.out.println("===========================");
		//for loop 
		for (int a=1;a<=8;a++) {       // static codeing
			System.out.println(v.get(a));
		}
		System.out.println("===========================");
		for(int b=0;b<=v.size()-1;b++) {
			System.out.println(v.get(b));
		}
		System.out.println("===========================");
		// for each 
		for(Object r:v) {
			System.out.println(r);
		}
		//Itaration
		System.out.println("===========================");
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println("===========================");
		//list itaratar
		ListIterator li = v.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}System.out.println("===========================");
		//Enumatation
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
