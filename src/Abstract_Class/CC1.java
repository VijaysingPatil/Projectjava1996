package Abstract_Class;

public class CC1 extends B
{

	public static void main(String[] args)
	{
CC1 c = new CC1();
c.test1();
c.test2();
c.test3();
c.test4();
c.test5();

	}

	@Override
	public void test3() 
	{
		
		System.out.println("test3 complitd in CC");
	}

	@Override
	public void test4() {
		System.out.println("test4 comlited in  CC");
		
	}

	@Override
	public void test5() {
		System.out.println("test5 complited in CC");
		
	}

}
