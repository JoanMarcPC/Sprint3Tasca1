package n3ex1;

public class Arrencar implements Command {

	private Vehicle vehicle;

	public Arrencar(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.arrencar();
		// TODO Auto-generated method stub

	}

}
