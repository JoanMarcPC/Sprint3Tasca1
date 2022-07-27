package n3ex1;

public class CotxeArrencar implements AccioVehicle {
	private Cotxe cotxe;

	public CotxeArrencar(Cotxe cotxe) {

		this.cotxe = cotxe;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.cotxe.arrencar();
	}

}
