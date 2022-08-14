package Abstract_Class;

public class ConcreateClass extends AbsClass {

	public static void main(String[] args) {
		ConcreateClass cc  = new ConcreateClass ();
		cc.Ram();
		cc.Rohit();
		cc.Sagar();
		cc.Shivam();

	}

	@Override
	public void Shivam() {
		System.out.println("Shivam is Gov College Student ");
		
	}

	@Override
	public void Sagar() {
	System.out.println("Saga is Police ");
		
	}

}
