package Polymorphism_Overloading;

public class Over_method {
	
	
	
	
	public void multi() 
	{
		int s= 24;
		int r = 47;
		int  mul = s*r;
		System.out.println("Multiplicaton is "+mul);
	}
	public void multi(int a,int b) 
	{
		a = 36;
		b= 6;
		int div = a/b;
		System.out.println("Division is "+div);
	}

	public static void main(String[] args) {
		
		Over_method o = new  Over_method();
		o.multi(2, 5);
		
		Over_method r = new  Over_method();
		r.multi();
		
		

	}

}
