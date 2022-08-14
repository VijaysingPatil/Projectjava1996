package Polymorphism_override;

public class P extends Q{

	public static void main(String[] args) {
		
        System.out.println("For Sub Class");
		P p = new P();
		p.Name();
		p.Age();
		System.out.println("========================");
		System.out.println("For Super Class");
		Q q = new Q();
		q.Name();
		q.Age();
		
		
	}
	public void Name () 
	{
		System.out.println("My Name is Rohit ");
		
	}
	public void Age () 
	{
		System.out.println("My Age is 26 ");
	}
}
