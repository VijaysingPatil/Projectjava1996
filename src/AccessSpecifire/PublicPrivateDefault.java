package AccessSpecifire;

public class PublicPrivateDefault {
	
	public void Test1()   //Access within Project
	{
		
		System.out.println("Public Test1 method");
	}
	private void Test2() // Access within Class
	{
		
		System.out.println("Private Test2 method");
	}
	void Test3()       //Access within Package
	{
		System.out.println("Default Test3 method");
		
	}
	public static void main(String[] args) 
	{
		PublicPrivateDefault p = new PublicPrivateDefault ();
		p.Test1();
		p.Test2();
		p.Test3();

	}

}
