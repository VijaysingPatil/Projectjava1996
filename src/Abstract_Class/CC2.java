package Abstract_Class;

public class CC2 extends Abstract2{

	public static void main(String[] args) {
		CC2 c = new CC2();
		c.Ram();
		c.Rohit();
		c.reema();
		c.Shivam();
		c.Vaibhav();

		
	}

	@Override
	public void Vaibhav() {
		System.out.println("i am Vaibhav");
		
	}

	@Override
	public void reema() {
		
		System.out.println("i am reema");
	}

	@Override
	public void Shivam() {
		System.out.println("i am Shgivam");
		
	}

}
