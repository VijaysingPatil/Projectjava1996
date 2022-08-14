package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector<Character>vc=new Vector<>();
		vc.add('A');
		vc.add('B');
		vc.add('C');
		vc.add('D');
		vc.add('E');
		vc.add('F');
		vc.add('G');
		vc.add('H');
		
		System.out.println(vc);
		System.out.println("======================");
	//for loop
		for(int i=0;i<=7;i++) {
			System.out.println(vc.get(i));
		}
		System.out.println("======================");
	//for each
		for(Character d:vc) {
			System.out.println(d); 
		}
		System.out.println("======================");
		//iterator
		Iterator<Character> i =vc.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("======================");
	
	//listiterator
	ListIterator<Character> li = vc.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("======================");
	//Enumeration
	Enumeration<Character> en = vc.elements();
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	
	}
}
