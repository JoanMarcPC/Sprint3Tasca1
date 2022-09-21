package n3ex1;

public class Vehicle {
	private String nom;

	public Vehicle(String nom) {
		super();
		this.nom = nom;
	}

	public void arrencar() {

		switch (this.getClass().getName()) {
		case "n3ex1.Avio":
			System.out.println("Avio arrencant");
			break;
		case "n3ex1.Cotxe":
			System.out.println("Cotxe arrencant");
			break;
		case "n3ex1.Vaixell":
			System.out.println("Vaixell arrencant");
			break;

		}

	}

	public void frenar() {
		switch (this.getClass().getName()) {
		case "n3ex1.Avio":
			System.out.println("Avio frenant");
			break;
		case "n3ex1.Cotxe":
			System.out.println("Cotxe frenant");
			break;
		case "n3ex1.Vaixell":
			System.out.println("Vaixell frenant");
			break;

		}
	}

	public void accelerar() {
		switch (this.getClass().getName()) {
		case "n3ex1.Avio":
			System.out.println("Avio accelerant");
			break;
		case "n3ex1.Cotxe":
			System.out.println("Cotxe accelerant");
			break;
		case "n3ex1.Vaixell":
			System.out.println("Vaixell accelerant");
			break;

		}
	}
}
