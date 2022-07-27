package n3ex1;

public class CotxeFrenar implements AccioVehicle {
	private Cotxe cotxe;

	public CotxeFrenar(Cotxe cotxe) {

		this.cotxe = cotxe;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.cotxe.frenar();
	}

}
