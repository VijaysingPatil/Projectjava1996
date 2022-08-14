package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add("Pune");
		l.add('M');
		l.add(1996);
		l.add(123.43f);
		l.add(null); 
		l.add("Pune");
		l.add(null);
		l.add(1996);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(3));
		System.out.println("=======For peek==========");
		System.out.println(l.peek());//retrieves but not remove
		System.out.println(l);
		System.out.println(l.peekLast());
		System.out.println(l);
		System.out.println(l.peekFirst());//retrieves but not remove
		System.out.println(l);
		System.out.println("========For pool==============");
		System.out.println(l.poll());//retrieves also remve the value
		System.out.println(l);
		System.out.println(l.pollFirst());//retrieves but not remove
		System.out.println(l);
		System.out.println(l.pollLast());
		System.out.println(l);
		System.out.println("=======For loop with Dynamic coding=============");
		for(int i = 0;i<=l.size()-1;i++) 
		{
			System.out.println(l.get(i));
		}
       //for each
		System.out.println("===========For each==============");
		for(Object r:l) {
			System.out.println(r);
		}
		//iterator
		System.out.println("============iterator=============");
		Iterator ir = l.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		//listeiterator
		System.out.println("============listeiterator=============");
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		

}}
