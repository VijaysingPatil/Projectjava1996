package Abstract_Class;

public  class CC extends A       //click on Uniplemennt method  ......step1
{

	public static void main(String[] args)
	{
	     CC c = new CC();
	     c.test1();
	     c.test2();                 //step 2
	     c.test3();
	     c.test4();

	}

	@Override
	public void test3()
	{
		System.out.println("test3 complited in CC");
		
	}

	@Override
	public void test4() {
		System.out.println("test4 complited in CC ");
		
		
	}
	

}
