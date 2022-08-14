package AccessSpecifire;

public class Protected_AccessSpecifire {

	public static void main(String[] args) 
	{
		Protected_AccessSpecifire pn = new Protected_AccessSpecifire();
		pn.test1();
		pn.test2();
		pn.test3();
		pn.test4();
		
		
	}
	public void test1() 
	{
		System.out.println("Public test1 Method ");
	}
	
	private void test2() 
	{
		System.out.println("Private test2 Method ");
	}
	  void test3() 
	  {
		  System.out.println("Default test3 Method");
	  }
	  protected void  test4() 
	  {
		  System.out.println("Protected test4 Method ");
	  }

}
