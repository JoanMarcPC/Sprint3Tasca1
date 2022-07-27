package n3ex1;

public class AvioAccelerar implements AccioVehicle {
	private Avio avio;

	public AvioAccelerar(Avio avio) {

		this.avio = avio;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.avio.accelerar();
	}

}
