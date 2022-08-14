package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) {

     HashSet hs = new HashSet();
     hs.add("Rohit");
     hs.add(1996);
     hs.add("Rohit");
     hs.add('R');
     hs.add(null);
     hs.add(null);
     hs.add(true);
     hs.add(123.8f);
     
     System.out.println(hs);
     System.out.println(hs.size());
     System.out.println(hs.remove(null));
     System.out.println(hs);
     System.out.println(hs.add(1995));
     System.out.println(hs);
     System.out.println("============For each==============");
     for(Object r:hs){
    	 System.out.println(r);
     }
     System.out.println("=============Iterator================");
     Iterator i = hs.iterator();
     while(i.hasNext()) {
    	 System.out.println(i.next());
     }


	}

}
