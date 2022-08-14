package Abstract_Class;

public  class CC123 extends Abstract1 {

	public static void main(String[] args) {
		CC123 c = new CC123();
		c.Test();
		c.Test1();
		c.test3();
		c.test4();
		c.test5();
		c.test6();
	}

	@Override
	public void test4() {
		System.out.println("I am test4");
		
	}

	@Override
	public void test5() {
		System.out.println("I am test5");
		
	}

	@Override
	public void test6() {
		System.out.println("I am test6");
		
	}

}
