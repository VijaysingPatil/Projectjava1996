package Control_Statements;

public class IoopStatememt {

	public static void main(String[] args) {
		System.out.println("========For loop==========");
		System.out.println("======Acsending order =========");
		for(int i =12;i<=120;i=i+12) 
		{
			System.out.println(i);
		}
		System.out.println("======Decsending order =========");
		for(int j=120;j>=12;j=j-12) 
		{
			System.out.println(j);
		}
		System.out.println("=======while loop===========");
		System.out.println("======Acsending order =========");
		int a=2;
		while(a<=20) 
		{
			System.out.println(a);
			a=a+2;
		}
		System.out.println("======Decsending order =========");
		int b=120;
		while(b>=12) {
			System.out.println(b);
			b=b-12;
		}
		System.out.println("=========Do While loop==========");
		System.out.println("========Acsending order======");
		int l=18;
		do 
		{
			System.out.println(l);
			l=l+18;
		}
		while(l<=180);
		System.out.println("========Dcsending order======");
		int e =180;
		do 
		{
			System.out.println(e);
			e=e-18;
		}
		while(e>=18);
	}

}
