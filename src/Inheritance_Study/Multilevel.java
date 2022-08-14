package Inheritance_Study;

public class Multilevel {

	public static void main(String[] args) {
		P p = new P();
		p.Laptop();
		p.Mob();
		
		Q q= new Q();
		q.Book();
		q.Cup();
		q.Laptop();
		q.Mob();
		
		R r = new R();
		r.Book();
		r.Maous();
		r.Mob();
		r.Charger();
		r.Cup();
		r.Laptop();
		
	}

}
