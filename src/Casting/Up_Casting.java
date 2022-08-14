package Casting;

public class Up_Casting {

	public static void main(String[] args) {
		Rohit r = new Rohit();
		r.Clevar();
		r.Attitude();
		r.Treking();
		System.out.println("===============================");
		Mayur m = new Mayur();
		m.Clevar();
		m.Attitude();
		System.out.println("===============================");
		Mayur s = new Rohit();
		s.Clevar();
		s.Clevar();
		//s.Trekking();  Mayur and Rohit Method Not Common 

	}

}
