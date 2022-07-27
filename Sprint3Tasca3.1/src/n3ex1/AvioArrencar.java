package n3ex1;

public class AvioArrencar implements AccioVehicle {
	private Avio avio;

	public AvioArrencar(Avio avio) {

		this.avio = avio;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.avio.arrencar();
	}

}
