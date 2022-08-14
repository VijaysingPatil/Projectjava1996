package constructors;

public class CS1 {
	int a;
	int b;
	
	public CS1() 
	{
		a=12;
		b=13;
	}
	public CS1(int q,int r) 
	{
		q=2;
		r=3;
	}
	public void Add1(int r,int q) 
	{
		int Sum1=q+r;
		System.out.println("Sum1 of "+Sum1);
	}
	public static void Sub() 
	{   int a =23;
	    int b= 24;
		int Sub = a-b;
		System.out.println(Sub);
	}
	
    public void Add() 
    {   
    	int Sum=a+b;
    	System.out.println("Sum is"+Sum);
    }
	public static void main(String[] args) 
	{
		CS1 c = new CS1();
		c.Add();
		c.Sub();
		CS1 s = new CS1();
		s.Add1(5, 9);
	
	}

}
