package Interface_study;

public class ImplimentetionClass implements laptop,Mobile {

	public static void main(String[] args) {
		ImplimentetionClass i = new ImplimentetionClass();
		//for mobile 
		i.Camera();
		i.RAM();
		//for laptop
		i.Procesor();
		i.Version();
		
	}

	@Override
	public void Camera() {
		System.out.println("Poco m3 Camera is 46 mp");
		
	}

	@Override
	public void RAM() {
		
		System.out.println("Poco m3 RAM is 4 GB");
		System.out.println("===============================");
	}
	

	@Override
	public void Version() {
		System.out.println("Lenovo versoin is window11 ");
		System.out.println("===============================");
	}

	@Override
	public void Procesor() {
		
		System.out.println("Lenovo Processor is 6 bit ");
		
	}

}
