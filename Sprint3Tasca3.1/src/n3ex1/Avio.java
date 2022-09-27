package n3ex1;

public class Avio extends Vehicle {
	public Avio(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrencar() {
		System.out.println("Avió arrencant");
	}

	@Override
	public void frenar() {
		System.out.println("Avió frenant");
	}

	@Override
	public void accelerar() {
		System.out.println("Avió accelerant");
	}

}
