
public class stringintochar {

	public static void main(String[] args) {
		//string into char
		String s ="Ram";
		//char c=s.charAt(0);
		//char c1=s.charAt(1);
		//char c2=s.charAt(2);
		//System.out.println(c);
		//System.out.println(c1);
		//System.out.println(c2);
		for( int i =0;i<=2;i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("=============");
		for(int i =2;i>=0;i--) {
			System.out.println(s.charAt(i));
		}	System.out.println("=============");
		//String to int
		String st = "200";
		int i = Integer.parseInt(st);
		System.out.println(i);
		System.out.println("=============");
		
		char h ='R';
		String p = String.valueOf(h);
				System.out.println(p);
	}

}
