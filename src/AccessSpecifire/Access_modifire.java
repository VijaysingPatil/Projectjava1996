package AccessSpecifire;

public class Access_modifire {

	
		public void Rohit() 
		{
			System.out.println("My Name is Rohit ");
		}
		private void Mayur () 
		{
			System.out.println("My Name is Mayur ");
		}
		protected void  Shivam () 
		{
			System.out.println("My Name is Shivam ");
		}
		void Vaibhav() 
		{
			System.out.println("My Name is Vaibhav ");
		}
		public static void main(String[] args) 
		{
			Access_modifire a= new Access_modifire();
			a.Rohit();
			a.Shivam();
			a.Mayur();
			a.Vaibhav();
		}
			
	}


