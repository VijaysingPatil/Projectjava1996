package Generalisation;

public class Airtel implements TRAI
{
	
	public void msg() 
	{
		System.out.println("100 sms per Day");
	}
	@Override
	public void calls() {
		System.out.println("20 Paise per min");
	}
	@Override
	public void data() {
		System.out.println("1 GB per day");
		
	}
	public void Airtel()
	{
		System.out.println("New method Airtel");
	}

}
