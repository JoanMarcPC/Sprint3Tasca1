package n2ex1;

public class SpanishFactory implements AbstractFactory {

	@Override
	public Telephone createTelephone() {
		// TODO Auto-generated method stub
		TSpanish phone = new TSpanish();
		do {
			phone.askForNumber();
			;
		} while (!phone.formatCheck());
		return phone;
		
	}

	@Override
	public Adress createAdress() {
		// TODO Auto-generated method stub
		ASpanish adress = new ASpanish();
		adress.askForAdress();
		return adress;
	}

}
