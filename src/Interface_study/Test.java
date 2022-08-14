package Interface_study;

public class Test implements KiteLogin,KitePinPage,KiteLogout {
	public static void main(String[] args)
	{
		Test t = new Test();
		t.UID();
		t.PASS();
		t.Pin();
		t.Continue();
		t.Userid();
		t.LogOut();
		
	}
	
	@Override
	public void Userid() {
		System.out.println("User id is Rohit@123");
	}

	@Override
	public void LogOut() {
		System.out.println("Click on LogOut Button");
		
	}

	@Override
	public void Pin() {
		System.out.println("Pin is 1996");
		
	}

	@Override
	public void Continue() {
		System.out.println("Click on Continue Button");
		
	}

	@Override
	public void UID() {
		System.out.println("UID is EU2012");
		
	}

	@Override
	public void PASS() {
		System.out.println("Password is Pass@123");
		
	}

}
