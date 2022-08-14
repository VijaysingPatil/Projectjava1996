package Abstract_Class;

public class CC5 extends P {

	public static void main(String[] args) {
	CC5 p = new CC5();
		p.Power();
		p.Ram();
		p.Ram2();
		p.Mony();
		p.Power();
		
		
		

	}

	@Override
	public void Ram() {
		System.out.println("Ram is my Brother");
		
	}

	@Override
	public void Ram2() {
		System.out.println("Ram2 is Brother ");
		
	}

}
