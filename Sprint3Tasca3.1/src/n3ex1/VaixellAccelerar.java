package n3ex1;

public class VaixellAccelerar implements AccioVehicle {
	private Vaixell vaixell;

	public VaixellAccelerar(Vaixell vaixell) {

		this.vaixell = vaixell;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.vaixell.accelerar();
	}

}
