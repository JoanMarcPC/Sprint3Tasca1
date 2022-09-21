package n3ex1;

public class Accelerar implements Command {
	private Vehicle vehicle;

	public Accelerar(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.vehicle.accelerar();
	}

}
