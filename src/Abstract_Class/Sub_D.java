package Abstract_Class;

public class Sub_D extends Abstract_D{

	public static void main(String[] args)
	{
		Sub_D s = new Sub_D();
		s.Vijaysing();
		s.Mayur();
		s.Rohit();
		s.Shivam();
		s.Vaibhav();
		

	}
	{ System.out.println("==============================");}
	@Override
	public void Rohit() 
	{
		System.out.println("My Name is Rohit ");
		
	}

	@Override
	public void Shivam() {
		System.out.println("My Name is Shivam ");
		
	}

	@Override
	public void Vaibhav() {
		System.out.println("My Name is Vaibhav ");
		System.out.println("=======================================");
		
	}

}
