package n3ex1;

public class Avio extends Vehicle {
	public Avio(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrencar() {
		System.out.println("Avi� arrencant");
	}

	@Override
	public void frenar() {
		System.out.println("Avi� frenant");
	}

	@Override
	public void accelerar() {
		System.out.println("Avi� accelerant");
	}

}
