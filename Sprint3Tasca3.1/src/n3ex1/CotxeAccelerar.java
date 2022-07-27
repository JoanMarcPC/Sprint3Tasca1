package n3ex1;

public class CotxeAccelerar implements AccioVehicle {
	private Cotxe cotxe;

	public CotxeAccelerar(Cotxe cotxe) {

		this.cotxe = cotxe;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.cotxe.accelerar();
	}

}
