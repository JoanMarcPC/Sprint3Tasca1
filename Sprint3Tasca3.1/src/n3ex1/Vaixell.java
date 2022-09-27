package n3ex1;

public class Vaixell extends Vehicle {

	public Vaixell(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrencar() {
		System.out.println("Vaixell arrencant");
	}

	@Override
	public void frenar() {
		System.out.println("Vaixell frenant");
	}

	@Override
	public void accelerar() {
		System.out.println("Vaixell accelerant");
	}
}
