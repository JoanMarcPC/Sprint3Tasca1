package n3ex1;

public class AvioFrenar implements AccioVehicle {
	private Avio avio;

	public AvioFrenar(Avio avio) {

		this.avio = avio;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.avio.frenar();
	}

}
