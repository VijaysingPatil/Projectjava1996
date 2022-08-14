package string_study;

public class String_methods {

	

	public static void main(String[] args) {
		String s= "Vijaysing";         // create string without new keywords
		String s1=new String("Rohit");//create string with new keywords 
		String s2="";
		//String s3=null;
		//use of length method
		System.out.println("For length Method ");
		System.out.println(s.length());// if i print length of s object
		System.out.println(s1.length());
		System.out.println(s2.length());
		//System.out.println(s3.length());
		
        int Mylength = s1.length();
        int len = s.length();
       
        System.out.println(Mylength);
        System.out.println(len);
         
        System.out.println("==============================");
        //useing toupperCase
        System.out.println("For toupperCase");
        String b = "ram";
        System.out.println(b.toUpperCase());// if i want to print object b upperCase
        String a = b.toUpperCase();        // if i want to print object b uppercase 
        System.out.println(a);
        System.out.println("================================");
        //useing tolower case 
        System.out.println("for tolower case ");
        String q = "MAYUR";
        System.out.println(q.toLowerCase());
        String r = q.toLowerCase();
        System.out.println(r);
        System.out.println("==================using Equal case=================");
        //using Equal case 
        System.out.println("for equal case");
        String r0= "rohit";
        String r1= "rohit";
        String r2= new String("rohit");
        String r3 = new String ("rohit");
        String r4 = new String("Rohit");
        System.out.println("==========Equals String method==========");
        System.out.println(r0==r1);  //check memmory location
        System.out.println(r1==r2);
        System.out.println(r2==r3);
        System.out.println(r3==r4);
        System.out.println("================================");
        System.out.println(r0.equals(r1));  // check contain
        System.out.println(r1.equals(r2));
        System.out.println(r2.equals(r3));
        System.out.println(r3.equals(r4));
        
       System.out.println(r4.equalsIgnoreCase(r4));
       System.out.println("=============================");
       
       // contain method is in String
       System.out.println("For Contain method");
       String w1 = "Vijaysing";
       
	System.out.println(w1.contains("Vjsg"));
	System.out.println(w1.contains("jay")); // sequence is right so true
	System.out.println(w1.contains("j"));
	System.out.println("=======================");
	
	//isempty method in string
	System.out.println("For isempty method ");
	String p1= "Rohit";
	String p2= " ";
	//String p3= null;
	String p4="";       // becose length is zero so true
	
	System.out.println(p1.isEmpty());
	boolean resulte=p1.isEmpty();
	System.out.println(resulte);
	System.out.println(p2.isEmpty());
	//System.out.println(p3.isEmpty());
	System.out.println(p4.isEmpty());
	System.out.println("==============For CharAt method===============");
	
	//charAt method
	System.out.println("For CharAt method ");
	String e1="Vijaysing";
	System.out.println(e1.charAt(3));// count the  char index number
	//System.out.println(e1.charAt(-1));
	//System.out.println(e1.charAt(9));  // becose out of range 
	System.out.println(e1.charAt(7));
	System.out.println("==============================");
	// Endwith method  in String
	System.out.println("For endwith method ");
	String f1 = "VWXYZ";
	 System.out.println(f1.endsWith("Y"));
	 System.out.println(f1.endsWith("XYZ"));//check the sequance
	 System.out.println(f1.endsWith("VWX"));
	 System.out.println("===============================");
	 
	 //Startwith method String
	 System.out.println("For Start with method ");
	 String f2 = "PQRS";
	 System.out.println(f2.startsWith("S"));
	 System.out.println(f2.startsWith("P"));
	 System.out.println(f2.startsWith("PQR"));
	 System.out.println("===============================");
	 
	 // SubString Method 
	 System.out.println("For SubString");
	 String f3 = ("Vijaysing");
	 System.out.println(f3.substring(4));
	 System.out.println(f3.substring(1));
	 System.out.println(f3.substring(3, 6));
	 System.out.println(f3.substring(1, 5));
	}

}
