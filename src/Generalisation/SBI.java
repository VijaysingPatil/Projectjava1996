package Generalisation;

public class SBI implements RBI{

	@Override
	public void deposite() {
		
		System.out.println("SBI Deposite");
	}

	@Override
	public void loan() {
		System.out.println("SBI loan");
	}

	@Override
	public void transfer() {
		System.out.println("SBI transfer");
	}

	public void YunoSBI() 
	{
		System.out.println("SBI Yuno App");
	}

}
