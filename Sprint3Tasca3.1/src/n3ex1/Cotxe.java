package n3ex1;

public class Cotxe extends Vehicle {

	public Cotxe(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrencar() {
		System.out.println("Cotxe arrencant");
	}

	@Override
	public void frenar() {
		System.out.println("Cotxe frenant");
	}

	@Override
	public void accelerar() {
		System.out.println("Cotxe accelerant");
	}
}
