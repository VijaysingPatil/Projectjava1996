package Interface_study;

public class Clild implements  Father , Mother {

	@Override
	public void receipe()
	{
		System.out.println("receipe method is complited by Child");
		
	}

	@Override
	public void look() {
		System.out.println("look method is complited by Child");
		
		
	}

	@Override
	public void Mony() {
		System.out.println("Mony method is complited by Child");
		
	}

	@Override
	public void Home()
	{
		System.out.println("Home method is complited by Child");
		
	}

}
