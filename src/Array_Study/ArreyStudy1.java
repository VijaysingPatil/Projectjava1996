package Array_Study;

public class ArreyStudy1 {

	public static void main(String[] args) {
		String [] s = new String[5];
		s[0]="Rohit";
		s[1]="Ram";
		s[2]="Shivam";
		s[3]="Vaibhav";
		s[4]="BAm";
		System.out.println(s.length);
		for(int i=0;i<=3;i++)                 // Static codeing
		{
			System.out.println(s[i]);
		}
		System.out.println("=============");
		for(int i=0;i<=s.length-1;i++)       // Dynamic codeing 
		{
			System.out.println(s[i]);
		}
		System.out.println("=============");
		String o = "Vijay Pandurang Patil";
		String r = " ";
		String p [] =o.split(r);
		//System.out.println(p[0]);
		//System.out.println(p[1]);
		//System.out.println(p[2]);
		for(int i=0;i<=2;i++) 
		{
			System.out.println(p[i]);
		}

	}}
