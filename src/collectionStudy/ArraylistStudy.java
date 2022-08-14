package collectionStudy;

import java.util.ArrayList;

public class ArraylistStudy {

	public static void main(String[] args) {
		// create object
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add("Rohit");
		al.add("Shivam");
		al.add(1996);
		al.add(98.99);
		al.add(null);
		al.add(null);
		al.add("Rohit");
		al.add('M');
		al.add(true);

		System.out.println(al);   //print all things in array
		System.out.println(al.size());  //size of Element & length
		System.out.println(al.get(2)); //index of Element 
		System.out.println(al.indexOf('M'));//index number
		System.out.println(al.lastIndexOf("Rohit"));//last element number indexing
		System.out.println(al.contains("rohit"));//contains check valid or not
		System.out.println(al.remove(7)); //remove this element index number
		System.out.println(al);
		System.out.println(al.remove('M'));
		System.out.println(al);
		al.add(0, "Mayur");  //add new element in al
		System.out.println(al);
		System.out.println(al.remove("Rohit"));// rohit is remove 
		System.out.println(al);
		System.out.println("===============");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(6));
		System.out.println(al.get(7));
		System.out.println("===============");
		
		//printing element using for loop ....static or hard coding
		for(int i =0;i<=6;i++) {
			System.out.println(al.get(i));
		}
		//printing element useing for loop....Dynamic testing-
		for(int i =0; i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
	}

}
