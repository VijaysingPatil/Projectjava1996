package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(1990);
		t.add(1991);
		t.add(1992);
		t.add(1993);
		t.add(1111);
		t.add(33333);
		t.add(2222);
		t.add(5555);
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println(t.add(777));
		System.out.println(t);
		t.remove(1993);
		System.out.println(t);
		System.out.println("========For each loop=====");
		for(Object r:t) {
			System.out.println(r);
		}
		System.out.println("=======Itrator=====");
		Iterator r = t.iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}
	}

}
