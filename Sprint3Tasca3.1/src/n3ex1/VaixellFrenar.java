package n3ex1;

public class VaixellFrenar implements AccioVehicle {
	private Vaixell vaixell;

	public VaixellFrenar(Vaixell vaixell) {

		this.vaixell = vaixell;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.vaixell.frenar();
	}

}
