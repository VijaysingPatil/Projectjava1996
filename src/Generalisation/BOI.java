package Generalisation;

public class BOI implements RBI{

	@Override
	public void deposite() {
		System.out.println("BOI Deposite ");
		
	}

	@Override
	public void loan() {
		
		System.out.println("BOI Loan ");
	}

	@Override
	public void transfer() {
		System.out.println("BOI Transfer ");
	}

	public void BOIApp() 
	{
		System.out.println("BOI Application ");
	}
}
