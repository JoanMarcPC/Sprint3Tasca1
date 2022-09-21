package n2ex1;

public class FranceFactory implements AbstractFactory {

	@Override
	public Telephone createTelephone() {
		// TODO Auto-generated method stub
		TFrance phone = new TFrance();
		do {
			phone.askForNumber();
			;
		} while (!phone.formatCheck());
		return phone;
	}

	@Override
	public Adress createAdress() {
		AFrance adress = new AFrance();
		adress.askForAdress();
		return adress;
		// TODO Auto-generated method stub

	}

}
