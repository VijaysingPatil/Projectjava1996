package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {
public static void main(String[] args) {
	
	Vector<Object> v =  new Vector<>();
	v.add("Rohit");
	v.add('V');
	v.add(1998);
	v.add(null);
	v.add(null);
	v.add(123.43f);
	v.add(true);
	v.add(1996);
	v.add("Rohit");
	
	System.out.println(v);
	System.out.println(v.capacity());
	v.add("Ram");
	System.out.println(v);
	System.out.println(v.remove(3));
	System.out.println(v);
	
	
	//for loop
	
	System.out.println("==========for loop============");
	for(int i =0;i<=8;i++) 
	{
		System.out.println(v.get(i));
	}
	
	//for each
	System.out.println("==========for each============");
	for(Object r:v) {
		
		System.out.println(r);
	}
	System.out.println("=========iterator =============");
	//iterator 
	Iterator<Object> i = v.iterator();  
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("=========listiaretar=============");
	//listiaretar
	ListIterator li = v.listIterator();
			while(li.hasNext()){
				System.out.println(li.next());
				System.out.println("==========Enumration============");
	//Enumration
				Enumeration<Object> en = v.elements();
				while (en.hasMoreElements()) 
				{
					System.out.println(en.nextElement());
				}
			}
			
		
}
}
