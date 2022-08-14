package collectionStudy;

import java.util.ArrayList;

public class ArraylisStudy111 {

	public static void main(String[] args) {
		ArrayList<Object> al= new ArrayList<Object>();
		
		al.add("Vijaysing");
		al.add(12);
		al.add('P');
		al.add(null);
		al.add("Vijaysing");
		al.add(null);
		
		
		System.out.println(al.get(2));
		System.out.println(al.remove(0));
		System.out.println(al.contains('P'));
		al.add(4, "Mayur");
		for(int i =0;i<=4;i++) 
		{
			System.out.println(al.get(i));
		}
		System.out.println("=================");
        for(Object a:al) 
        {
        	System.out.println(a);
        }
	}

}
