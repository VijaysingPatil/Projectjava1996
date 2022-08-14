package string_study;

public class string2 {

	public static void main(String[] args) {
		String s="Hi";// created string without using new Keyword
		String s1= new String("Hello");//created using new keyword
		
		//use of length method
		System.out.println(s.length());
		System.out.println(s1.length());
		
		int myLength = s1.length();
		System.out.println(myLength);
		
		
		String s2="";
		System.out.println(s2.length());
		
//		String s3=null;
//		System.out.println(s3.length());
		
		
		//use of touppercase() method
		
		String a="velocity";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		
		String b = a.toUpperCase();
		System.out.println(b);
			
		
		//use of toLowerCase() method
		
		System.out.println(b.toLowerCase());
		
		
		//use of equals() method
		String v0="velocity";
		String v1="velocity";
		String v2= new String("velocity");
		String v3= new String("velocity");
		String v4=new String("Velocity");
		
		
		System.out.println(v0==v1);
		System.out.println(v1==v2);
		System.out.println(v2==v3);
		System.out.println("================");
		System.out.println(v0.equals(v1));
		System.out.println(v1.equals(v2));
		System.out.println(v2.equals(v3));
		System.out.println(v3.equals(v4));

		System.out.println(v3.equalsIgnoreCase(v4));
		System.out.println("===========================");
		//contains() method use
		
		String d="Velocity";
		
		System.out.println(d.contains("Vel"));
		System.out.println("===========================");
		
		
		//isEmpty() method use
		
		String e0="Pune";
		String e1=" ";
		//String e2=null;
		String e3="";

		System.out.println(e0.isEmpty());
		
		boolean result = e0.isEmpty();
		System.out.println(result);
		
		System.out.println(e1.isEmpty());
		
	//	System.out.println(e2.isEmpty());
		
		System.out.println(e3.isEmpty());
		System.out.println("===============");
		System.out.println(e0.isBlank());
		System.out.println(e1.isBlank());
		System.out.println(e3.isBlank());
		System.out.println("===============");
		
		//charAt method use
		
		String w="Thane";
		
		System.out.println(w.charAt(0));
		
		char ans = w.charAt(3);
		System.out.println(ans);
		
		
		//System.out.println(w.charAt(9));
		//System.out.println(w.charAt(-1));
		
		System.out.println("===============");
		
		
		//endsWith method use
		String h= "abcd";
		
		System.out.println(h.endsWith("d"));
		System.out.println(h.endsWith("cbd"));
		System.out.println(h.endsWith("bcd"));
		System.out.println(h.endsWith("abcd"));
		System.out.println("============================");
		
		
		//startsWith method use
		
		String y="India";
		System.out.println(y.startsWith("in"));
		System.out.println(y.startsWith("Ind"));
		System.out.println(y.startsWith("India"));
		System.out.println(y.startsWith("dia", 2));
		System.out.println("============================");
		
		
		//substring method use
		
		String m="Maharashtra";
		System.out.println(m.substring(4));
		String str = m.substring(2);
		System.out.println(str);
		System.out.println(m.substring(0,4));
		System.out.println("============================");
		 
		//concat method 
		String a1 = "My Name is ";
		String a2 = "Vijaysing ";
		System.out.println(a1.concat(a2));
		System.out.println(a2.concat(a1));
		System.out.println("===========================");
		//indexOf Method 
		String a3 = "Vijay";
		int a4 = a3.indexOf('j');
		System.out.println(a4);
		System.out.println(a3.indexOf('j')); //found length index
		System.out.println(a3.lastIndexOf('y'));
		
		String a5 = "My Name is Vijaysing ";
		System.out.println(a5.indexOf("jay", 4));// for string ....near index number
		System.out.println(a5.indexOf('a', 3));// for char....near index number
	}	
}	
		
		
	


