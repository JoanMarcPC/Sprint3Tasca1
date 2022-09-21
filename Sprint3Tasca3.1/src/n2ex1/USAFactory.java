package n2ex1;

public class USAFactory implements AbstractFactory {

	@Override
	public Telephone createTelephone() {
		// TODO Auto-generated method stub
		TUSA phone = new TUSA();
		do {
			phone.askForNumber();
			;
		} while (!phone.formatCheck());
		return phone;

	}

	@Override
	public Adress createAdress() {
		// TODO Auto-generated method stub
		AUSA adress = new AUSA();
		adress.askForAdress();
		return adress;

	}

}
