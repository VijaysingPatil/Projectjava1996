package AccessSpecifire;

public class Demo {
	public void Test1() 
	{
	System.out.println("Public Test1  method ");
	
	}
	//private void Test2() //Becose Private specifier range within class
	//{
	//	System.out.println("Private Test2 method ");
	//}
	void Test3()
	{
		
		System.out.println("Default Test3 method");
	}
	
	public static void main(String[] args)
	{
		PublicPrivateDefault h = new PublicPrivateDefault();
		h.Test1();
		h.Test3();
       
	}

}
