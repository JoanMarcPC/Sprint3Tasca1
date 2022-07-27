package n3ex1;

public class VaixellArrencar implements AccioVehicle {
	private Vaixell vaixell;

	public VaixellArrencar(Vaixell vaixell) {

		this.vaixell = vaixell;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.vaixell.arrencar();
	}

}
