package AccessSpecifire;

public class AccessModDemo {

	public void Pub() 
	{
	System.out.println("Scope in project");	
	}
	void Def() 
	{
		System.out.println("Scope witin Pacekege ");
	}
	protected void Pro()
	{
	System.out.println("Scope wthin Pacekege");	

	}
	public static void main(String[] args)
	{    
		AccessModDemo am = new AccessModDemo();
		am.Pub();
		am.Pro();
		am.Def();
		//am.Pri(); ----> Scope within class 
	
	}

}
