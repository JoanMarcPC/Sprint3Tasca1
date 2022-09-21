package n2ex1;

import java.util.Scanner;

public class ASpanish implements Adress {

	private String adress;

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "Spain";
	}

	@Override
	public void askForAdress() {
		System.out.println("Enter a Spanish Adress (street, number, apartment, zip code, city)");
		Scanner input = new Scanner(System.in);
		this.setAdress(input.nextLine());
		// TODO Auto-generated method stub

	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "ASpanish [adress=" + adress + "]";
	}

}
