package Generalisation;

public class Banking {

	public static void main(String[] args)
	{
		SBI s = new SBI ();
		AXIS a = new AXIS();
		BOI b = new BOI ();
		s.deposite();
		s.loan();
		s.transfer();
		s.YunoSBI();
		System.out.println("=====================");
		a.AxisApp();
		a.deposite();
		a.loan();
		a.transfer();
		System.out.println("==========================");
		b.BOIApp();
		b.loan();
		b.deposite();
		b.transfer();
	}

}
