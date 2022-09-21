package n3ex1;

public class Frenar implements Command {

	private Vehicle vehicle;

	public Frenar(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.vehicle.frenar();
	}

}
